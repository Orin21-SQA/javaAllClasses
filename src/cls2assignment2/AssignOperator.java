package cls2assignment2;

public class AssignOperator {
public static void main(String[]args){
    int x=100;
    int y=20;
    int z;
    z = x;
    System.out.println(z);//100
    x+=20;
    System.out.println(x);//120
    z-=10;
    System.out.println(z);//90

    y*=10;
    System.out.println(y);//200

    x/=y;
    System.out.println(x);//0

    x%=y;
    System.out.println(x);//0
}
}
