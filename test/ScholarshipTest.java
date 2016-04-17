/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nguyen Thanh Nha
 */
public class ScholarshipTest {
    
    public ScholarshipTest() {
    }
    @Test
    public void testAward(){
        assertEquals(-1, new Scholarship(5.0).getAward());
        assertEquals(-1, new Scholarship(-1.0).getAward());
        assertEquals(100, new Scholarship(4.0).getAward());
        assertEquals(100, new Scholarship(3.9).getAward());
        assertEquals(100, new Scholarship(3.8).getAward());
        assertEquals(100, new Scholarship(3.7).getAward());
        assertEquals(80, new Scholarship(3.6).getAward());
        assertEquals(70, new Scholarship(3.4).getAward());
        assertEquals(0, new Scholarship(3.0).getAward());
        assertEquals(0, new Scholarship(2.0).getAward());
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @ScholarshipTest. For example:
    //
    // @ScholarshipTest
    // public void hello() {}
}
