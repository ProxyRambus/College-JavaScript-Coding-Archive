  /**
    * This program demonstrates the Course class.
    */
public class CourseDemo
{
   public static void main(String[] args)
   {
         // Create an Instructor object.
      Student myStudent = new Student("Moin", "Chaudhry", "RH3010");
   
        // Create a TextBook object.
      TextBook myTextBook = new TextBook("Starting Out with Java","Gaddis", "Pearson");
   
        // Create a Course object.
      Course myCourse = new Course("Intro to Java", myStudent, myTextBook);
   
        // Display the course information.
      System.out.println(Course);
   }
}
