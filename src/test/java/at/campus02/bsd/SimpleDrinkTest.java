package at.campus02.bsd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleDrinkTest {

    @Test
    public void testGetVolume() {
        Liquid l = new Liquid("Water", 0.5, 0);
        SimpleDrink drink = new SimpleDrink("Water", l);

        double expectedVolume = 0.5;
        double actualVolume = drink.getVolume();

        assertEquals(expectedVolume, actualVolume, 0.01);
    }

    @Test
    public void testGetAlcoholPercent() {
        Liquid l = new Liquid("Wine", 0.2, 12.5);
        SimpleDrink drink = new SimpleDrink("Wine", l);

        double expectedAlcoholPercent = 12.5;
        double actualAlcoholPercent = drink.getAlcoholPercent();

        assertEquals(expectedAlcoholPercent, actualAlcoholPercent, 0.01);
    }

    @Test
    public void testIsAlcoholic_WithAlcoholicDrink() {
        Liquid l = new Liquid("Wine", 0.2, 12.5);
        SimpleDrink drink = new SimpleDrink("Wine", l);

        boolean expectedIsAlcoholic = true;
        boolean actualIsAlcoholic = drink.isAlcoholic();

        assertEquals(expectedIsAlcoholic, actualIsAlcoholic);
    }

    @Test
    public void testIsAlcoholic_WithNonAlcoholicDrink() {
        Liquid l = new Liquid("Water", 0.5, 0);
        SimpleDrink drink = new SimpleDrink("Water", l);

        boolean expectedIsAlcoholic = false;
        boolean actualIsAlcoholic = drink.isAlcoholic();

        assertEquals(expectedIsAlcoholic, actualIsAlcoholic);
    }
}
