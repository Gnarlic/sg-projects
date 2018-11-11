/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.ui;

import com.sg.dvdlibrary.dto.Dvd;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Elnic
 */
public class DVDLibraryView {
    
    public Dvd getNewDvdInfo() {
        String title = io.readString("Please enter Dvd title");
        String releaseDate = io.readString("Please enter release date (MM/dd/yyy)");
        String mpaaRating = io.readString("Please enter MPAA rating");
        String directorName = io.readString("Please enter director name");
        String studio = io.readString("Please enter studio");
        String userRating = io.readString("Please Enter user rating (1-10)");
        Dvd currentDvd = new Dvd(title);
        currentDvd.setReleaseDate(LocalDate.parse(releaseDate, formatter));
        currentDvd.setDirectorName(directorName);
        currentDvd.setMpaaRating(mpaaRating);
        currentDvd.setUserRating(userRating);
        currentDvd.setStudio(studio);
        return currentDvd;
    }
    
    public Dvd editDvd(Dvd editDvd) {
        boolean editContinue = true;
        int userChoice;
        String title;
        String releaseDate;
        String mpaaRating;
        String directorName;
        String studio;
        String userRating;
        
        
        while (editContinue) {
                    
                     io.print("0. Title");
                     io.print("1. Release Date");
                     io.print("2. MPAA Rating");
                     io.print("3. Director Name");
                     io.print("4. Studio");
                     io.print("5. User Rating");
                     io.print("6. Exit Editing Menu");
                userChoice = io.readInt("Please choose an editing option from the list: ", 0, 6);
            switch (userChoice) {
                case 0:
                    title = io.readString("Please enter the new title: ");
                    editDvd.setTitle(title);
                    io.print("Title Changed.");
                    break;
                case 1:
                    releaseDate = io.readString("Please Enter the new release date: ");
                    editDvd.setReleaseDate(LocalDate.parse(releaseDate, formatter));
                    io.print("Release date changed.");
                    break;
                case 2:
                    mpaaRating = io.readString("Please enter the new MPAA rating: ");
                    editDvd.setMpaaRating(mpaaRating);
                    io.print("MPAA rating changed.");
                    break;
                case 3:
                    directorName = io.readString("Please enter the new director: ");
                    editDvd.setDirectorName(directorName);
                    io.print("Director name changed.");
                    break;
                case 4:
                    studio = io.readString("Please enter the new studio: ");
                    editDvd.setStudio(studio);
                    io.print("Studio name changed.");
                    break;
                case 5:
                    userRating = io.readString("Please enter a new User Rating: ");
                    editDvd.setUserRating(userRating);
                    io.print("User Rating changed.");
                    break;
                case 6:
                    editContinue = false;
                    break;
                default:
                    io.print("Invalid option. Please choose a menu choice.");
                    break;
            }
            
        }
       
        return editDvd;
        
        
    }
    
    public void displayAddDvdBanner() {
        io.print("=== Add DVD ===");
    }
    
    public void displayAddSuccessBanner() {
        io.readString(
            "DVD successfully added. Please hit enter to continue.");
    }
    
    public void displayDvdList(List<Dvd> dvdList) {
        for (Dvd currentDvd : dvdList) {
            io.print(currentDvd.getTitle() + " ");
        }
        io.readString("Please hit enter to continue.");
    }
    
    public void displayDisplayAllBanner() {
        io.print("=== Display All DVDs ===");
    }
    
    public void displayDisplayDvdBanner() {
        io.print("=== Display DVD ===");
    }
    
    public String getDvdTitleChoice() {
        return io.readString("Please enter the Dvd Title");
    }
    
    public void displayDvd(Dvd title) {
        if (title != null) {
            
            LocalDate date = title.getReleaseDate();
            String release = date.format(formatter);
            io.print("\nTitle: " + title.getTitle());
            io.print("Release Date: " + release);
            io.print("Director: " + title.getDirectorName());
            io.print("MPAA Rating: " + title.getMpaaRating());
            io.print("Studio: " + title.getStudio());
            io.print("User Rating: " + title.getUserRating());
            io.print("");
        } else {
            io.print("No such Title");
        }
        io.readString("Please hit enter to continue");
    }
    
    public void displayEditDvdBanner() {
        io.print("=== Edit DVD ===");
    }
    
    public void displayEditSuccessBanner() {
        io.print("DVD edit successful. Please hit enter to continue.");
    }
    
    public void displayRemoveDvdBanner() {
        io.print("=== Remove DVD ===");
    }
    
    public void displayRemoveSuccessBanner() {
        io.readString("DVD successfully removed. Please hit enter to continue.");
    }
    
    public void displayExitBanner() {
        io.print("Good Bye!!!");
    }
    
    public void displayUnkownCommandBanner() {
        io.print("Unknown Command!");
    }
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyy");
    
    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List DVDs");
        io.print("2. Add DVD");
        io.print("3. View a DVD");
        io.print("4. Edit DVD");
        io.print("5. Remove DVD");
        io.print("6. Exit");
        io.print("7. List Movies In the Last Number Of Years");
        io.print("8. List Movies of Certain Rating");
        io.print("9. List Movies by Certain Director");
        io.print("10. List Movies by Studio");
        io.print("11. Average Age of Dvd Library");
        io.print("12. Get Newest Movie in Collection");
        io.print("13. Get Oldest Movie in Collection");
        
            return io.readInt("Please select from the above choice.", 1, 13);
    }
    
    private UserIO io;
    
    public DVDLibraryView(UserIO io) {
        this.io = io;
    }
    
    public void displayErrorMessage(String errorMsg) {
        io.print("=== Error ===");
        io.print(errorMsg);
    }

    public void displayLibraryAverageAge(double average) {
        io.print("The average age of all titles in library is " + average + ".");
    }

    public String getDirector() {
        return io.readString("Enter the name of the Director:");
    }

    public void displayMoviesFromDirector(String director, Map<String, List<Dvd>> moviesOfDirector) {
        io.print("Movies directed by " + director + ":");
        Set<String> ratings = moviesOfDirector.keySet();
        ratings.stream()
                .forEach(rating -> {
                    io.print("Film Rating:" + rating);
                    moviesOfDirector.get(rating).stream().forEach(movie -> io.print(movie.getTitle() + "(" + movie.getReleaseDate().format(DateTimeFormatter.ofPattern("yyyy")) + ")"));
                });
      
    }

    public String getStudio() {
        return io.readString("Enter Studio name:");
    }

    public int getYear() {
        return io.readInt("Please enter the number of years back to list movies from:");
    }

    public void displayMoviesInLastNumberOfYears(int moviesSince, List<Dvd> moviesInLastNYears) {
        io.print("DVDS in the last " + moviesSince + " years:");
        moviesInLastNYears.stream()
                .forEach(m -> io.print(m.getTitle()
                + "(" + m.getReleaseDate().format(DateTimeFormatter.ofPattern("MM/dd/yyy")) + ")" + " "
                + m.getUserRating() + " "
                + m.getMpaaRating() + " "
                + m.getDirectorName() + " "
                + m.getStudio() + " "
                + m.getUserRating()));
       
    }

    public String getRating() {
        return io.readString("Please enter Rating of movies to list:");
    }

    public void displayMoviesOfRating(String rating, List<Dvd> moviesOfRating) {
        io.print("Dvds rated " + rating);
        moviesOfRating.stream()
                .forEach(m -> io.print(m.getTitle()
                + "(" + m.getReleaseDate().format(DateTimeFormatter.ofPattern("MM/dd/yyyy")) + ")" + " "
                + m.getUserRating() + " "
                + m.getMpaaRating() + " "
                + m.getDirectorName() + " "
                + m.getStudio() + " "
                + m.getUserRating()));
    
    }
    
    public void pressEnter() {
        io.readString("Press enter to continue");
    }

    public void displayMoviesFromStudio(String studio, List<Dvd> moviesOfStudio) {
        io.print("Dvds from Studio: " + studio);
        moviesOfStudio.stream()
                .forEach(m -> io.print(m.getTitle()
                + "(" + m.getReleaseDate().format(DateTimeFormatter.ofPattern("MM/dd/yyyy")) + ")" + " "
                + m.getUserRating() + " "
                + m.getMpaaRating() + " "
                + m.getDirectorName() + " "
                + m.getStudio() + " "
                + m.getUserRating()));
    }

    
}
