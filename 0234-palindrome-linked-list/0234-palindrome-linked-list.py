# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        slow=head
        fast=head
        while fast.next and fast.next.next:
            slow=slow.next
            fast=fast.next.next
        cur=slow.next;
        prev=None
        while cur:
            next=cur.next
            cur.next=prev
            prev=cur
            cur=next
        f=head
        s=prev
        while s and f:
            if s.val !=f.val:
                return False
            f=f.next
            s=s.next
        return True
