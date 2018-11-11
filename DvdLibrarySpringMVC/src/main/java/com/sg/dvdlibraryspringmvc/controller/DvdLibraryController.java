/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibraryspringmvc.controller;

import com.sg.dvdlibraryspringmvc.dao.DvdLibraryDao;
import com.sg.dvdlibraryspringmvc.dao.DvdLibraryDaoException;
import com.sg.dvdlibraryspringmvc.model.Dvd;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE_USE;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;
import java.sql.SQLException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import javax.validation.Valid;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Elnic
 */
@Controller
public class DvdLibraryController {

    DvdLibraryDao dao;

    @Inject
    public DvdLibraryController(DvdLibraryDao dao) {
        this.dao = dao;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String displayDvds(Model model) throws DvdLibraryDaoException, SQLException {

        List<Dvd> dvds = dao.getAllDvds();
        model.addAttribute("dvdList", dvds);

        return "index";
    }

    @RequestMapping(value = "/createdvdpage", method = RequestMethod.GET)
    public String createDvdPage(Model model) {
        model.addAttribute("dvd", new Dvd());
        return "createdvd";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createDvd(@Valid @ModelAttribute("dvd") Dvd dvd, BindingResult result, Model model) throws DvdLibraryDaoException, SQLException, BadSqlGrammarException {
        if (result.hasErrors()) {
            return "createdvd";
        } else {
            int length = String.valueOf(dvd.getDate()).length();
            if (length < 4 | length > 4) {
                model.addAttribute("errorMessage", "Year must be 4 digits.");
                return "createdvd";
            } else {
                dao.addDvd(dvd);
                return "redirect:/";
            }
        }
    }

    @RequestMapping(value = "/editPage", method = RequestMethod.GET)
    public String editDvdPage(HttpServletRequest request, Model model) throws DvdLibraryDaoException, SQLException, UpdateException {
        String dvdIdString = request.getParameter("dvdId");
        int dvdId = Integer.parseInt(dvdIdString);
        Dvd dvd = dao.getDvd(dvdId);
        if (dvd == null) {
            throw new UpdateException("Dvd does not exist in database.");
        }
        model.addAttribute("dvd", dvd);
        return "editdvd";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String editDvd(@Valid @ModelAttribute("dvd") Dvd dvd, BindingResult result, Model model) throws DvdLibraryDaoException, SQLException {
        if (result.hasErrors()) {
            return "editdvd";
        }
        int length = String.valueOf(dvd.getDate()).length();
        if (length < 4 | length > 4) {
            model.addAttribute("errorMessage", "Year must be 4 digits.");
            return "editdvd";
        }
        dao.editDvd(dvd);
        return "redirect:/";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteDvd(HttpServletRequest request) throws DvdLibraryDaoException, SQLException {
        String dvdIdString = request.getParameter("dvdId");
        int dvdId = Integer.parseInt(dvdIdString);
        dao.removeDvd(dvdId);
        return "redirect:/";
    }

    @RequestMapping(value = "/searchDvds", method = RequestMethod.GET)
    public String searchDvds(HttpServletRequest request, Model model) throws DvdLibraryDaoException, SQLException {
        String searchTerm = request.getParameter("searchTerm");
        String searchCategory = request.getParameter("searchCategory");
        model.addAttribute("placeholder", searchTerm);
        if (searchTerm.equals("") || searchCategory.equals("")) {
            model.addAttribute("errorMessage", "<div class=\" alert alert-danger\">Please Try Again.</div>");
            model.addAttribute("dvdSearchResult", dao.getAllDvds());
            return "searchresults";
        }
        try {
            switch (searchCategory) {
                case "Title":
                    model.addAttribute("dvdSearchResult", dao.getMoviesByTitle(searchTerm));
                    if(dao.getMoviesByTitle(searchTerm).isEmpty()) {
                        model.addAttribute("errorMessage", "No movies with that Title.");
                    }
                    return "searchresults";

                case "DirectorName":
                    model.addAttribute("dvdSearchResult", dao.getMoviesByDirector(searchTerm));
                    if(dao.getMoviesByDirector(searchTerm).isEmpty()) {
                        model.addAttribute("errorMessage", "No movies by that Director.");
                    }
                    return "searchresults";

                case "ReleaseYear":
                    model.addAttribute("dvdSearchResult", dao.getMoviesByYear(searchTerm));
                    if(dao.getMoviesByYear(searchTerm).isEmpty()) {
                        model.addAttribute("errorMessage", "No movies from that year.");
                    }
                    return "searchresults";

                case "Rating":
                    model.addAttribute("dvdSearchResult", dao.getMoviesWithRating(searchTerm));
                    if(dao.getMoviesWithRating(searchTerm).isEmpty()) {
                        model.addAttribute("errorMessage", "No movies with that rating.");
                    }
                    return "searchresults";
                default:
                    return "searchresults";
            }
        } catch (SQLException | BadSqlGrammarException e) {
            model.addAttribute("errorMessage", "<div class=\" alert alert-danger\">Please Try Again.</div>");
            return "searchresults";
        }

    }
}

/**
 * custom validator annotation - doesn't work at the moment
 *
 * @Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
 * @Retention(RUNTIME)
 * @Documented
 * @Constraint(validatedBy = {RequiredDigitsImpl.class}) public @interface
 * RequiredDigits {
 *
 * String message() default "Year must be 4 digits long.";
 *
 * Class<?>[] groups() default {};
 *
 * Class<? extends Payload>[] payload() default {};
 *
 * int value();
 *
 * @Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
 * @Retention(RUNTIME)
 * @Documented
 * @interface List { RequiredDigits[] value(); }
 *
 * }
 *
 * private class RequiredDigitsImpl implements
 * ConstraintValidator<RequiredDigits, Integer> {
 *
 * protected int integer;
 *
 * @Override public void initialize(RequiredDigits a) { this.integer =
 * a.value(); }
 *
 * @Override public boolean isValid(Integer date, ConstraintValidatorContext
 * context) { if (date == null || date < 1000 || date > 9999) { return false; }
 * return true; }
 *
 * }
 *
 */
