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
    public void testGetContenance() throws FruitException {
        System.out.println("getContenance");
        Panier instance = new Panier(2);
        int expResult = 2;
        int result = instance.getContenance();
        System.out.println("contenance"+result);
        assertEquals(expResult, result);
    }

    /**
     * Test of estPlein method, of class Panier.
     */
    @Test
    public void testEstPlein() throws FruitException {
        System.out.println("estPlein");
        Panier instance = new Panier(2);
        instance.ajoutOrange(new Orange(0.05,"ouzbekistan"));
        instance.ajoutOrange(new Orange(0.2,"Slovaquie"));
        boolean expResult = true;
        boolean result = instance.estPlein();
        assertEquals(expResult, result);
    }

    /**
     * Test la possible surcharge de panier
     * @throws OrangeException 
     */
    /*@Test
    public void testAjoutPanierPlein() throws OrangeException{
        int n=4;
        Panier p = new Panier(n);
        p.ajoutOrange(new Orange(0.50,"Chili"));
        p.ajoutOrange(new Orange(0.05,"Perou"));
        p.ajoutOrange(new Orange(0.80,"Soudan"));
        p.ajoutOrange(new Orange(0.50,"Suede"));
        p.ajoutOrange(new Orange(0.10,"Alaska"));
        assertEquals(n,p.getListProd().size(),0.0);
    }*/
    
    /**
     * Test of estVide method, of class Panier.
     */
    @Test
    public void testEstVide() throws FruitException {
        System.out.println("estVide");
        Panier instance = new Panier(1);
        boolean expResult = true;
        boolean result = instance.estVide();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Panier.
     */
    @Test
    public void testToString() throws FruitException {
        System.out.println("toString");
        Panier instance = new Panier(12);
        String expResult = "contenance du Panier:\nPanier vide.\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
