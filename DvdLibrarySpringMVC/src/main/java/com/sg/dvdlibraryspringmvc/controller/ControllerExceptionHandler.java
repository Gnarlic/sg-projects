/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibraryspringmvc.controller;

import com.sg.dvdlibraryspringmvc.dao.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Elnic
 */
public class ControllerExceptionHandler {
    @ExceptionHandler(UpdateException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public ModelAndView processUpdateException(UpdateException e) {
        ModelAndView mav = new ModelAndView();
        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setMessage(e.getMessage());
        mav.addObject("errorMessage", errorMessage);
        mav.setViewName("index");
        return mav;
    }
}
