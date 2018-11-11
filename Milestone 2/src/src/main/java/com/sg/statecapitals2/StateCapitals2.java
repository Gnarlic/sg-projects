/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main.java.com.sg.statecapitals2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Elnic
 */
public class StateCapitals2 {
    
    private Map<String, Capital> stateCapital = new HashMap<>();
    
    public StateCapitals2() {
        stateCapital.put("Alabama", new Capital("Montgomery", 205674, 155.4));
        stateCapital.put("Alaska", new Capital("Juneau", 31275, 2716.7));
        stateCapital.put("Arizona", new Capital("Phoenix", 1445632, 474.9));
        stateCapital.put("Arkansas", new Capital("Little Rock", 193524, 116.2));
        stateCapital.put("California", new Capital("Sacramento", 466488, 97.2));
        stateCapital.put("Colorado", new Capital("Denver", 600158, 153.4));
        stateCapital.put("Connecticut", new Capital("Hartford", 124775, 17.3));
        stateCapital.put("Delaware", new Capital("Dover", 36047, 22.4));
        stateCapital.put("Florida", new Capital("Tallahassee", 181412, 95.7));
        stateCapital.put("Georgia", new Capital("Atlanta", 420003, 95.7));
        stateCapital.put("Hawaii", new Capital("Honolulu", 337256, 85.7));
        stateCapital.put("Idaho", new Capital("Boise", 205671, 63.8));
        stateCapital.put("Illinois", new Capital("Springfield", 116250, 54.0));
        stateCapital.put("Indiana", new Capital("Indianapolis", 829718, 361.5));
        stateCapital.put("Iowa", new Capital("Des Moines", 203433, 75.8));
        stateCapital.put("Kansas", new Capital("Topeka", 127473, 56.0));
        stateCapital.put("Kentucky", new Capital("Frankfort", 25527, 14.7));
        stateCapital.put("Louisiana", new Capital("Baton Rouge", 229553, 76.8));
        stateCapital.put("Maine", new Capital("Augusta", 19136, 55.4));
        stateCapital.put("Maryland", new Capital("Annapolis", 38394, 6.73));
        stateCapital.put("Massachusetts", new Capital("Boston", 617594, 48.4));
        stateCapital.put("Michigan", new Capital("Lansing", 114297, 35.0));
        stateCapital.put("Minnesota", new Capital("Saint Paul", 300851, 52.8));
        stateCapital.put("Mississippi", new Capital("Jackson", 173514, 104.9));
        stateCapital.put("Missouri", new Capital("Jefferson City", 43079, 27.3));
        stateCapital.put("Montana", new Capital("Helena", 28190, 14.0));
        stateCapital.put("Nebraska", new Capital("Lincoln", 258379, 74.6));
        stateCapital.put("Nevada", new Capital("Carson City", 55274, 143.4));
        stateCapital.put("New Hampshire", new Capital("Concord", 42695, 64.3));
        stateCapital.put("New Jersey", new Capital("Trenton", 84913, 7.66));
        stateCapital.put("New Mexico", new Capital("Santa Fe", 75764, 37.3));
        stateCapital.put("New York", new Capital("Albany", 97856, 21.4));
        stateCapital.put("North Carolina", new Capital("Raleigh", 403892, 114.6));
        stateCapital.put("North Dakota", new Capital("Bismarck", 61272, 26.9));
        stateCapital.put("Ohio", new Capital("Columbus", 822553, 210.3));
        stateCapital.put("Oklahoma", new Capital("Oklahoma City", 580000, 607.0));
        stateCapital.put("Oregon", new Capital("Salem", 154637, 45.7));
        stateCapital.put("Pennsylvania", new Capital("Harrisburg", 49528, 8.11));
        stateCapital.put("Rhode Island", new Capital("Providence", 178042, 18.5));
        stateCapital.put("South Carolina", new Capital("Columbia", 131686, 125.2));
        stateCapital.put("South Dakota", new Capital("Pierre", 13646, 13.0));
        stateCapital.put("Tennessee", new Capital("Nashville", 635710, 473.3));
        stateCapital.put("Texas", new Capital("Austin", 790390, 251.5));
        stateCapital.put("Utah", new Capital("Salt Lake City", 186440, 109.1));
        stateCapital.put("Vermont", new Capital("Montpelier", 7855, 10.2));
        stateCapital.put("Virginia", new Capital("Richmond", 204214, 60.1));
        stateCapital.put("Washington", new Capital("Olympia", 46478, 16.7));
        stateCapital.put("West Virginia", new Capital("Charleston", 51400, 31.6));
        stateCapital.put("Wisconsin", new Capital("Madison", 233209, 68.7));
        stateCapital.put("Wyoming", new Capital("Cheyenne", 59466, 21.1));
 
   }
 
   public void printStateCapitals() {
 
       System.out.println("STATE/CAPITAL PAIRS: ");
       System.out.println("*--------------------*");
 
       for (String state : stateCapital.keySet()) {
           Capital myCapital = stateCapital.get(state);
 
           String capital = myCapital.getName();
           int population = myCapital.getPopulation();
           double sqMileage = myCapital.getSqMileage();
 
           System.out.println(state + " - " + capital + " | Pop: " + population + " | Area: " + sqMileage + " sq mi");
 
       }
   }
 
   public void printLowLimitPopulation(int lowLimit) {
 
       for (String state : stateCapital.keySet()) {
           Capital myCapital = stateCapital.get(state);
 
           String capital = myCapital.getName();
           int population = myCapital.getPopulation();
           double sqMileage = myCapital.getSqMileage();
 
           if (lowLimit < population) {
               System.out.println(state + " | " + capital + " | " + population + " | " + sqMileage);
           }
       }
    }
    
}
