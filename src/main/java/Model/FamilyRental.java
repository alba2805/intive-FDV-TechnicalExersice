/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Util.MathematicalOperations;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class FamilyRental {
    
    private int mi_sum;

    public double calculateFamilyRental(List<Rental> plst_rents){
        
        plst_rents.stream().forEach(x -> {
                                 this.mi_sum = this.mi_sum + x.calculateRent();
                                });
        
                             //here the percentage value calculate is 30 according to the business  
        return this.mi_sum - MathematicalOperations.calculatePercent(30, mi_sum);// 
    }
    
}
