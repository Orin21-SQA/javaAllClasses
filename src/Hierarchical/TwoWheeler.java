package Hierarchical;

public class TwoWheeler extends Vehicle{
    double increasePrice = 0.20;

    void finalPrice() {
        Price = Price + (Price * increasePrice);
        System.out.println(
                "The price of bike is " + Price
        );
    }
}
