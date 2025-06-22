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
    public boolean isValidBST(TreeNode root) {
        return help(root, null, null);
    }
    public boolean help(TreeNode n, Integer low, Integer high){
        if(n==null) return true;

        if(low!=null && n.val<=low) return false;
        if(high!=null && n.val>=high) return false;

        boolean le = help(n.left, low, n.val);
        boolean ri = help(n.right, n.val, high);

        return le && ri;
    }
}
