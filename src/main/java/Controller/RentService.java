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
import java.util.List;

/**
 *
 * @author lenovo
 */
public class RentService {
    
    
    public void calculateRents(List<Rental> plst_rents){  
        
        if(plst_rents.size() >= 3 && plst_rents.size() <= 5){
            // it's a FamilyRental
            FamilyRental lcl_familyRental = new FamilyRental();
            
            System.out.println("the cost for the family rental is: $" + lcl_familyRental.calculateFamiilyRental(plst_rents));
        
        }else{
            // it's not a FamilyRental. I analyze each of the rents separately   
            plst_rents.stream().forEach(x -> {
                if(x.getMi_costo() == 5)
                    System.out.println("Rent $5 per hour, " + x.getMi_unit() + " hours: cost $" + x.calculateRent());
                
                if(x.getMi_costo() == 20)
                    System.out.println("Rent $20 per day, " + x.getMi_unit() + " days: cost $" + x.calculateRent());
                
                if(x.getMi_costo() == 60)
                    System.out.println("Rent $60 per week, " + x.getMi_unit() + " weeks: cost $" + x.calculateRent());                
            });        
        }    
    }    
}
