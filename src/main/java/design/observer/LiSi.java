package design.observer;

/**
 * Created by Administrator on 2018/8/7.
 */
public class LiSi implements Person {
    String name = "李四";

    @Override
    public void getMessage(String s) {
        System.out.println(name+"收到信息"+s);
    }
}
