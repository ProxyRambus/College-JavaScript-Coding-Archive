/**
Haven Harris
09-30-2019
COMP 163-002
*/


// The purpose of this program is to do number crunching on a persons application score and compares the results between two people.
// A fun project to do it left me without a soul.



// Importing the usual java util and setting up variables to keep track of the first and second applicant.
import java.util.*;

public class Admit {
 public static void main(String[] args) {
  Scanner console = new Scanner(System.in);

  int applicantOne = 1;
  applicantTracker(console, applicantOne);
  int applicantTwo = 2;


 }

 // Keeps track of which user is preforming which action and transmits the variable based on which user.
 // Also acts as a user prompt.
 public static void applicantTracker(Scanner console, int tracker) {


  System.out.println("This program compares two applicants to");
  System.out.println("determine which one seems like the stronger");
  System.out.println("applicant. For each candidate I will need");
  System.out.println("either SAT or ACT scores plus a weighted GPA.");
  System.out.println();

  if (tracker == 1) {
   System.out.println("Information for applicant #1:");
   menuSelect(console, tracker);

  } else if (tracker == 2)
   System.out.print("");

  menuSelectTwo(console, tracker);


 }


 // Asking the user to select SAT or ACT, then selecting ACT or SAT scores based on answer.
 // This also takes the return of satSelect/actSelect and stores it in the variable of satComplete/actComplete.
 public static void menuSelect(Scanner console, double z) {

  double satComplete;
  double actComplete;

  System.out.print("   do you have 1) SAT scores or 2) ACT scores? ");
  int menuSelect = console.nextInt();

  if (menuSelect == 1) {
   satComplete = satSelect(console);
   menuSelectTwo(console, satComplete);


  } else if (menuSelect == 2) {
   actComplete = actSelect(console);
   menuSelectTwo(console, actComplete);

  }
 }


 // Used as a second menu in order to keep track of all variables created by applicant two.
 public static void menuSelectTwo(Scanner console, double z) {

  double satCompleteTwo;
  double actCompleteTwo;

  System.out.println("");
  System.out.println("Information for applicant #2:");
  System.out.print("   do you have 1) SAT scores or 2) ACT scores? ");
  int menuSelect = console.nextInt();

  if (menuSelect == 1) {
   satCompleteTwo = satSelect(console);
   actSatComparator(satCompleteTwo, z);


  } else if (menuSelect == 2) {
   actCompleteTwo = actSelect(console);
   actSatComparator(actCompleteTwo, z);

  }
 }

 // This is the section of the code that asks/stores SAT values.
 // Completes all calulations for comparison and returns them to method.
 public static double satSelect(Scanner console) {

  double satGPA;

  System.out.print("   SAT math? ");
  int sMath = console.nextInt();

  System.out.print("   SAT critical reading? ");
  int scReading = console.nextInt();

  System.out.print("   SAT writing? ");
  int sWriting = console.nextInt();

  double satScore = (2 * sMath + scReading + sWriting) / 32;
  System.out.printf("   exam score = " + "%1$.1f", satScore);

  satGPA = satCalulation(console);
  System.out.printf("   GPA score = " + "%1$.1f", satGPA);
  System.out.println("");

  return (satGPA + satScore);

 }

 // This is the section of the code that ask/stores ACT values.
 // Completes all calulations for comparison and returns them to method.
 public static double actSelect(Scanner console) {

  double actGPA;

  System.out.print("   ACT English? ");
  int aEnglish = console.nextInt();

  System.out.print("   ACT math? ");
  int aMath = console.nextInt();

  System.out.print("   ACT reading? ");
  int aReading = console.nextInt();

  System.out.print("   ACT science? ");
  int aScience = console.nextInt();

  double actScore = (aEnglish + 2 * aMath + aReading + aScience) / 1.8;
  System.out.printf("   exam score = " + "%1$.1f", actScore);
  System.out.println("");

  actGPA = actCalulation(console);
  System.out.printf("   GPA score = " + "%1$.1f", actGPA);
  System.out.println("");

  return (actGPA + actScore);

 }

 // Storing and calulating the values from satCalulation then returning them to method.
 public static double satCalulation(Scanner console) {

  System.out.println("");
  System.out.print("   overall GPA? ");
  double soGPA = console.nextDouble();

  System.out.print("   max GPA? ");
  double smGPA = console.nextDouble();

  System.out.print("   Transcript Multiplier? ");
  double stMultiplier = console.nextDouble();

  double gpaScore = (soGPA) / (smGPA) * 100 * stMultiplier;

  return gpaScore;


 }

 // Storing and calulating the values from actCalulation then returning them to method.
 public static double actCalulation(Scanner console) {

  System.out.print("   overall GPA? ");
  double aoGPA = console.nextDouble();

  System.out.print("   max GPA? ");
  double amGPA = console.nextDouble();

  System.out.print("   Transcript Multiplier? ");
  double atMultiplier = console.nextDouble();

  double gpaScore = (aoGPA) / (amGPA) * 100 * atMultiplier;

  return gpaScore;


 }

 // Takes the values from applicant one and applicant two and compares/prints the results.
 public static void actSatComparator(double applicantTwo, double applicantOne) {

  double m = applicantTwo;
  double n = applicantOne;

  System.out.println("");
  System.out.printf("First applicant overall score = " + "%1$.1f", applicantOne);
  System.out.println("");
  System.out.printf("Second applicant overall score = " + "%1$.1f", applicantTwo);


  if (n > m) {

   System.out.println("");
   System.out.println("The first applicant seems to be better");

  } else if (n < m) {

   System.out.println("");
   System.out.println("The second applicant seems to be better");


  } else if (n == m) {

   System.out.println("");
   System.out.println("The two applicants seem to be equal");

  }

  System.exit(1);

 }

}