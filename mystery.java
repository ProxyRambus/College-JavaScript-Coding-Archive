public class mystery {
   public static void main(String[] args) {
   
   ifElseMystery(4,4);
   
   }

   public static void ifElseMystery(int a, int b) {
      if (a > b || a % 2 == 0) {
         a++;
         b--;
      } else if (a % 2 == 1) {
         b = 0;
      }
      if (b == 0 && b != a) {
         a = a + 2;
         b = a - 2;
      }
      System.out.println(a + " " + b);
   }
}