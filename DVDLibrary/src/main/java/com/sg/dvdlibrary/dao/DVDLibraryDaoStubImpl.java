/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.dao;

import com.sg.dvdlibrary.dto.Dvd;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Elnic
 */
public class DVDLibraryDaoStubImpl implements DVDLibraryDao{
    
    Dvd dvd;
    List<Dvd> dvdList = new ArrayList<>();
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    
    public DVDLibraryDaoStubImpl() {
        
        dvd = new Dvd("Glengarry Glen Ross");
        dvd.setTitle("Glengarry Glen Ross");
        dvd.setReleaseDate(LocalDate.parse("10/02/1992", formatter));
        dvd.setDirectorName("James Foley");
        dvd.setMpaaRating("R");
        dvd.setUserRating("7");
        dvd.setStudio("New Line Cinema");
        
        dvdList.add(dvd);
        
    }

    @Override
    public Dvd addTitle(String title, Dvd dvdLibary) throws DVDLibraryDaoException {
        if (title.equals(dvd.getTitle())) {
            return dvd;
        } else {
            return null;
        }
    }

    @Override
    public List<Dvd> listAllDvds() throws DVDLibraryDaoException {
        return dvdList;
    }

    @Override
    public Dvd getDvd(String title) throws DVDLibraryDaoException {
        if(title.equals(dvd.getTitle())) {
            return dvd;
        } else {
            return null;
        }
    }

    @Override
    public Dvd editDvd(String title, Dvd dvdLibrary) throws DVDLibraryDaoException {
        if(title.equals(dvd.getTitle())) {
            return dvd;
        } else {
            return null;
        }
    }

    @Override
    public Dvd removeDvd(String title) throws DVDLibraryDaoException {
        if (title.equals(dvd.getTitle())) {
            return dvd;
        } else {
            return null;
        }
    }

    @Override
    public List<Dvd> getMoviesInLastNYears(int number) throws DVDLibraryDaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Dvd> getMoviesOfRating(String rating) throws DVDLibraryDaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map<String, List<Dvd>> getMoviesOfDirector(String director) throws DVDLibraryDaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Dvd> getMoviesOfStudio(String studio) throws DVDLibraryDaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getAverageAge() throws DVDLibraryDaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dvd getNewestMovie() throws DVDLibraryDaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dvd getOldestMovie() throws DVDLibraryDaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getAverageRating() throws DVDLibraryDaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
