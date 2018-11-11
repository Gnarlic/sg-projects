/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.dao;

import static com.sg.dvdlibrary.dao.DVDLibraryDaoFileImpl.DVD_FILE;
import com.sg.dvdlibrary.dto.Dvd;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Elnic
 */
public class DVDLibraryDaoFileImpl implements DVDLibraryDao {
    
    private Map<String, Dvd> dvds = new HashMap<>();
    public static final String DVD_FILE = "dvdlist.txt";
    public static final String DELIMITER = "::";
    
    

    @Override
    public Dvd addTitle(String title, Dvd dvdLibrary) throws DVDLibraryDaoException {
        Dvd newTitle = dvds.put(title, dvdLibrary);
        writeLibrary();
        return newTitle;
    }

    @Override
    public List<Dvd> listAllDvds() throws DVDLibraryDaoException {
        loadLibrary();
        return new ArrayList<Dvd>(dvds.values());
    }

    @Override
    public Dvd getDvd(String title) throws DVDLibraryDaoException {
        loadLibrary();
        return dvds.get(title);
    }
    
    @Override
    public Dvd editDvd(String title, Dvd dvdLibrary) throws DVDLibraryDaoException {
        loadLibrary();
        Dvd editDvd = dvds.get(title);
        if (editDvd != null) {
            dvds.remove(editDvd.getTitle());
            dvds.put(dvdLibrary.getTitle(), dvdLibrary);
        }
        writeLibrary();
        return dvdLibrary;
    }

    @Override
    public Dvd removeDvd(String title) throws DVDLibraryDaoException {
       Dvd removedDvd = dvds.remove(title);
       writeLibrary();
       return removedDvd;
    }
    
    private void loadLibrary() throws DVDLibraryDaoException {
        Scanner scanner;
        
        try {
            scanner = new Scanner(
            new BufferedReader(
                new FileReader(DVD_FILE)));
            } catch (FileNotFoundException e) {
                    throw new DVDLibraryDaoException(
                    "Could not load dvd list into memory", e);
            }
               
        String currentLine;
        String[] currentTokens;
        
        while (scanner.hasNextLine()) {
            currentLine = scanner.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            Dvd currentDvd = new Dvd(currentTokens[0]);
            currentDvd.setDirectorName(currentTokens[1]);
            currentDvd.setMpaaRating(currentTokens[2]);
            currentDvd.setReleaseDate(LocalDate.parse(currentTokens[3]));
            currentDvd.setStudio(currentTokens[4]);
            currentDvd.setUserRating(currentTokens[5]);
            dvds.put(currentDvd.getTitle(), currentDvd);
        }
        scanner.close();
    }
    
    private void writeLibrary() throws DVDLibraryDaoException {
        PrintWriter out;
        
        try {
            out = new PrintWriter(new FileWriter(DVD_FILE, true));
        } catch (IOException e) {
            throw new DVDLibraryDaoException("Could not save Dvd info.", e);
        }
        
        List<Dvd> dvdList = this.listAllDvds();
        for (Dvd currentDvd : dvdList) {
            out.println(currentDvd.getTitle() + DELIMITER
                +currentDvd.getDirectorName() + DELIMITER
                +currentDvd.getMpaaRating() + DELIMITER
                +currentDvd.getReleaseDate() + DELIMITER
                +currentDvd.getStudio() + DELIMITER
                +currentDvd.getUserRating());
            out.flush();
        }
        
        out.close();
    }

    @Override
    public List<Dvd> getMoviesInLastNYears(int number) throws DVDLibraryDaoException {
        loadLibrary();
        return dvds.values()
                .stream()
                .filter(m -> m.getReleaseDate().isAfter(LocalDate.now().minusYears(number)))
                .collect(Collectors.toList());
    }

    @Override
    public List<Dvd> getMoviesOfRating(String rating) throws DVDLibraryDaoException {
        loadLibrary();
        return dvds.values()
                .stream()
                .filter(m -> m.getMpaaRating().equalsIgnoreCase(rating))
                .collect(Collectors.toList());
    }

    @Override
    public Map<String, List<Dvd>> getMoviesOfDirector(String director) throws DVDLibraryDaoException {
        loadLibrary();
        return dvds.values()
                .stream()
                .filter(m -> m.getDirectorName().equalsIgnoreCase(director))
                .collect(Collectors.groupingBy(Dvd::getMpaaRating));
    }

    @Override
    public List<Dvd> getMoviesOfStudio(String studio) throws DVDLibraryDaoException {
        loadLibrary();
        return dvds.values()
                .stream()
                .filter(m -> m.getStudio().equalsIgnoreCase(studio))
                .collect(Collectors.toList());
    }

    @Override
    public double getAverageAge() throws DVDLibraryDaoException {
        loadLibrary();
        return dvds.values()
                .stream()
                .mapToLong(m -> m.getReleaseDate().until(LocalDate.now(), ChronoUnit.YEARS))
                .average()
                .getAsDouble();
    }

    @Override
    public Dvd getNewestMovie() throws DVDLibraryDaoException {
        loadLibrary();
        return dvds.values()
                .stream()
                .max(Comparator.comparing(Dvd::getReleaseDate))
                .get();
    }

    @Override
    public Dvd getOldestMovie() throws DVDLibraryDaoException {
        loadLibrary();
        return dvds.values()
                .stream()
                .min(Comparator.comparing(Dvd::getReleaseDate))
                .get();
    }

    @Override
    public double getAverageRating() throws DVDLibraryDaoException {
        return dvds.values()
                .stream()
                .mapToLong(m -> m.getAgeOfDvd())
                .average()
                .getAsDouble();
    }

    
}
