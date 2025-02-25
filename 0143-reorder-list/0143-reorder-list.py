# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverse(self,head):
        cur=head
        pre=None
        next=None
        while cur:
            next=cur.next
            cur.next=pre
            pre=cur
            cur=next
        return pre
    def reorderList(self, head: Optional[ListNode]) -> None:
        if not head or not head.next:
            return
        slow,fast=head,head
        while fast and fast.next:
            slow=slow.next
            fast=fast.next.next
        second=self.reverse(slow.next)
        slow.next=None

        first=head
        while first and second:
          t1,t2=first.next,second.next
          first.next=second
          second.next=t1
          first,second=t1,t2      

        
        