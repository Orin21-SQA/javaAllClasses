package class4;

public class ForEachLoop {
    public static void main(String[]args){
        int number []={1,2,3,4,5,6,};
        String[] names={"X","Y","Z"};
        double []money = {150,275.25,500};

        for (int Number :number){
            System.out.println(Number);
        }
        for (String Name : names){
            System.out.println(Name);
        }
        for (double Money : money){
            System.out.println(Money);
        }
    }
}
