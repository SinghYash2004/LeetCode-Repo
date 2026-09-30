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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode start = head;
        ListNode end = head;

        ListNode newHead = null;
        ListNode prevTail = null;

        while(end!=null){
            end = start;

            for(int i = 1; i<k && end!=null; i++){
                end = end.next;
            }

            if(end==null){
                break;
            }

            ListNode nextNode = end.next;
            end.next = null;
            ListNode reversedHead = reverse(start);

            if(start==head){
                newHead = reversedHead;
            }else{
                prevTail.next = reversedHead;
            }

            prevTail = start;
            start.next = nextNode;  
            start = nextNode;
        }
        return newHead;
    }


    public ListNode reverse(ListNode head){
        ListNode temp = head;
        ListNode prev = null;

        while(temp!=null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
}