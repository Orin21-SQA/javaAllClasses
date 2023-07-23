package class4;

public class NestedIfStatement {
    public static void main(String[]args){

        int height =150;

        if (height >= 160){

            if (height<=150){
                System.out.println("Taller");
            }
        }
        else {
            System.out.println("Smaller");
        }
    }
}
