package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.NoSuchElementException;

public class StringQueueTest {

    private StringQueue queue;

    @BeforeEach
    public void setUp() {
        queue = new StringQueue(5);
    }

    @Test
    public void testOffer_WhenQueueNotFull() {
        boolean result = queue.offer("Element1");

        assertTrue(result);
    }

    @Test
    public void testOffer_WhenQueueFull() {
        queue.offer("Element1");
        queue.offer("Element2");
        queue.offer("Element3");
        queue.offer("Element4");
        queue.offer("Element5");

        boolean result = queue.offer("Element6");

        assertFalse(result);
    }

    @Test
    public void testPoll_WhenQueueNotEmpty() {
        queue.offer("Element1");
        queue.offer("Element2");

        String element = queue.poll();

        assertEquals("Element1", element);
    }

    @Test
    public void testPoll_WhenQueueEmpty() {
        String element = queue.poll();

        assertNull(element);
    }

    @Test
    public void testRemove_WhenQueueNotEmpty() {
        queue.offer("Element1");
        queue.offer("Element2");

        String element = queue.remove();

      assertEquals("Element1", element);
    }

    @Test
    public void testRemove_WhenQueueEmpty() {
        assertThrows(IndexOutOfBoundsException.class, () -> queue.remove());
    }

    @Test
    public void testPeek_WhenQueueNotEmpty() {
        queue.offer("Element1");
        queue.offer("Element2");

        String element = queue.peek();

       assertEquals("Element1", element);
    }

    @Test
    public void testPeek_WhenQueueEmpty() {
        String element = queue.peek();

       assertNull(element);
    }

    @Test
    public void testElement_WhenQueueNotEmpty() {
        queue.offer("Element1");
        queue.offer("Element2");

        String element = queue.element();

        assertEquals("Element1", element);
    }

    @Test
    public void testElement_WhenQueueEmpty() {
        assertThrows(IndexOutOfBoundsException.class, () -> queue.element());
    }
}

