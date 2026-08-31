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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = {-1, -1};

        if (head == null || head.next == null || head.next.next == null) {
            return ans;
        }

        List<Integer> list = new ArrayList<>();

        int nodenumber = 2;
        ListNode temp = head.next;
        ListNode prev = head;
        while(temp.next!=null){
            ListNode next = temp.next;
            if((prev.val>temp.val && next.val>temp.val) || (prev.val<temp.val && next.val<temp.val)){
                list.add(nodenumber);
            }
            nodenumber++;
            prev = temp;
            temp = next;
        }

        if(list.size()<2){
            return ans;
        }

        ans[1] = list.get(list.size()-1) - list.get(0);

        int min = Integer.MAX_VALUE;

        for (int i = 1; i < list.size(); i++) {
            min = Math.min(min, list.get(i) - list.get(i - 1));
        }

        ans[0] = min;

        return ans;
    }
}