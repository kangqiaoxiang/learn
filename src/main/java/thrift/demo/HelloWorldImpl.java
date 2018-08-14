package thrift.demo;

import org.apache.thrift.TException;

/**
 * Created by Administrator on 2018/8/8.
 */
public class HelloWorldImpl implements HelloWorldService.Iface {
    public HelloWorldImpl(){

    }
    @Override
    public String sayHello(String username) throws TException {
        return "Hi,"+ username + "welcome to thrift world";
    }
}
