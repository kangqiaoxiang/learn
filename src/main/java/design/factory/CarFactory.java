package design.factory;

/**
 * Created by Administrator on 2018/8/7.
 */

public class CarFactory {
    /**
     * 由factory工厂来决定你将创建哪个类
     * @param amount
     * @return
     */
    public static Car getCarInstance(double amount){
        Car c = null;
        if(amount >= 400000){
            c = new Benz();
        }else{
            c = new Byd();
        }
        return c;
    }
}
