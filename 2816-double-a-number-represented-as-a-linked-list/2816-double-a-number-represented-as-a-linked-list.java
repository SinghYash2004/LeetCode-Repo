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
    public ListNode doubleIt(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;

        while(temp!=null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        head = prev;
        temp = head;
        int carry = 0;
        while(temp!=null){
            int digit = (temp.val*2) + carry;
            temp.val = digit%10;
            carry = digit/10;
            prev = temp;
            temp = temp.next;
        }
        if(carry!=0){
            prev.next = new ListNode(carry);
            prev = prev.next;
        }

        temp = head;
        prev = null;

        while(temp!=null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
}