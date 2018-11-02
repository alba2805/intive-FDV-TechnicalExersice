/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.RentPerDay;
import Model.RentPerHour;
import Model.RentPerWeek;
import Model.Rental;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lenovo
 */
public class RentServiceTest {
    
    public RentServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculateRents method, of class RentService.
     */
    @Test
    public void testCalculateRents() {
        System.out.println("calculateRents");
        
        // create the parametres
        
        //I create two rents per hour
        RentPerHour lcl_rentPerHour1 = new RentPerHour(2); // two hours   
        RentPerHour lcl_rentPerHour2 = new RentPerHour(3); // three hours 
        
        //I create one rent per day
        RentPerDay lcl_rentPerDay = new RentPerDay(1);// one day
        
        //I create one rent per week
        RentPerWeek lcl_rentPerWeek = new RentPerWeek(4);// 4 weeks        
        
        
        List<Rental> plst_rents = new ArrayList<>();
        
        //plst_rents.add(lcl_rentPerHour1);
        //plst_rents.add(lcl_rentPerHour2);
        plst_rents.add(lcl_rentPerDay);
        plst_rents.add(lcl_rentPerWeek);        
        
        
        
        
        RentService instance = new RentService();
        
        // I define the expected result 
        List<Double> expResult = new ArrayList<>();
        expResult.add(20.0);
        expResult.add(240.0);
        
        List<Double> result = instance.calculateRents(plst_rents);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
