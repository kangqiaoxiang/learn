package stacks;

/**
 * Created by Administrator on 2018/8/9.
 */
public interface Stack<E> {

    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
}
