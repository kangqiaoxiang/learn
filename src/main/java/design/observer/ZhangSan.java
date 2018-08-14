package design.observer;

/**
 * Created by Administrator on 2018/8/7.
 */
public class ZhangSan implements Person {
    String name = "张三";
    @Override
    public void getMessage(String s) {
        System.out.println(name+"收到消息"+s);
    }
}
