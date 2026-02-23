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
    public void sum(TreeNode root,Queue<Integer> q){
        if(root == null) return;
        if(root.left == null){
            sum(root.right,q);
            return;
        }
        if(root.left.left == null && root.left.right == null){
            q.offer(root.left.val);
        }
        sum(root.left,q);
        sum(root.right,q);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        Queue<Integer> q = new LinkedList<>();
        sum(root,q);
        int sum = 0;
        while(!q.isEmpty()){
            sum += q.poll();
        }
        return sum;
    }
}