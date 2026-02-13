# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        if k==0 or head==None:
            return head
        temp=head
        count=1
        while temp.next:
            temp=temp.next
            count+=1
        temp.next=head
        k=k%count
        k=count-k
        t=head
        for i in range(k-1):
            t=t.next
        newhead=t.next
        t.next=None
        return newhead
            
        