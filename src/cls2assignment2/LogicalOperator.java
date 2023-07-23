package cls2assignment2;

public class LogicalOperator {
    public static void main(String[]args){
        int x=500;
        int y=50;
        System.out.println((x<y)||(y>x)) ;//F
        System.out.println((x>y)&&(y<x)) ;//T
        System.out.println((x>y)&&(y!=x));//T
        System.out.println((x<y)&&(y<x)) ;//F


    }
}
