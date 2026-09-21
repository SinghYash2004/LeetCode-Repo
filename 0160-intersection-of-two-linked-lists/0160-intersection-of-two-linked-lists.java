/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0;
        int lengthB = 0;

        ListNode skipA = headA;
        ListNode skipB = headB;

        while (skipA != null) {
            lengthA++;
            skipA = skipA.next;
        }

        while (skipB != null) {
            lengthB++;
            skipB = skipB.next;
        }

        skipA = headA;
        skipB = headB;

        if (lengthA > lengthB) {
            for (int i = 0; i < lengthA - lengthB; i++) {
                skipA = skipA.next;
            }
        } else {
            for (int i = 0; i < lengthB - lengthA; i++) {
                skipB = skipB.next;
            }
        }

        while (skipA != skipB) {
            skipA = skipA.next;
            skipB = skipB.next;
        }

        return skipA;
    }
}