package class4;

public class IfElseIfLadder {
    public static void main(String[]args){

        int mark =33;
        if (mark >= 80 && mark <=100){
            System.out.println("A++");
        }
        else if (mark >=70 && mark <=79){
            System.out.println("A");
        }
        else if (mark >=60 && mark <=69){
            System.out.println("A-");
        }
        else if (mark >= 50 && mark<=59){
            System.out.println("B+");
        }
        else if (mark >=40 && mark<=49){
            System.out.println("C");
        }
        else {
            System.out.println("Fail");
        }
    }
}
