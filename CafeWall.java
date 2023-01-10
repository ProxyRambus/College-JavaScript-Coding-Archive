import java.awt.*;

public class CafeWall {
   
   public static void main(String [] args) {
      DrawingPanel panel = new DrawingPanel(650, 400);
      Graphics g = panel.getGraphics();
      
      panel.setBackground(Color.GRAY);
      
      row(g,0,0,4,25);
      row(g,50,70,5,30);
      grid(g,10,150,4,25,0);
      grid(g,250,200,3,25,10);
      grid(g,425,180,5,20,10);
      grid(g,400,20,2,35,35);
   }
   
   public static final int MORTAR = 2;
   
   public static void grid(Graphics g, int x, int y, int PAIRS, int SIZE, int OFFSET) {
      int a = y;
      for(int i = 0; i < PAIRS; i++) {
         row(g,x,a,PAIRS,SIZE);
         a += 2*SIZE + 2*MORTAR;
      }    
      
      int b = y;
      int OFFSETX = x + OFFSET;
      b += SIZE + MORTAR;
      for(int i = 0; i < PAIRS; i++) {
         row(g,OFFSETX,b,PAIRS,SIZE);
         b += 2*SIZE + 2*MORTAR;
      }   
   
   }
   public static void row(Graphics g, int x, int y, int PAIRS, int SIZE) {
      for(int i = 0; i < PAIRS; i ++) {
         squarePair(g,x,y,PAIRS,SIZE,i);
      }
   }  
         
         
   public static void squarePair(Graphics g, int x, int y, int PAIRS, int SIZE, int i) {
         for(int a = 0; a <= i; a++){
         
         g.setColor(Color.BLACK); 
         g.fillRect(x,y,SIZE,SIZE);
         g.setColor(Color.BLUE);
         g.drawLine(x,y,x + SIZE,y + SIZE);
         g.drawLine(x,y + SIZE,x + SIZE,y);
      
         g.setColor(Color.WHITE);
         g.fillRect(x + SIZE,y,SIZE,SIZE);
         x = x + 2*SIZE;
      }
      }
      public static void tom(Graphics g, int x, int y, int PAIRS, int SIZE, int i) {
         g.setColor(Color.RED);
         g.fillRect(x + 20,y + 5, 106, 23);
      }
   
   
   
}

