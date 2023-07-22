package oops;

public interface PrintablePrice {
    public int price=500;

}

class Price implements PrintablePrice{

    public static void main(String[] args)
    {
        System.out.println(price);
    }

}