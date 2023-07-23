package Hierarchical;

public class MainTest {
    public static void main(String[] args) {

        TwoWheeler bike = new TwoWheeler();
        ThreeWheeler baby_taxi = new ThreeWheeler();
        bike.showPrice();
        bike.finalPrice();
        baby_taxi.showPrice();
        baby_taxi.finalPrice();
    }
}
