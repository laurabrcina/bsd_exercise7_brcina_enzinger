package at.campus02.bsd;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class LiquidTest {

    @Test
    public void testGetName() {
        Liquid liquid = new Liquid("Test Liquid", 0.5, 40.0);

        assertEquals("Test Liquid", liquid.getName());
    }

    @Test
    public void testSetName() {
        Liquid liquid = new Liquid("Test Liquid", 0.5, 40.0);
        liquid.setName("New Liquid Name");

        assertEquals("New Liquid Name", liquid.getName());
    }

    @Test
    public void testGetVolume() {
        Liquid liquid = new Liquid("Test Liquid", 0.5, 40.0);

        assertEquals(0.5, liquid.getVolume(), 0.001);
    }

    @Test
    public void testSetVolume() {
        Liquid liquid = new Liquid("Test Liquid", 0.5, 40.0);
        liquid.setVolume(0.75);

        assertEquals(0.75, liquid.getVolume(), 0.001);
    }

    @Test
    public void testGetAlcoholPercent() {
        Liquid liquid = new Liquid("Test Liquid", 0.5, 40.0);

        assertEquals(40.0, liquid.getAlcoholPercent(), 0.001);
    }

    @Test
    public void testSetAlcoholPercent() {
        Liquid liquid = new Liquid("Test Liquid", 0.5, 40.0);
        liquid.setAlcoholPercent(42.0);

        assertEquals(42.0, liquid.getAlcoholPercent(), 0.001);
    }
}

