/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main.java.com.sg.statecapitals2;

/**
 *
 * @author Elnic
 */
public class Capital {
    
    private String name;
    private int population;
    private double sqMileage;
    
    public Capital(String name, int population, double sqMileage) {
        this.name = name;
        this.population = population;
        this.sqMileage = sqMileage;
        
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getPopulation() {
        return population;
    }
    
    public void setPopulation(int population) {
        this.population = population;
    }
    
    public double getSqMileage() {
        return sqMileage;
    }
    
    public void setSqMileage(double sqMileage) {
        this.sqMileage = sqMileage;
    }
    
    public Capital() {
        
    }
}

