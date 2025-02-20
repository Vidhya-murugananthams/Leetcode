class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        return buildBST(head, null); 
    }

    private TreeNode buildBST(ListNode head, ListNode stop) {
        if (head == stop) return null; 

        // Find the middle node using slow and fast pointers
        ListNode slow = head, fast = head;
        while (fast != stop && fast.next != stop) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // The middle node becomes the root of the BST
        TreeNode node = new TreeNode(slow.val);

        // Recursively build the left and right subtrees
        node.left = buildBST(head, slow);
        node.right = buildBST(slow.next, stop);

        return node;
    }
}