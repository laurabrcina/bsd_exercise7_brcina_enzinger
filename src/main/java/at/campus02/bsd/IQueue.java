package at.campus02.bsd;

/**
 *Interface for a queue
 */
public interface IQueue {
  /**
   * Adds an object to the queue
   *
   * @param obj The object to add
   * @return True if the object was added successfully, false otherwise
   * */ 
  public abstract boolean offer(String obj);

  /**
   * Retrieves and removes the first element from the queue
   *
   * @return The first element of the queue, or null if the queue is empty
   */

  public abstract String poll();

  /**
   * Retrieves and removes the first element from the queue
   *
   * @return The first element of the queue
   * @throws NoSuchElementException if the queue is empty
   */
  public abstract String remove();

  /**
   * Retrieves, but does not remove, the first element from the queue
   *
   * @return The first element of the queue, or null if the queue is empty
   */
   
  public abstract String peek();

  /**
   * Retrieves, but does not remove, the first element from the queue
   *
   * @return The first element of the queue
   * @throws NoSuchElementException if the queue is empty
   */
  
  public abstract String element();
}