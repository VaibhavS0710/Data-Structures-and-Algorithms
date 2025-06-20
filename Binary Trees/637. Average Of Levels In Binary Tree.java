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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();

        if(root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int levelSize = q.size();
            double avg = 0;
            for(int i=0; i<levelSize; i++){
                TreeNode currVal = q.poll();
                avg += currVal.val;
                if(currVal.left!=null){
                    q.offer(currVal.left);
                }
                if(currVal.right!=null){
                    q.offer(currVal.right);
                }
            }
            avg = avg / levelSize;
            res.add(avg);
        } 
        return res;
    }
}
