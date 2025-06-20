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
    public int height=0;
    public boolean isBalanced(TreeNode root) {
        return bal(root);
    }
    public int he(TreeNode root){
        if(root==null) return -1;
        int lHeight = he(root.left);
        int rHeight = he(root.right);

        return Math.max(lHeight, rHeight) + 1;
    }
    public boolean bal(TreeNode root){
        if(root==null) return true;

        return (Math.abs(he(root.left) - he(root.right)) <= 1) && bal(root.left) && bal(root.right);
    }

}
