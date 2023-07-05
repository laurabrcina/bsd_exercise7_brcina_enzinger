package at.campus02.bsd;

import java.util.LinkedList;
import java.util.Queue;

public class DrinkQueue {
    private Queue<Drink> queue;

    public DrinkQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(Drink drink) {
        queue.add(drink);
    }

    public Drink dequeue() {
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
}

