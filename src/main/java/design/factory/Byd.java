package design.factory;

/**
 * Created by Administrator on 2018/8/7.
 */
public class Byd extends Car {
    @Override
    public void moreGas() {
        System.out.println("比亚迪正在加油");
    }

    @Override
    public void drive() {
        System.out.println("比亚迪正在跑");
    }
}
