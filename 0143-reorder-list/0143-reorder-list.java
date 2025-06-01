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
    public void reorderList(ListNode head) {
         if (head == null || head.next == null) return;

        // Step 1: Find the middle node
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        ListNode head2 = reverse(slow.next);
        slow.next = null; // Split the list into two halves

        // Step 3: Merge the two halves
        ListNode head1 = head;
        while (head1 != null && head2 != null) {
            ListNode tmp1 = head1.next;
            ListNode tmp2 = head2.next;

            head1.next = head2;
            head2.next = tmp1;

            head1 = tmp1;
            head2 = tmp2;
        }
    }

    // Helper function to reverse a linked list
    private ListNode reverse(ListNode node) {
        ListNode prev = null, curr = node;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
        
    }