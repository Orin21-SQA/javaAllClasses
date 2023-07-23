package Polymorphism;

public class MainTest {

    public static void main (String[]args){
        BangladeshBank bangladeshBank =new BangladeshBank();
        Bbl bbl=new Bbl();
        Prime prime=new Prime();
        System.out.println("Bangladesh Bank: "+bangladeshBank.InterestRate());
        System.out.println("Bbl: "+bbl.InterestRate());
        System.out.println("Prime: "+prime.InterestRate());

    }
}
