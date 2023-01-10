public class ForLoopMystery {
   public static void main(String[] args) {
      for (int line = 1; line <= 5; line++) {
         for (int i = 1; i <= line; i++) {
            System.out.print("*");
         }
         for (int i = 5 - line; i >= 1; i--) {
            System.out.print("-");
         }
         System.out.println();
      }
   }
}