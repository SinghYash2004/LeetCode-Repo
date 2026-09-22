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
    public ListNode partition(ListNode head, int x) {
        ListNode smaller = new ListNode(-1);
        ListNode greater = new ListNode(-1);
        ListNode temp1 = smaller;
        ListNode temp2 = greater;

        ListNode temp = head;
        while(temp!=null){
            if(temp.val<x){
                temp1.next = new ListNode(temp.val);
                temp1 = temp1.next;
                temp = temp.next;
            }else{
                temp2.next = new ListNode(temp.val);
                temp2 = temp2.next;
                temp = temp.next;
            }
        }
        temp1.next = greater.next;
        return smaller.next;
    }
}