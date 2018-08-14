package Arrays.own_array;

/**
 * Created by Administrator on 2018/8/7.
 */
public class Array<E> {
    private E[] data;
    private int size;

    /**
     * 构造函数
     * @param capacity:传入数组的容量，构造Array
     */
    public Array(int capacity){
        data = (E[])new Object[capacity];
        size = 0;
    }

    /**
     * 无参数的构造函数，默认数组的容量capacity=10
     */
    public Array(){
        this(10);
    }
    /**
     * 获取数组的容量
     */
    public int getCapacity(){
        return data.length;
    }

    public static void main(String[] args) {
        int[] a = new int[]{};
        System.out.println(a.length);
    }
    /**
     * 获取数组中元素的个数
     */
    public int getSize(){
        return size;
    }
    /**
     * 返回数组是否为空
     */
    public boolean isEmpty(){
        return size == 0;
    }
    /**
     * 在index索引的位置插入一个新元素e
     */
    public void add(int index,E e){
        if(size == data.length){
            throw new IllegalArgumentException("Add failed. Array is full.");
        }
        if(index < 0 || index > size){
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");
        }
        /**
         * for循环的执行顺序：先执行表达式1，再执行表达式2，判断为真
         * 则执行循环体，循环体执行完后执行表达式3
         */
        for(int i = size -1;i >= index; i--){
            data[i+1] = data[i];
        }
        data[index] = e;
        size++;
    }
    /**
     * 向所有元素后添加一个新元素
     */
    public void addLast(E e){
        add(size,e);
    }
    /**
     *在所有元素前添加一个新元素
     */
    public void addFirst(E e){
        add(0,e);
    }
    /**
     * 获取index索引位置的元素
     */
    public E get(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        }
        return data[index];
    }
    /**
     * 修改index索引位置的元素为e
     */
    public void set(int index,E e){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("Set failed. Index is illegal.");
        }
        data[index] = e;
    }
    /**
     * 查看数组中是否含有元素e
     */
    public boolean contains(E e){
        for(int i = 0;i < size; i++){
            if(data[i] .equals(e) ){
                return true;
            }
        }
        return false;
    }
    /**
     * 查找数组中元素e所在的索引，如果不存在元素，则返回-1
     */
    public int find(E e){
        for(int i = 0;i<size; i++){
            if(data[i].equals(e)){
                return i;
            }
        }
        return -1;
    }
    /**
     * 从数组删除index位置的元素，返回删除的元素
     */
    public E remove(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Remove failed. Index is illegal.");
        }
        E ret = data[index];
        for(int i = index+1;i< size;i++){
            data[i-1] = data[i];
        }
        size --;
        data[size] = null;
        return ret;
    }
    // 从数组中删除第一个元素, 返回删除的元素
    public E removeFirst(){
        return remove(0);
    }

    // 从数组中删除最后一个元素, 返回删除的元素
    public E removeLast(){
        return remove(size - 1);
    }

    // 从数组中删除元素e
    public void removeElement(E e){
        int index = find(e);
        if(index != -1)
            remove(index);
    }
    @Override
    public String toString(){
        StringBuffer res = new StringBuffer();
        res.append(String.format("Array:size = %d, capacity = %d\n", size, data.length));
        res.append('[');
        for(int i = 0 ; i < size ; i ++){
            res.append(data[i]);
            if(i != size - 1)
                res.append(", ");
        }
        res.append(']');
        return res.toString();
    }

}
