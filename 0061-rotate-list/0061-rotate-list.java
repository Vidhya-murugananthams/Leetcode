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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Count the length of the list
        ListNode temp = head;
        int count = 1;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }

        // Make it circular
        temp.next = head;

        // Normalize k
        k = k % count;
        k = count - k;

        // Move to the (k)th node
        while (k-- > 0) {
            temp = temp.next;
        }

        // Break the circle
        ListNode newHead = temp.next;
        temp.next = null;

        return newHead;
    }
}
        