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
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode curr = head.next;
        ListNode prev = head;

        while(curr!=null){
            if(curr.val>=prev.val){
                prev = curr;
                curr = curr.next;
                continue;
            }

            prev.next = curr.next;

            ListNode temp = head;
            ListNode tempPrev = null;

            while(temp!=null && temp.val<curr.val){
                tempPrev = temp;
                temp = temp.next;
            }

            if(temp==head){
                curr.next = head;
                head = curr;
            }else{
                curr.next = temp;
                tempPrev.next =curr;
            }

            curr = prev.next;
        }
        return head;
    }
}