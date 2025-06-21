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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        
        if (root == null) return res;

        Deque<TreeNode> q = new LinkedList<>();
        q.offer(root);

        boolean reverse = false;

        while(!q.isEmpty()){
            int levSize = q.size();
            List<Integer> level = new ArrayList<>(levSize);
            for(int i=0; i<levSize; i++){
                if(!reverse){
                    TreeNode node = q.pollFirst();
                    level.add(node.val);
                    if (node.left != null) q.addLast(node.left);                    
                    if (node.right != null) q.addLast(node.right);
                }else{
                    TreeNode node = q.pollLast();
                    level.add(node.val);              
                    if (node.right != null) q.addFirst(node.right);
                    if (node.left != null) q.addFirst(node.left);
                }                
            }
            reverse = !reverse;
            res.add(level);
        }
        return res;
    }
}
