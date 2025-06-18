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
    TreeNode root = null;
    public TreeNode sortedArrayToBST(int[] nums) {
        populatedSorted(nums, 0, nums.length);
        return root;
    }
    private void insert(int value){
        root = insert(value,root);
    }
    private TreeNode insert(int value, TreeNode root) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }

        if (value < root.val) {
            root.left = insert(value, root.left);
        }

        if (value > root.val) {
            root.right = insert(value, root.right);
        }
        return root;
    }
    public void populatedSorted(int[] nums) {
        populatedSorted(nums, 0, nums.length);
    }

    private void populatedSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        this.insert(nums[mid]);
        populatedSorted(nums, start, mid);
        populatedSorted(nums, mid + 1, end);
    }
}
