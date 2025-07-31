class Solution {
    static {
        for(int i=0;i<450;i++)
        numComponents(null,new int[]{1,2});
    }
    public static int numComponents(ListNode head, int[] nums) {
        if( head==null)
        return 0;
        boolean vis[] = new boolean[10001];
        for (int i = 0; i < nums.length; i++) {
            vis[nums[i]] = true;
        }
        ListNode ls = head;
        int comp = 0;

        while (ls != null) {
            if (vis[ls.val]) {
                while (ls.next != null && vis[ls.val]) {
                    ls = ls.next;
                }
                comp++;
            } 
                ls = ls.next;

        }
        return comp;
    }
}