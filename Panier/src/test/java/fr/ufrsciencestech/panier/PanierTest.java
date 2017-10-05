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
public class PanierTest {
    
    public PanierTest() {
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
     * Test of getContenance method, of class Panier.
     */
    @Test
    public void testGetContenance() throws OrangeException {
        System.out.println("getContenance");
        Panier instance = new Panier(2);
        int expResult = 2;
        int result = instance.getContenance();
        assertEquals(expResult, result);
    }

    /**
     * Test of estPlein method, of class Panier.
     */
    @Test
    public void testEstPlein() {
        System.out.println("estPlein");
        Panier instance = null;
        boolean expResult = false;
        boolean result = instance.estPlein();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test la possible surcharge de panier
     * @throws OrangeException 
     */
    @Test
    public void testAjoutPanierPlein() throws OrangeException{
        int n=4;
        Panier p = new Panier(n);
        p.ajoutOrange(new Orange(0.50,"Chili"));
        p.ajoutOrange(new Orange(0.05,"Perou"));
        p.ajoutOrange(new Orange(0.80,"Soudan"));
        p.ajoutOrange(new Orange(0.50,"Suede"));
        p.ajoutOrange(new Orange(0.10,"Alaska"));
        assertEquals(n,p.getListProd().size(),0.0);
    }
    
    /**
     * Test of estVide method, of class Panier.
     */
    @Test
    public void testEstVide() throws OrangeException {
        System.out.println("estVide");
        Panier instance = new Panier(1);
        boolean expResult = true;
        boolean result = instance.estVide();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class Panier.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Panier instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
