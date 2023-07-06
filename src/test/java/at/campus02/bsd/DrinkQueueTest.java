package at.campus02.bsd;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class DrinkQueueTest {
    private DrinkQueue drinkQueue;

    @BeforeEach
    public void setUp() {
        drinkQueue = new DrinkQueue();
    }

    @Test
    public void testEnqueue() {
        List<Liquid> ingredients = Arrays.asList(
                new Liquid("Ingredient1", 0.25, 20),
                new Liquid("Ingredient2", 0.5, 5),
                new Liquid("Ingredient3", 0.75,10)
        );

        Drink drink = new Cocktail("Test Cocktail",ingredients);
        drinkQueue.enqueue(drink);

        assertFalse(drinkQueue.isEmpty());
        assertEquals(1, drinkQueue.size());
    }

    @Test
    public void testDequeue() {
        List<Liquid> ingredients = Arrays.asList(
                new Liquid("Ingredient1", 0.25, 20),
                new Liquid("Ingredient2", 0.5, 5),
                new Liquid("Ingredient3", 0.75,10)
        );
        Drink drink1 = new Cocktail("Cocktail 1",ingredients);
        Drink drink2 = new Cocktail("Cocktail 2",ingredients);

        drinkQueue.enqueue(drink1);
        drinkQueue.enqueue(drink2);

        Drink dequeuedDrink1 = drinkQueue.dequeue();
        assertEquals(drink1, dequeuedDrink1);
        assertEquals(1, drinkQueue.size());

        Drink dequeuedDrink2 = drinkQueue.dequeue();
        assertEquals(drink2, dequeuedDrink2);
        assertEquals(0, drinkQueue.size());
    }

    @Test
    public void testDequeueEmptyQueue() {
        assertThrows(NoSuchElementException.class, () -> drinkQueue.dequeue());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(drinkQueue.isEmpty());
        List<Liquid> ingredients = Arrays.asList(
                new Liquid("Ingredient1", 0.25, 20),
                new Liquid("Ingredient2", 0.5, 5),
                new Liquid("Ingredient3", 0.75,10)
        );

        drinkQueue.enqueue(new Cocktail("Test Drink", ingredients));

        assertFalse(drinkQueue.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(0, drinkQueue.size());

        List<Liquid> ingredients = Arrays.asList(
                new Liquid("Ingredient1", 0.25, 20),
                new Liquid("Ingredient2", 0.5, 5),
                new Liquid("Ingredient3", 0.75,10)
        );

        drinkQueue.enqueue(new Cocktail("Drink 1",ingredients));
        drinkQueue.enqueue(new Cocktail("Drink 2",ingredients));

        assertEquals(2, drinkQueue.size());

        drinkQueue.dequeue();

        assertEquals(1, drinkQueue.size());
    }
}
