package design.factory;

/**
 * Created by Administrator on 2018/8/7.
 */
public class Benz extends Car {
    @Override
    public void moreGas() {
        System.out.println("奔驰车正在加油");
    }

    @Override
    public void drive() {
        System.out.println("奔弛车正在跑");
    }
}
