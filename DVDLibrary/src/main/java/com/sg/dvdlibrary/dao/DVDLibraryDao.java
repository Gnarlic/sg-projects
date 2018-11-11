/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.dao;

import com.sg.dvdlibrary.dto.Dvd;
import java.util.List;
import java.util.Map;


/**
 *
 * @author Elnic
 */
public interface DVDLibraryDao {
    
    /**
     * Adds the given DVD to the library and associates it with the
     * title. If there is already DVD associated with the given title it will return that DVD, otherwise it will return null.
     * 
     * @param title identifier with which the DVD is to be associated
     * @param dvdLibrary dvd to be added to the library
     * @return the dvd object associated with the given title.
     * 
     */
    Dvd addTitle(String title, Dvd dvdLibary)
            throws DVDLibraryDaoException;
    
    /**
     * Returns a String array containing the titles of all dvds in the library.
     * 
     * @return String array containing the titles of all the dvds in the library.
     * @throws DVDLibraryDaoException 
     */
    
    List<Dvd>  listAllDvds()
            throws DVDLibraryDaoException;
    
    /**
     * Returns the dvd object associated with the title.
     * Returns null if no such dvd exists.
     * 
     * @param title title of the movie to retrieve.
     * @return the Dvd object associated with the given title.
     * null if no such student exists.
     * @throws DVDLibraryDaoException 
     */
    
    Dvd getDvd(String title)
            throws DVDLibraryDaoException;
    
    /**
     * Enters new values for the variables within the dvd object.
     * returns updated dvd object.
     * 
     * @param title the title of the dvd object to be edited.
     * @param dvdLibrary the dvd object that will have the values
     * within the object
     * @return the dvd object with updated information.
     * @throws DVDLibraryDaoException 
     */
    
    Dvd editDvd(String title, Dvd dvdLibrary)
            throws DVDLibraryDaoException;
    
    /**
     * Removes the dvd object and associated title from the library.
     * returns the dvd object being removed.
     * 
     * @param title title of the dvd to be removed.
     * @return dvd object that was removed or null if no student
     * @throws DVDLibraryDaoException 
     */
    
    Dvd removeDvd(String title)
            throws DVDLibraryDaoException;
    
    List<Dvd> getMoviesInLastNYears(int number)
            throws DVDLibraryDaoException;
    
    List<Dvd> getMoviesOfRating(String rating)
            throws DVDLibraryDaoException;
    
    Map<String, List<Dvd>> getMoviesOfDirector(String director)
            throws DVDLibraryDaoException;
    
    List<Dvd> getMoviesOfStudio(String studio)
            throws DVDLibraryDaoException;
    
    double getAverageAge()
            throws DVDLibraryDaoException;
    
    Dvd getNewestMovie()
            throws DVDLibraryDaoException;
    
    Dvd getOldestMovie()
            throws DVDLibraryDaoException;
    
    double getAverageRating()
            throws DVDLibraryDaoException;
    
}
