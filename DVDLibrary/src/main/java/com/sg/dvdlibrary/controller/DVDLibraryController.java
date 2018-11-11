/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.controller;

import com.sg.dvdlibrary.dao.DVDLibraryDao;
import com.sg.dvdlibrary.dao.DVDLibraryDaoException;
import com.sg.dvdlibrary.dto.Dvd;
import com.sg.dvdlibrary.ui.DVDLibraryView;
import java.util.List;

/**
 *
 * @author Elnic
 */
public class DVDLibraryController {
    
    DVDLibraryView view;
    DVDLibraryDao dao;
    
    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        try {
            while (keepGoing) {
                
                menuSelection = getMenuSelection();
                
                switch(menuSelection) {
                    case 1:
                        listAllDvds();
                        break;
                    case 2:
                        addTitle();
                        break;
                    case 3:
                        getDvd();
                        break;
                    case 4:
                        editDvd();
                        break;
                    case 5:
                        removeDvd();
                        break;
                    case 6:
                        keepGoing = false;
                        break;
                    case 7:
                        getMoviesSinceN();
                        break;
                    case 8:
                        getMoviesWithRating();
                        break;
                    case 9:
                        getMoviesByDirector();
                        break;
                    case 10:
                        getMoviesFromStudio();
                        break;
                    case 11:
                        getAverageAgeOfMovies();
                        break;
                    case 12:
                        getNewestMovies();
                        break;
                    case 13:
                        getOldestMovies();
                        break; 
                    default:
                        unknownCommand();
                        break;
                }
            }
            exitMessage();
        } catch (DVDLibraryDaoException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }
    
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    
    private void addTitle() throws DVDLibraryDaoException {
        view.displayAddDvdBanner();
        Dvd newTitle = view.getNewDvdInfo();
        dao.addTitle(newTitle.getTitle(), newTitle);
        view.displayAddSuccessBanner();
    }   
        
    private void listAllDvds() throws DVDLibraryDaoException {
        view.displayDisplayAllBanner();
        List<Dvd> dvdLibrary = dao.listAllDvds();
        view.displayDvdList(dvdLibrary);
    }
    
    private void getDvd() throws DVDLibraryDaoException {
        view.displayDisplayDvdBanner();
        String title = view.getDvdTitleChoice();
        Dvd dvdLibrary = dao.getDvd(title);
        view.displayDvd(dvdLibrary);
    }
    
    private void editDvd() throws DVDLibraryDaoException {
        view.displayEditDvdBanner();
        String title = view.getDvdTitleChoice();
        Dvd editDvd = dao.getDvd(title);
        if (editDvd != null) {
            editDvd = view.editDvd(editDvd);
            dao.editDvd(title, editDvd);
        }        
        view.displayEditSuccessBanner();
    }
    
    private void removeDvd() throws DVDLibraryDaoException {
        view.displayRemoveDvdBanner();
        String title = view.getDvdTitleChoice();
        dao.removeDvd(title);
        view.displayRemoveSuccessBanner();
    }
    
    private void unknownCommand() {
        view.displayUnkownCommandBanner();
    }
    
    private void exitMessage() {
        view.displayExitBanner();
    }
    
    public DVDLibraryController(DVDLibraryDao dao, DVDLibraryView view) {
        this.dao = dao;
        this.view = view;
    }

    private void getMoviesSinceN() throws DVDLibraryDaoException{
        view.displayDisplayDvdBanner();
        int moviesSince = view.getYear();
        view.displayMoviesInLastNumberOfYears(moviesSince, dao.getMoviesInLastNYears(moviesSince));
        view.pressEnter();
    }

    private void getMoviesWithRating() throws DVDLibraryDaoException{
        view.displayDisplayDvdBanner();
        String rating = view.getRating();
        view.displayMoviesOfRating(rating, dao.getMoviesOfRating(rating));
        view.pressEnter();
    }

    private void getMoviesByDirector() throws DVDLibraryDaoException {
        view.displayDisplayDvdBanner();
        String director = view.getDirector();
        view.displayMoviesFromDirector(director, dao.getMoviesOfDirector(director));
        view.pressEnter();
    }

    private void getMoviesFromStudio() throws DVDLibraryDaoException {
        view.displayDisplayDvdBanner();
        String studio = view.getStudio();
        view.displayMoviesFromStudio(studio, dao.getMoviesOfStudio(studio));
        view.pressEnter();
    }

    private void getAverageAgeOfMovies() throws DVDLibraryDaoException {
        double average = dao.getAverageAge();
        view.displayLibraryAverageAge(average);
        view.pressEnter();
    }

    private void getNewestMovies() throws DVDLibraryDaoException {
        view.displayDisplayDvdBanner();
        Dvd newestDvd = dao.getNewestMovie();
        view.displayDvd(newestDvd);

    }

    private void getOldestMovies() throws DVDLibraryDaoException {
        view.displayDisplayDvdBanner();
        Dvd oldestDvd = dao.getOldestMovie();
        view.displayDvd(oldestDvd);
  
    }
    
}
