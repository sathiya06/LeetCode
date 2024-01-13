class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        getLeaves(root1, al1);
        getLeaves(root2, al2);
        if(al1.size() != al2.size()){
            return false;
        }
        for(int i = 0; i < al1.size(); i++){
            if(al1.get(i) != al2.get(i)){
                return false;
            }
        }
        return true;
    }
    public void getLeaves(TreeNode root, ArrayList<Integer> al){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            al.add(root.val);
        } 
        getLeaves(root.left, al);
        getLeaves(root.right, al);
    }
}