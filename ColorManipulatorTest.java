import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ColorManipulatorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ColorManipulatorTest
{
    /**
     * Default constructor for test class ColorManipulatorTest
     */
    public ColorManipulatorTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testGrayScale()
    {
        Picture picture= new Picture( "Schmit.jpg" );
        ColorManipulator manipulator = new ColorManipulator( picture );
        picture.explore();
        manipulator.grayScale();
        picture.explore();
        assertEquals(100, actualPixelValue); // compare the expected pixel's gray value vs. the actual gray value
        
        // test at least 2 pixels
    }
}
