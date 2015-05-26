package superficies;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author @FranJAbrilA <ffrannabril@gmail.com>
 */
public class VistaTest {

    public VistaTest() {
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
     * Test of choose method, of class Vista.
     */
    @Test
    public void testChoose() {
        System.out.println("choose");
        float result;
        Modelo type1 = new Modelo(10, 10, "square");
        result = Vista.choose(type1);
        assertEquals(100, result, 0.0);
        
        Modelo type2 = new Modelo(10, 10, "circle");
        result = Vista.choose(type2);
        assertEquals(314F, result, 1.0);
        
        Modelo type3 = new Modelo(10, 10, "triangle");
        result = Vista.choose(type3);
        assertEquals(50, result, 0.0);
        
        Modelo type4 = new Modelo(10, 10, "rectangle");
        result = Vista.choose(type4);
        assertEquals(100, result, 0.0);

    }

}
