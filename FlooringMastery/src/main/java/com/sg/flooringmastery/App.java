/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery;

import com.sg.flooringmastery.controller.FlooringMasteryController;
import com.sg.flooringmastery.dao.FlooringMasteryDaoPersistenceException;
import com.sg.flooringmastery.dao.NoOrderException;
import com.sg.flooringmastery.dao.OrderDao;
import com.sg.flooringmastery.dao.OrderDaoImpl;
import com.sg.flooringmastery.dao.ProductDao;
import com.sg.flooringmastery.dao.ProductDaoImpl;
import com.sg.flooringmastery.dao.TaxDao;
import com.sg.flooringmastery.dao.TaxDaoImpl;
import com.sg.flooringmastery.service.InvalidInputException;
import com.sg.flooringmastery.service.ServiceLayer;
import com.sg.flooringmastery.service.ServiceLayerImpl;
import com.sg.flooringmastery.ui.FlooringMasteryView;
import com.sg.flooringmastery.ui.UserIO;
import com.sg.flooringmastery.ui.UserIOConsoleImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Elnic
 */
public class App {
    public static void main(String[] args) throws FlooringMasteryDaoPersistenceException, NoOrderException, InvalidInputException {

        
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        FlooringMasteryController controller = ctx.getBean("controller", FlooringMasteryController.class);
        controller.run();
    }
}
