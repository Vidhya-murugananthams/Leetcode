# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        if not head or not head.next:
            return
        slow=head
        fast=head
        while fast and fast.next and fast.next.next:
            slow=slow.next
            fast=fast.next.next
        cur=slow.next
        slow.next=None
        prev=None
        next=None
        while cur:
            next=cur.next
            cur.next=prev
            prev=cur
            cur=next
        first=head
        second=prev
        while second:
            fn=first.next
            sn=second.next
            first.next=second
            second.next=fn
            first=fn
            second=sn

        