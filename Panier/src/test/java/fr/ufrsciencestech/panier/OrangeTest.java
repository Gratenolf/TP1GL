/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ah154489
 */
public class OrangeTest {
    
    public OrangeTest() {
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
     * Test of getPrix method, of class Orange.
     */
    @Test
    public void testGetPrix() throws FruitException {
        System.out.println("getPrix");
        Orange instance = new Orange(0.5,"Paris");
        double expResult = 0.5;
        double result = instance.getPrix();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getOrigine method, of class Orange.
     */
    @Test
    public void testGetOrigine() throws FruitException {
        System.out.println("getOrigine");
        Orange instance = new Orange(0.5,"Paris");
        String expResult = "Paris";
        String result = instance.getOrigine();
        assertEquals(expResult, result);
    }
    
    

    /**
     * Test of setPrix method, of class Orange.
     */
    @Test
    public void testSetPrix() throws Exception {
        System.out.println("setPrix");
        double P = 0.7;
        Orange instance = new Orange(0.5,"Perou");
        instance.setPrix(P);
        double retour=instance.getPrix();
        assertEquals(P,retour,0.0);
    }

    /**
     * Test of setOrigine method, of class Orange.
     */
    @Test
    public void testSetOrigine() throws Exception {
        System.out.println("setOrigine");
        String O = "Paris";
        Orange instance = new Orange(0.2,"Perou");
        instance.setOrigine(O);
        String res=instance.getOrigine();
        assertEquals(O,res);
    }

    /**
     * Test of equals method, of class Orange.
     */
    @Test
    public void testEquals() throws FruitException {
        System.out.println("equals");
        Orange instance = new Orange(0.5,"Angola");
        Orange instanceB = new Orange(0.5,"Angola");
        assertEquals(true,instance.equals(instanceB));
    }

    /**
     * Test of toString method, of class Orange.
     */
    @Test
    public void testToString() throws FruitException {
        System.out.println("toString");
        Orange instance = new Orange(0.5,"Mozambique");
        String expResult = "Prix : 0.5 Origine : Mozambique";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
