/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static void in(ArrayList<TreeNode>ans,TreeNode root){
        if(root==null) return;
        in(ans,root.left);
        ans.add(root);
        in(ans, root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<TreeNode>ans=new ArrayList<>();
        in(ans,root);
        return help(ans,0);
    }
    public TreeNode help(ArrayList<TreeNode>ans,int i){
        if(i==ans.size()) return null;
        TreeNode root = ans.get(i);
        root.left = null;
        root.right = help(ans, i+1);
        return root;
    }
}
