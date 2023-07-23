package Hierarchical;

public class ThreeWheeler extends Vehicle{
    double increasePrice = 1;

    void finalPrice() {
        Price = Price + (Price * increasePrice);
        System.out.println(
                "The price of car is " + Price
        );
    }
}
