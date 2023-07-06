package at.campus02.bsd;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class CocktailTest {

    @Test
    public void testGetVolume() {
        List<Liquid> ingredients = Arrays.asList(
                new Liquid("Ingredient1", 0.25, 20),
                new Liquid("Ingredient2", 0.5, 5),
                new Liquid("Ingredient3", 0.75,10)
        );
        Cocktail cocktail = new Cocktail("TestCocktail", ingredients);

        double expectedVolume = 0.25 + 0.5 + 0.75;
        double actualVolume = cocktail.getVolume();

        assertEquals(expectedVolume, actualVolume, 0.001);
    }

    @Test
    public void testGetAlcoholPercent_NonAlcoholic() {
        List<Liquid> ingredients = Arrays.asList(
                new Liquid("Ingredient1", 0.25,0),
                new Liquid("Ingredient2", 0.5,0),
                new Liquid("Ingredient3", 0.75,0)
        );
        Cocktail cocktail = new Cocktail("TestCocktail", ingredients);

        double expectedAlcoholPercent = 0.0;
        double actualAlcoholPercent = cocktail.getAlcoholPercent();

        assertEquals(expectedAlcoholPercent, actualAlcoholPercent, 0.001);
    }

    @Test
    public void testGetAlcoholPercent_Alcoholic() {
        List<Liquid> ingredients = Arrays.asList(
                new Liquid("Ingredient1", 0.0, 15),
                new Liquid("Ingredient2", 0.1,10),
                new Liquid("Ingredient3", 0.2,5)
        );
        Cocktail cocktail = new Cocktail("TestCocktail", ingredients);

        double expectedAlcoholPercent = (15+10+5)/3;
        double actualAlcoholPercent = cocktail.getAlcoholPercent();

        assertEquals(expectedAlcoholPercent, actualAlcoholPercent, 0.001);
    }

    @Test
    public void testIsAlcoholic_NonAlcoholic() {
        List<Liquid> ingredients = Arrays.asList(
                new Liquid("Ingredient1", 0.0,0),
                new Liquid("Ingredient2", 0.0,0),
                new Liquid("Ingredient3", 0.0,0)
        );
        Cocktail cocktail = new Cocktail("TestCocktail", ingredients);

        assertFalse(cocktail.isAlcoholic());
    }

    @Test
    public void testIsAlcoholic_Alcoholic() {
        List<Liquid> ingredients = Arrays.asList(
                new Liquid("Ingredient1", 0.0,5),
                new Liquid("Ingredient2", 0.1,0),
                new Liquid("Ingredient3", 0.0,0)
        );
        Cocktail cocktail = new Cocktail("TestCocktail", ingredients);

        assertTrue(cocktail.isAlcoholic());
    }
}