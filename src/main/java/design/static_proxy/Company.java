package design.static_proxy;

/**
 * Created by Administrator on 2018/8/7.
 */
public class Company implements ProxyMeet {
    private ProxyMeet proxyMeet;
    public Company(ProxyMeet proxyMeet){
        this.proxyMeet = proxyMeet;
    }
    @Override
    public void run() {
        System.out.println("计划安排");
        System.out.println("场地布置");
        System.out.println("邀请参与者");
        System.out.println("展会开始");
        proxyMeet.run();
        System.out.println("展会结束");
        System.out.println("场地收拾");
    }
}
