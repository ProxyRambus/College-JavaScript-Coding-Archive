   /**
  * Moin Chaudhry
  * 11-02-2019
  * StaticDemo.java
  * 
  * This class demonstrates a Countable class.
  */

  public class StaticDemo {
   public static void main(String[] args) {
    int objectCount;

    // Create three instances of the
    // Countable class.
    // Doing this allows access to the program Countable.java
    Countable object1 = new Countable();
    Countable object2 = new Countable();
    Countable object3 = new Countable();

    // Get the number of instances from
    // the class's static field.
    objectCount = object1.getInstanceCount();
    System.out.println(objectCount + " instances " +
     "of the class were created.");
   }
  }