import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

/**
 * Created by Administrator on 2018/8/8.
 */
public class jsontest {
    /**
     * 序列化：序列化就是JavaBean对象转化为JSON格式的字符串；
     *public static final String toJSONString(Object object);//将JavaBean序列化为JSON文本
     * 反序列化的常见api
     * public static final JSONObject parseObject(String text)； // 把JSON文本parse成JSONObject
     * public static final JSONArray parseArray(String text); // 把JSON文本parse成JSONArray
     */
    /**
     * public static final Object parse(String text); // 把JSON文本parse为JSONObject或者JSONArray
     public static final JSONObject parseObject(String text)； // 把JSON文本parse成JSONObject
     public static final <T> T parseObject(String text, Class<T> clazz); // 把JSON文本parse为JavaBean
     public static final JSONArray parseArray(String text); // 把JSON文本parse成JSONArray
     public static final <T> List<T> parseArray(String text, Class<T> clazz); //把JSON文本parse成JavaBean集合
     public static final String toJSONString(Object object); // 将JavaBean序列化为JSON文本
     public static final String toJSONString(Object object, boolean prettyFormat); // 将JavaBean序列化为带格式的JSON文本
     public static final Object toJSON(Object javaObject); 将JavaBean转换为JSONObject或者JSONArray。
     */

    @Test
    public void jsontest1(){
        String jsontext="{\"name\":\"wjk\",\"age\":\"22\"," +
                "\"love\":[{\"love1\":\"coding\",\"love2\":\"movie\"}," +
                "{\"love1\":\"money\",\"love2\":\"NBA\"}]}";//定义json文本
        System.out.println(jsontext);
        JSONObject m1 = JSON.parseObject(jsontext);
        System.out.println(m1);

        String jsonarraytext = m1.getString("love");
        System.out.println(jsonarraytext);

        JSONArray m2 = JSON.parseArray(jsonarraytext);
        System.out.println(m2);
    }
}
