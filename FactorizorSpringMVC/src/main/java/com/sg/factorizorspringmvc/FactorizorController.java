/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.factorizorspringmvc;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Elnic
 */
@Controller
public class FactorizorController {
    
    @RequestMapping(value="/factorNumber", 
                    method=RequestMethod.POST)
    public String factorNumber(HttpServletRequest request, 
                               Map<String, Object> model) {
        String numberToFactor = 
                request.getParameter("numberToFactor");
        model.put("numberToFactor", numberToFactor);
        return "result";
    }
    
}
