/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibraryspringmvc.controller;

/**
 *
 * @author Elnic
 */
public class UpdateException extends Exception {
    public UpdateException(String message) {
        super(message);
    }
    
    public UpdateException(String message, Throwable cause) {
        super(message, cause);
    }
}