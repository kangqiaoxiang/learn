package design.observer;

/**
 * Created by Administrator on 2018/8/7.
 */
public class ObserverMain {
    public static void main(String[] args) {
      Supermarket supermarket = new Supermarket();
      ZhangSan zhangSan = new ZhangSan();
      LiSi liSi = new LiSi();
      supermarket.personRegister(zhangSan);
      supermarket.personRegister(liSi);
      supermarket.sendMessage("超市今天大减价啦!");

      supermarket.unPersonRegister(liSi);
      supermarket.sendMessage("超市明天也减价");
    }
}
