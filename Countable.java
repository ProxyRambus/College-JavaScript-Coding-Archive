 /**
  * Moin Chaudhry
  * 11-02-2019
  * Countable.java
  * 
  * This class demonstrates a static field.
  */

   // Creates a private int called instanceCount set to 0.
 public class Countable {
  private static int instanceCount = 0;

  /**
   * The constructor increments the static
   * field instanceCount. This keeps track
   * of the number of instances of this
   * class that are created.
   */

  // This method uses instanceCount to add the value of 1 to instanceCount.
  public Countable()

  {
   instanceCount++;
  }

  /**
   * The getInstanceCount method returns
   * the value in the instanceCount field,
   * which is the number of instances of
   * this class that have been created.
   */

  // This method returns instanceCount as getInstanceCount.
  public int getInstanceCount() {
   return instanceCount;
  }
 }