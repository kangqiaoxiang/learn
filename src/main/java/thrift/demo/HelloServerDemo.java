package thrift.demo;

import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;

/**
 * Created by Administrator on 2018/8/8.
 */
public class HelloServerDemo {
    public static final int SERVER_PORT = 8099;

    public void startServer(){
        try{
            System.out.println("HelloWorld TSimpleServer start...");
            TProcessor tProcessor = new HelloWorldService.Processor<HelloWorldService.Iface>(new HelloWorldImpl());
            //简单的单线程服务模型，一般用于测试
            TServerSocket serverSocket = new TServerSocket(SERVER_PORT);
            TServer.Args tArgs = new TServer.Args(serverSocket);
            tArgs.protocolFactory(new TBinaryProtocol.Factory());
            TServer server = new TSimpleServer(tArgs);
            server.serve();
        }catch(Exception e){
            System.out.println("Server start errror");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        HelloServerDemo server = new HelloServerDemo();
        server.startServer();
    }
}
