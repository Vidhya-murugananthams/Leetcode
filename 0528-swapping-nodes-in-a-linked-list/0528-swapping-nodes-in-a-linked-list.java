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
    public ListNode swapNodes(ListNode head, int k) 
    {
        if(head==null || head.next==null) return head;
         ListNode start = head;
        // Move start to the k-th node from the beginning
        for (int i = 1; i < k; i++) {
            start = start.next;
        }

        ListNode end = head;
        ListNode dummy = start;

        // Move dummy to the end, moving end simultaneously
        while (dummy.next != null) {
            dummy = dummy.next;
            end = end.next;
        }

        // Swap values of start and end nodes
        int temp = start.val;
        start.val = end.val;
        end.val = temp;

        return head;
        
    }
}