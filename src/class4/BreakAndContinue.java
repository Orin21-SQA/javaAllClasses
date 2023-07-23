package class4;

public class BreakAndContinue {
    public static void main(String[]args){
        for (int i=0;i<50;i++){
            if (i==5) continue;
            System.out.println("count" +i);
        }
        for (int j=0;j<20;j++){
            if (j==10) break;
            System.out.println("count" +j);
        }
    }
}
