package linkedlist.leetcode_linkedlist;

/**
 * Created by Administrator on 2018/8/10.
 */
public class RemoveLinkeListElements {
    public ListNode removeElements(ListNode head, int val) {
        //如果传进来的节点是头结点，则删除头结点，并让下一个节点为头结点
        while(head != null && head.val == val){
            /**
             * 如何删除头结点
             */
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
        }
        if(head == null){
            return null;
        }
        /**
         * 当他不是第一个元素的时候，就是删除中间元素
         */
        ListNode pre = head;
        while(head.next != null){
            if(head.next.val == val){
                ListNode delNode = head.next;
                head.next = delNode.next;
                delNode.next = null;
            }
            else{
                pre = head.next;
            }
        }

        return head;
    }

    //反序
    public ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    //中间节点
    //删除排序链表中的重复元素(if,else的注意点)
    public ListNode deleteDuplicates(ListNode head){
        ListNode now = head;
        if(now == null){
            return head;
        }
        while(now.next != null){
            if(now.val == now.next.val){
                now.next = now.next.next;
            }else{
                now = now.next;
            }

        }
        return head;
    }
}
