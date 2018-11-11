/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nt.deltavcalculator.dto;

/**
 *
 * @author Elnic
 */
public class RocketShip {
    public static class Builder {
    
        String vesselName = "";
        double vesselTonnage = 0;
        double fuelCapacity = 0;
        double burnRate = 0;
        double thrust = 0;
        double fuelWeight = 0;
        double shipWeight = 0;
        double isp = 0;
        
        public Builder(String vesselName) {
            this.vesselName = vesselName;
        }
        
        public Builder withTonnage(double tonnage) {
            this.vesselTonnage = tonnage;
            
            return this;
        }
        
        public Builder withFuelCapacity(double fuel) {
            this.fuelCapacity = fuel;
            
            return this;
        }
        
        public Builder withBurnRate(double rate) {
            this.burnRate = rate;
            
            return this;
        }
        
        public Builder withThrust(double thrust) {
            this.thrust = thrust;
            
            return this;
        }
        
        public Builder withFuelWeight(double fuelWeight) {
            this.fuelWeight = fuelWeight;
            
            return this;
        }
        
        public Builder withShipWeight(double shipWeight) {
            this.shipWeight = shipWeight;
            
            return this;
        }
        
        public Builder withIsp(double isp) {
            this.isp = isp;
            
            return this;
        }
        
        public RocketShip build() {
            RocketShip rocket = new RocketShip();
            rocket.vesselName = this.vesselName;
        }

    }
    
    private RocketShip() {
        
    }
    
    
}
