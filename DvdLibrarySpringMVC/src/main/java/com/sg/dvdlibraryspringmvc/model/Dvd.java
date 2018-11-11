/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package com.sg.dvdlibraryspringmvc.model;

import java.util.Objects;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

/**
 *
 * @author Elnic
 */
public class Dvd {

    private int dvdId;
    @NotEmpty(message = "Title is required.")
    @Size(max = 60, message = "Title must be between 1 and 60 characters")
    private String title;
    @NotNull(message = "Year is required.")
    //@RequiredDigits(value=4, message = "Year must be 4 digits long.") -- n/a right now
    private int date;
    @NotEmpty(message = "Mpaa rating is required.")
    private String mpaaRating;
    @NotEmpty(message = "Director name is required.")
    @Length(max = 40, message = "Director name must be 40 characters or less.")
    private String director;
    private String studio;
    @Length(max = 40, message = "must be 40 characters or less")
    private String userRating;

    public Dvd(int dvdId) {
        this.dvdId = dvdId;
    }

    public Dvd() {
    }

    public int getDvdId() {
        return dvdId;
    }

    public void setDvdId(int dvdId) {
        this.dvdId = dvdId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(String rating) {
        this.mpaaRating = rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.dvdId;
        hash = 79 * hash + Objects.hashCode(this.title);
        hash = 79 * hash + Objects.hashCode(this.date);
        hash = 79 * hash + Objects.hashCode(this.mpaaRating);
        hash = 79 * hash + Objects.hashCode(this.director);
        hash = 79 * hash + Objects.hashCode(this.studio);
        hash = 79 * hash + Objects.hashCode(this.userRating);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dvd other = (Dvd) obj;
        if (this.dvdId != other.dvdId) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (!Objects.equals(this.mpaaRating, other.mpaaRating)) {
            return false;
        }
        if (!Objects.equals(this.director, other.director)) {
            return false;
        }
        if (!Objects.equals(this.studio, other.studio)) {
            return false;
        }
        if (!Objects.equals(this.userRating, other.userRating)) {
            return false;
        }
        return true;
    }

}
