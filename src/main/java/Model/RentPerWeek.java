/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author lenovo
 */
public class RentPerWeek extends Rental{

    public RentPerWeek(int pi_unit){
        super(60, pi_unit);// I send the cost with fixed value = 60 since this type of rental works    
    }    
}
