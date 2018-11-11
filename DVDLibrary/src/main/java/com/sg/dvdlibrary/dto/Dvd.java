/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.dto;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Elnic
 */
public class Dvd {
    
    private String title;
    private LocalDate releaseDate;
    private String mpaaRating;
    private String directorName;
    private String studio;
    private String userRating;
    
    public Dvd(String title) {
        this.title = title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public LocalDate getReleaseDate() {
        return releaseDate;
    }
    
    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
    
    public String getMpaaRating() {
        return mpaaRating;
    }
    
    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }
    
    public String getDirectorName() {
        return directorName;
    }
    
    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }
    
    public String getStudio() {
        return studio;
    }
    
    public void setStudio(String studio) {
        this.studio = studio;
    }
    
    public String getUserRating() {
        return userRating;
    }
    
    public void setUserRating(String userRating) {
        this.userRating = userRating;
    }
    
    public String getTitle() {
        return title;
    }
    
    public long getAgeOfDvd() {
        Period p = releaseDate.until(LocalDate.now());
        return p.getYears();
    }
    
}
