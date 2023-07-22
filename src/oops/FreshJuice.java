package oops;//package

//class & Variable
public class FreshJuice {
    private static int price=500;
    public String juice_name="mango";
    public String juice_size= "medium";

    public FreshJuice( String juice_name,  String juice_size) {
        this.juice_name = juice_name;
        this.juice_size = juice_size;
    }

    public FreshJuice() {

    }


    public static void main(String args[]) {
            FreshJuice juice = new FreshJuice();
            System.out.println("juice_name: " + juice.juice_name);
            System.out.println("juice_size:" + juice.juice_size);
            System.out.println("price: " + juice.price);
        }

}
