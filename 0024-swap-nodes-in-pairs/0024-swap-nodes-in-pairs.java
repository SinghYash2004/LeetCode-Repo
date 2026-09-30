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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode prev = null;
        ListNode temp = head;
        head = temp.next;

        while(temp!=null && temp.next!=null){

            ListNode tempNext = temp.next;
            temp.next = tempNext.next;
            tempNext.next = temp;

            if(prev!=null){
                prev.next = tempNext;
            }

            prev = temp;
            temp = temp.next;
        }
        return head;
    }
}