package interface1;

public class InterfaceTest {
    public static void main(String[] args) {
        Banking bank=new CityBank();
        System.out.println("Citybank interest rate :"+bank.getInterestRate());
        CityBank cityBank =new CityBank();
        cityBank.givenLoan();
        System.out.println("Citybank interest rate :"+cityBank.getInterestRate());

        System.out.println(Drawable.drawArea(30));
        Drawable drawable=new Square();
        Drawable.drawArea();
        drawable.printMessage();


    }}
