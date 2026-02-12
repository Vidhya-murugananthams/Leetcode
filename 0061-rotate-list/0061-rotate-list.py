# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        if not head or not head.next or k==0:
            return head
        temp=head
        count=1
        while temp.next:
            count+=1
            temp=temp.next
        temp.next=head
        k=k%count
        k=count-k-1
        temp=head
        while k>0:
            temp=temp.next
            k-=1
        t=temp.next
        temp.next=None
        return t
        
        
        