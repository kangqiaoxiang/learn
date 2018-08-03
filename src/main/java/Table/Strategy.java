package Table;

/**
 * Created by Administrator on 2018/4/25.
 */
public interface Strategy {
    /**利用Object来代替数据元素的类型，提高啦程序的通用型，但
     * 带来啦数据元素之间比较大小或是否相等的问题
     * */
    //判断两个数据元素是否相等
    public boolean equal(Object obj1,Object obj2);
    //比较两个数据元素的大小
    public int compare(Object obj1,Object obj2);
}
