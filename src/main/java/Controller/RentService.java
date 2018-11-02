/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.FamilyRental;
import Model.RentPerDay;
import Model.RentPerHour;
import Model.RentPerWeek;
import Model.Rental;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class RentService {    
    
    public List<Double> calculateRents(List<Rental> plst_rents){  
        
        List<Double> llst_prices = new ArrayList<>();
        
        if(plst_rents.size() >= 3 && plst_rents.size() <= 5){
            // it's a FamilyRental
            FamilyRental lcl_familyRental = new FamilyRental();
            
            llst_prices.add(lcl_familyRental.calculateFamilyRental(plst_rents));
        
        }else{
            // it's not a FamilyRental. I analyze each of the rents separately   
            plst_rents.stream().forEach(x -> {
                if(x.getMi_costo() == 5)
                    llst_prices.add(x.calculateRent() * 1.00);
                
                if(x.getMi_costo() == 20)
                    llst_prices.add(x.calculateRent() * 1.00);
                
                if(x.getMi_costo() == 60)
                    llst_prices.add(x.calculateRent() * 1.00);                
            });        
        } 
        
        return llst_prices;
    }    
}
