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
    ListNode reverse(ListNode head)
    {
        ListNode cur=head,pre=null,next=null;
        while (cur!=null)
        {
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast !=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=reverse(slow);
        ListNode cur1=head,cur2=head2;
        while (cur1!=null && cur2!=null)
        {
            if (cur1.val!=cur2.val)
            {
                return false;
            }
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return true;
        
    }
}