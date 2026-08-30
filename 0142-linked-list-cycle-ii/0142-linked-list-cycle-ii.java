/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        HashSet<ListNode> set = new HashSet<>();

        while (fast != null && fast.next != null) {
            if (!set.add(slow)) {
                return slow;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return null;
    }
}