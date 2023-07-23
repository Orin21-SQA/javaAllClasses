package interface1;

public interface Drawable {
    static void drawArea() {
    }

    void draw();
     default void printMessage (){
         System.out.println("print a message");
         drawCircle();

     }

      static int drawArea(int length){
         return length*length;
     }

     private void drawCircle(){
         System.out.println("Circle area:"+(3.1416*14));

     }
}
