package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Represents a queue of strings.
 */
public class StringQueue implements IQueue {

  private List<String> elements = new ArrayList<String>();
  private int maxSize = 5;

  /**
   * Creates a StringQueue object with the specified maximum size.
   *
   * @param maxSize The maximum size of the queue.
   */
  public StringQueue(int maxSize) {
    this.maxSize = maxSize;
  }

  /**
   * Adds an object to the queue if the maximum size is not reached.
   *
   * @param obj The object to be added.
   * @return true if the object was added successfully, false if the maximum size is reached.
   */
  @Override
  public boolean offer(String obj) {
    if (elements.size() != maxSize)
      elements.add(obj);
    else
      return false;

    return true;
  }

  /**
   * Retrieves and removes the first element of the queue.
   *
   * @return The first element of the queue, or null if the queue is empty.
   */
  @Override
  public String poll() {
    String element = peek();

    if (elements.size() != 0) {
      elements.remove(0);
    }

    return element;
  }

  /**
   * Retrieves and removes the first element of the queue.
   * Throws NoSuchElementException if the queue is empty.
   *
   * @return The first element of the queue.
   * @throws IndexOutOfBoundsException if the queue is empty.
   */
  @Override
  public String remove() {
    String element = poll();

    if (element == null)
      throw new IndexOutOfBoundsException("there's no element any more");

    return element;
  }

  /**
   * Retrieves, but does not remove, the first element of the queue.
   *
   * @return The first element of the queue, or null if the queue is empty.
   */
  @Override
  public String peek() {
    String element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
  }

  /**
   * Retrieves, but does not remove, the first element of the queue.
   * Throws NoSuchElementException if the queue is empty.
   *
   * @return The first element of the queue.
   * @throws IndexOutOfBoundsException if the queue is empty.
   */
  @Override
  public String element() {
    String element = peek();
    if (element == null)
      throw new IndexOutOfBoundsException("there's no element any more");

    return element;
  }

}