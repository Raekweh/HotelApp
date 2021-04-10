/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelAppGUI;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Raymond Li
 */
public class ModelTest 
{
    public Model model;
    public ModelTest() 
    {
    }
    
    @BeforeClass
    public static void setUpClass() 
    {
    }
    
    @AfterClass
    public static void tearDownClass() 
    {
    }
    
    @Before
    public void setUp() 
    {
        this.model = new Model();
    }
    
    @After
    public void tearDown() 
    {
    }

    /**
     * Test of validName method, of class Model.
     */
    @Test
    public void testValidName() 
    {
        System.out.println("validName");
        String fullnameTestOne = "Rakesh";
        String fullnameTestTwo = "Rae sdoifhsdf";
        String fullnameTestThree = "Johhhhn";
        String fullnameTestFour = "(#*$&#($";
        String fullnameTestFive = "Rakesh (*&@#";
        String fullnameTestSix = "R@k#sh P@te!";
        
        boolean expResultTrue = true;
        boolean expResultFalse = false;
        
        boolean resultTestOne = this.model.validName(fullnameTestOne);
        boolean resultTestTwo = this.model.validName(fullnameTestTwo);        
        boolean resultTestThree = this.model.validName(fullnameTestThree);
        boolean resultTestFour = this.model.validName(fullnameTestFour);
        boolean resultTestFive = this.model.validName(fullnameTestFive);
        boolean resultTestSix = this.model.validName(fullnameTestSix);
        
        assertEquals(expResultTrue, resultTestOne);
        assertEquals(expResultTrue, resultTestTwo);
        assertEquals(expResultTrue, resultTestThree);
        assertEquals(expResultFalse, resultTestFour);
        assertEquals(expResultFalse, resultTestFive);
        assertEquals(expResultFalse, resultTestSix);
    }

    /**
     * Test of validAge method, of class Model.
     */
    @Test
    public void testValidAge() 
    {
        System.out.println("validAge");
        int ageTestOne = 20;
        int ageTestTwo = 30;
        int ageTestThree = 70;
        int ageTestFour = 15;
        int ageTestFive = 12;
        int ageTestSix = 10;
        
        boolean expResultTrue = true;
        boolean expResultFalse = false;
        
        boolean resultTestOne = this.model.validAge(ageTestOne);
        boolean resultTestTwo = this.model.validAge(ageTestTwo);
        boolean resultTestThree = this.model.validAge(ageTestThree);
        boolean resultTestFour = this.model.validAge(ageTestFour);
        boolean resultTestFive = this.model.validAge(ageTestFive);
        boolean resultTestSix = this.model.validAge(ageTestSix);
        
        assertEquals(expResultTrue, resultTestOne);
        assertEquals(expResultTrue, resultTestTwo);
        assertEquals(expResultTrue, resultTestThree);
        assertEquals(expResultFalse, resultTestFour);
        assertEquals(expResultFalse, resultTestFive);
        assertEquals(expResultFalse, resultTestSix);
    }

    /**
     * Test of validEmailAddress method, of class Model.
     */
    @Test
    public void testValidEmailAddress() 
    {
        System.out.println("validEmailAddress");
        String emailAddressTestOne = "sdfsdoi@gmail.com";
        String emailAddressTestTwo = "98etsdjg@hotmail.com";
        String emailAddressTestThree = "sdjfg@Yahoo.com";
        String emailAddressTestFour = "sduihf@@gmail.com";
        String emailAddressTestFive = "sdkuivhs@hotmail..com";
        String emailAddressTestSix = "dfoigjfYahoo.com";
        
        boolean expResultTrue = true;
        boolean expResultFalse = false;
        boolean resultTestOne = this.model.validEmailAddress(emailAddressTestOne);
        boolean resultTestTwo = this.model.validEmailAddress(emailAddressTestTwo);
        boolean resultTestThree = this.model.validEmailAddress(emailAddressTestThree);
        boolean resultTestFour = this.model.validEmailAddress(emailAddressTestFour);
        boolean resultTestFive = this.model.validEmailAddress(emailAddressTestFive);
        boolean resultTestSix = this.model.validEmailAddress(emailAddressTestSix);
        
        assertEquals(expResultTrue, resultTestOne);
        assertEquals(expResultTrue, resultTestTwo);
        assertEquals(expResultTrue, resultTestThree);
        assertEquals(expResultFalse, resultTestFour);
        assertEquals(expResultFalse, resultTestFive);
        assertEquals(expResultFalse, resultTestSix);
    }

    /**
     * Test of validCheckInDate method, of class Model.
     */
    @Test
    public void testValidCheckInDate() 
    {
        System.out.println("validCheckInDate");
        //Valid Check In Dates
        String checkInTestOne = "09-11-2021";
        String checkInTestTwo = "10-01-2021";
        String checkInTestThree = "25-09-2021";
        
        //Invalid check in dates
        String checkInTestFour = "30-10-2020";
        String checkInTestFive = "10-04-2020";
        String checkInTestSix = "";
        
        boolean expResultTrue = true;
        boolean expResultFalse = false;
        
        boolean resultTestOne = this.model.validCheckInDate(checkInTestOne);
        boolean resultTestTwo = this.model.validCheckInDate(checkInTestTwo);        
        boolean resultTestThree = this.model.validCheckInDate(checkInTestThree);
        boolean resultTestFour = this.model.validCheckInDate(checkInTestFour);
        boolean resultTestFive = this.model.validCheckInDate(checkInTestFive);
        boolean resultTestSix = this.model.validCheckInDate(checkInTestSix);
        
        assertEquals(expResultTrue, resultTestOne);
        assertEquals(expResultTrue, resultTestTwo);
        assertEquals(expResultTrue, resultTestThree);
        assertEquals(expResultFalse, resultTestFour);
        assertEquals(expResultFalse, resultTestFive);
        assertEquals(expResultFalse, resultTestSix);
    }

    /**
     * Test of validCheckOutDate method, of class Model.
     */
    @Test
    public void testValidCheckOutDate() 
    {
        System.out.println("validCheckOutDate");
        //Check In Dates
        String checkInTestOne = "09-11-2021";
        String checkInTestTwo = "10-01-2021";
        String checkInTestThree = "25-09-2021";
        String checkInTestFour = "30-10-2020";
        String checkInTestFive = "10-04-2021";
        String checkInTestSix = "";        
        //Check Out Dates
        String checkOutTestOne = "10-11-2021";
        String checkOutTestTwo = "13-08-2021";
        String checkOutTestThree = "25-12-2021";
        String checkOutTestFour = "30-10-2020";
        String checkOutTestFive = "11-04-2020";
        String checkOutTestSix = "";

        boolean expResultTrue = true;
        boolean expResultFalse = false;
        boolean resultOne = this.model.validCheckOutDate(checkInTestOne, checkOutTestOne);
        boolean resultTwo = this.model.validCheckOutDate(checkInTestTwo, checkOutTestTwo);
        boolean resultThree = this.model.validCheckOutDate (checkInTestThree, checkOutTestThree);
        boolean resultFour = this.model.validCheckOutDate(checkInTestFour, checkOutTestFour);
        boolean resultFive = this.model.validCheckOutDate(checkInTestFive, checkOutTestFive);
        boolean resultSix = this.model.validCheckOutDate(checkInTestSix, checkOutTestSix);
        
        assertEquals(expResultTrue, resultOne);
        assertEquals(expResultTrue, resultTwo);
        assertEquals(expResultTrue, resultThree);
        assertEquals(expResultFalse, resultFour);
        assertEquals(expResultFalse, resultFive);
        assertEquals(expResultFalse, resultSix);
    }
}