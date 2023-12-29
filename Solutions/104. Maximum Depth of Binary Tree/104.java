class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        if(root.left==null && root.right==null)return 1;
        return Math.max(maxDepth(root.right)+1,maxDepth(root.left)+1);
    }
}