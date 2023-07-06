package at.campus02.bsd;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Represents a queue of drinks.
 */
public class DrinkQueue {
    private Queue<Drink> queue;

    /**
     * Creates a new DrinkQueue object.
     */
    public DrinkQueue() {
        queue = new LinkedList<>();
    }

    /**
     * Adds a drink to the end of the queue.
     *
     * @param drink The drink to be added.
     */
    public void enqueue(Drink drink) {
        queue.add(drink);
    }

    /**
     * Removes and returns the first drink from the queue.
     *
     * @return The first drink in the queue, or null if the queue is empty.
     */
    public Drink dequeue() {
        return queue.poll();
    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue is empty, false otherwise.
     */
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    /**
     * Returns the number of drinks in the queue.
     *
     * @return The size of the queue.
     */
    public int size() {
        return queue.size();
    }
}

