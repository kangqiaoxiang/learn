package linkedlist.test;

/**
 * Created by Administrator on 2018/8/10.
 */
public class LinkTest {
    public static void main(String[] args) {
        Node head = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        // 打印反转前的链表
        Node h = head;
        while (null != h) {
            System.out.print(h.getData() + "->");
            h = h.getNext();
        }
        System.out.println("\n++++++++++++++++++++++");

        System.out.println(middleNode(head).getData());
    }

    //中间节点:利用快慢指针，快的走两步，慢的走一步
    public static Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null){
            if(fast.getNext() != null){
                fast = fast.getNext().getNext();
            }else{
                break;
            }
            slow = slow.getNext();
        }
        return slow;
    }
}
