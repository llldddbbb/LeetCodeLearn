package question002;

import java.util.List;

/**
 * AddTwoNumbers
 *
 * @author bobbi
 * @date 2019/04/03 19:21
 * @email 571002217@qq.com
 * @description
 * 你有两个非空链表表示两个非负整数。数字存储在相反的顺序和每个节点包含一个数字。添加两个数字并返回一个链表。 　　
 * 　　你可能认为这两个数字不包含任何前导零,除了数字0本身。
 */
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode curr = result;
        int carry = 0;
        while (l1!=null||l2!=null) {
            int x = l1==null?0:l1.val;
            int y = l2==null?0:l2.val;
            int sum = x + y + carry;
            curr.next = new ListNode(sum%10);
            carry = sum/10;
            if(l1 !=null) {
                l1= l1.next;
            }
            if(l2 !=null) {

                l2 = l2.next;
            }
            curr = curr.next;
        }
        if(carry > 0) {
            curr.next = new ListNode(carry);
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(3);
        a.next = b;
        b.next = c;

        ListNode d = new ListNode(5);
        ListNode e = new ListNode(6);
        ListNode f = new ListNode(4);
        d.next = e;
        e.next = f;
        AddTwoNumbers.addTwoNumbers(a,d);

    }
    public static void printLinkNode(ListNode a) {
        while (a!=null) {
            System.out.println(a.val);
            a = a.next;
        }
    }
}
