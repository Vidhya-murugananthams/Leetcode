# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapNodes(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        i = 1
        fast = slow = head
        prev_fast = None
        prev_slow = None
        while i < k:
            prev_fast = fast
            fast = fast.next
            i += 1
        begin_node = fast
        while fast and fast.next:
            prev_slow = slow
            slow = slow.next
            fast = fast.next
        end_node = slow
        if begin_node == end_node:
            return head
        if prev_slow:
            prev_slow.next = begin_node
        else:
            head = fast

        if prev_fast:
            prev_fast.next = end_node
        else:
            head = slow

        fast_next_node = begin_node.next
        slow_next_node = end_node.next
        begin_node.next = slow_next_node
        end_node.next = fast_next_node
        return head

        