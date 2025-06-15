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
    public int sumNumbers(TreeNode root) {
        return help(root, 0);
    }
    private int help(TreeNode n, int sum){
        if(n==null) return 0;
        sum = sum*10 + n.val;
        if(n.left == null && n.right == null){
            return sum;
        }
        return help(n.left, sum) + help(n.right, sum);
    }
}
