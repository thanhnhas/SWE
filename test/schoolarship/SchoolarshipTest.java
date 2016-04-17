/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolarship;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ABC
 */
public class SchoolarshipTest {
    
    public SchoolarshipTest() {
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
     * Test of Schoolarship method, of class Schoolarship.
     */
    @Test
    public void testSchoolarship() {
        Schoolarship s = new Schoolarship();
        assertEquals(100, s.Schoolarship(3.9));
        assertEquals(80, s.Schoolarship(3.8));
        assertEquals(70, s.Schoolarship(3.5));
        assertEquals(70, s.Schoolarship(3.4));
        assertEquals(50, s.Schoolarship(3));
        assertEquals(0, s.Schoolarship(5));
        assertEquals(0, s.Schoolarship(-1));
    }
    
}
