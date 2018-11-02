/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.RentService;
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
public class TechnicalExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //I create two rents per hour
        RentPerHour lcl_rentPerHour1 = new RentPerHour(2); // two hours   
        RentPerHour lcl_rentPerHour2 = new RentPerHour(3); // three hours 
        
        //I create one rent per day
        RentPerDay lcl_rentPerDay = new RentPerDay(1);// one day
        
        //I create one rent per week
        RentPerWeek lcl_rentPerWeek = new RentPerWeek(4);// 4 weeks
        
        List<Rental> llst_rents = new ArrayList<>();//I do not define the type of the list in the ArrayList<> to be able to pass any of their child class
        
       // llst_rents.add(lcl_rentPerHour1);
      //  llst_rents.add(lcl_rentPerHour2);
        llst_rents.add(lcl_rentPerDay);
        llst_rents.add(lcl_rentPerWeek);
        
        RentService lcl_rentService = new RentService();
        lcl_rentService.calculateRents(llst_rents).stream().forEach(x -> {
            System.out.println(x);
        });
    }
    
}
