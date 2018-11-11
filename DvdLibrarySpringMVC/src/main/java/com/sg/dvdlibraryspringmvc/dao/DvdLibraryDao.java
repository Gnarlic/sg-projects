/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibraryspringmvc.dao;

import com.sg.dvdlibraryspringmvc.model.Dvd;
import java.sql.SQLException;
import java.util.List;
import org.springframework.ui.Model;

/**
 *
 * @author Elnic
 */
public interface DvdLibraryDao {
    
    Dvd addDvd(Dvd dvd) throws DvdLibraryDaoException, SQLException;
    
    List<Dvd> getAllDvds() throws DvdLibraryDaoException, SQLException;
    
    Dvd getDvd(int dvdId) throws DvdLibraryDaoException, SQLException;
    
    public void removeDvd(int dvdId) throws DvdLibraryDaoException, SQLException;
    
    public void editDvd(Dvd dvd) throws DvdLibraryDaoException, SQLException;
    
    List<Dvd> getMoviesByTitle(String title) throws DvdLibraryDaoException, SQLException;
    
    List<Dvd> getMoviesByYear(String year) throws DvdLibraryDaoException, SQLException;
    
    List<Dvd> getMoviesByDirector(String director) throws DvdLibraryDaoException, SQLException;
    
    List<Dvd> getMoviesWithRating(String rating) throws DvdLibraryDaoException, SQLException;            
    
    List<Dvd> getMovies(Model model, String string) throws DvdLibraryDaoException, SQLException;
}
