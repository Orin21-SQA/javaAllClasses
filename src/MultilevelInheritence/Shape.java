package MultilevelInheritence;


public class Shape {
    public void display() {
        System.out.println("Inside display");
    }
    public static void main(String[] arguments) {
        Cube cube = new Cube();
        cube.display();
        cube.area();
        cube.volume();
    }
}
