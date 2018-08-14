package reflect;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/8/9.
 */
public class Solution {
    public static void reflectDemo(Object obj,String fieldName) throws NoSuchFieldException, IllegalAccessException {
        Class clazz = obj.getClass();
        Field field = null;
        List<Field> list = new ArrayList();
        while(clazz != null ){
            try {
                field = clazz.getDeclaredField(fieldName);
                list.add(field);
            }catch(NoSuchFieldException e) {
                System.out.println("已经到达超类啦或者这个类没有这个属性");
            }
            field.setAccessible(true);
            clazz = clazz.getSuperclass();
        }
        for(Field fieldN : list){
            System.out.println(fieldN.get(obj));
        }

    }
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ClassC a = new ClassC();
        reflectDemo(a,"name");
    }
}
