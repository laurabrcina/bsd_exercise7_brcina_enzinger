package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class DrinkTest {
    Drink drink;

    @BeforeEach
    public void setUp(){
        List<Liquid> ingredients = Arrays.asList(
                new Liquid("Ingredient1", 0.25, 20),
                new Liquid("Ingredient2", 0.5, 5),
                new Liquid("Ingredient3", 0.75,10)
        );
        drink = new Cocktail("Cocktail2",ingredients);
    }

    @Test
    public void getNameTest(){
        assertEquals("Cocktail2",drink.getName());
    }
    @Test
    public void setNameTest(){
<<<<<<< HEAD
       drink.setName("Cocktail Ananas");
=======
        drink.setName("Cocktail Ananas");
>>>>>>> maven_site
        assertEquals("Cocktail Ananas",drink.getName());
    }
}
