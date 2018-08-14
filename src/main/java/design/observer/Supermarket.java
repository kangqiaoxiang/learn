package design.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2018/8/7.
 */
public class Supermarket {
    List<Person> personList = new ArrayList<Person>();

    //注册
    public void personRegister(Person p){
        personList.add(p);
    }

    //取消注册
    public void unPersonRegister(Person p){
        //list的remove操作，用迭代器进行操作
        Iterator iterator = personList.iterator();
        while(iterator.hasNext()){
            Person person = (Person) iterator.next();
            if(person.getClass().equals(p.getClass())){
                iterator.remove();
            }
        }

    }

    //发送消息
    public void sendMessage(String s){
        for(Person p : personList){
            p.getMessage(s);
        }
    }
}
