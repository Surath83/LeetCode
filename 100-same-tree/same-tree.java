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
    public void bfs(Queue<String> q, TreeNode root){
        if(root == null){
            q.offer("null");
            return;
        }
        q.offer(Integer.toString(root.val));
        bfs(q,root.left);
        bfs(q,root.right);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<String> p1 = new LinkedList<>();
        Queue<String> q1 = new LinkedList<>();
        bfs(p1,p);
        bfs(q1,q);
        while(!p1.isEmpty() || !q1.isEmpty()){
            if(!p1.poll().equals(q1.poll())){
                return false;
            }
        }
        return true;
    }
}