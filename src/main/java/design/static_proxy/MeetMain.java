package design.static_proxy;

/**
 * Created by Administrator on 2018/8/7.
 */
public class MeetMain {
    public static void main(String[] args) {
        Star star = new Star("鞠槿帏");
        ProxyMeet meet = new Company(star);
        meet.run();
    }
}
