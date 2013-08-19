/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proy1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 202
 */
public class operacionesTest {
    
    public operacionesTest() {
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
     * Test of sumar method, of class operaciones.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        double x = 4.0;
        double y = 5.0;
        double expResult = 9.0;
        double result = operaciones.sumar(x, y);
        assertEquals(expResult, result, 0.0);//verifica si da 
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class operaciones.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        double x = 4.0;
        double y = 5.0;
        double expResult = -1.0;
        double result = operaciones.restar(x, y);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class operaciones.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        double x = 2.0;
        double y = 0.0;
        double expResult = 0.0;
        double result = operaciones.dividir(x, y);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype."); OJO TOCA QUITARLA O COMENTARIARLA
    }

    /**
     * Test of multiplicar method, of class operaciones.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        double x = 5.0;
        double y = 4.0;
        double expResult = 20.0;
        double result = operaciones.multiplicar(x, y);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}