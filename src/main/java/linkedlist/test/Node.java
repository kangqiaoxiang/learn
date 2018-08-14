package linkedlist.test;

/**
 * Created by Administrator on 2018/8/10.
 */
public class Node {
    private int Data;
    private Node Next;
    public Node(int Data){
        this.Data = Data;
    }

    public int getData() {
        return Data;
    }

    public void setData(int Data) {
        this.Data = Data;
    }

    public Node getNext() {
        return Next;
    }

    public void setNext(Node Next) {
        this.Next = Next;
    }

}
