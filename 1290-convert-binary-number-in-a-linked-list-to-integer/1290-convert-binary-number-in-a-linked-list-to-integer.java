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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int length = 0;
        while(temp.next != null){
            length++;
            temp = temp.next;
        }

        temp = head;
        int ans = 0;
        while(temp != null){
            ans += temp.val * (int) Math.pow(2, length--);
            temp = temp.next;
        }
        return ans;
    }
}