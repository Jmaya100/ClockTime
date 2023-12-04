

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class Clock.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Clock
{
    /**
     * Default constructor for test class Clock
     */
    public Clock()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void clockss()
    {
        ClockTime clockTim1 = new ClockTime(12, 12, 12);
        ClockTime clockTim2 = new ClockTime(12, 11, 11);
        assertEquals(false, clockTim1.equals(clockTim2));
    }
}

