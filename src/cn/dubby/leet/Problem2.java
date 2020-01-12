package cn.dubby.leet;

/**
 * @author dubby
 * @date 2020/1/12 14:48
 */
public class Problem2 {

    public static void main(String[] args) {
        ListNode l11 = new ListNode(9);

        ListNode l21 = new ListNode(1);
        ListNode l22 = new ListNode(9);
        ListNode l23 = new ListNode(9);
        l21.next = l22;
        l22.next = l23;

        ListNode listNode = addTwoNumbers(l11, l21);
        System.out.println(listNode.val);
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode index = null;

        int sum = 0;
        if (l1 != null) {
            sum += l1.val;
            l1 = l1.next;
        }

        if (l2 != null) {
            sum += l2.val;
            l2 = l2.next;
        }

        int promotion = 0;
        if (sum >= 10) {
            promotion = sum / 10;
            result = new ListNode(sum % 10);
            index = result;
        } else {
            result = new ListNode(sum);
            index = result;
        }

        while (l1 != null || l2 != null || promotion != 0) {
            sum = promotion;
            promotion = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            if (sum >= 10) {
                promotion = sum / 10;
                ListNode temp = new ListNode(sum % 10);
                index.next = temp;
                index = temp;
            } else {
                ListNode temp = new ListNode(sum);
                index.next = temp;
                index = temp;
            }
        }

        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
