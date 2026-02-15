# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        slow=head
        fast=head
        while fast.next and fast.next.next:
            slow=slow.next
            fast=fast.next.next
        cur =slow.next
        slow.next=None
        p=None
        n=None
        while cur:
            n=cur.next
            cur.next=p
            p=cur
            cur=n
        first=head
        second=p
        while second:
            fn=first.next
            sn=second.next
            first.next=second
            second.next=fn
            first=fn
            second=sn
