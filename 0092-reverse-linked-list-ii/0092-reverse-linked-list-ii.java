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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right) return head;
        ListNode temp1 = head;
        ListNode temp2 = head;
        ListNode prev1 = null;
        ListNode next1 = null;


        for(int i = 1; i<left; i++){
            prev1 = temp1;
            temp1 = temp1.next;
        }

        for(int i = 1; i<right; i++){
            temp2 = temp2.next;
        }
        next1 = temp2.next;

        ListNode curr = temp1;
        ListNode prev = next1;

        while(curr!=next1){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        if(prev1!=null) prev1.next = temp2;
        else head = temp2;
        return head;
    }
}