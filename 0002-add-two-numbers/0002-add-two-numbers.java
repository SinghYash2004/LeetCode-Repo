/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int carry = 0;

        while (temp1 != null || temp2 != null || carry!=0) {
            int num = carry;

            if(temp1!=null){
                num+=temp1.val;
                temp1 = temp1.next;
            }

            if(temp2!=null){
                num+=temp2.val;
                temp2 = temp2.next;
            }

            temp.next = new ListNode(num%10);
            temp = temp.next;

            carry = num/10;
        }

        return head.next;
    }
}