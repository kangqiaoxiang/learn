package design.factory;

/**
 * Created by Administrator on 2018/8/7.
 */
public class BuyCarMain {
    public static void main(String[] args) {
        Car c1 = CarFactory.getCarInstance(500000);
        c1.moreGas();
        c1.drive();

        Car c2 = CarFactory.getCarInstance(100000);
        c2.moreGas();
        c2.drive();
    }
}
