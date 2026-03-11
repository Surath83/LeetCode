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
    public void place(TreeNode root, PriorityQueue<Integer> p){
        if(p.isEmpty()) return;
        TreeNode temp = new TreeNode(p.poll());
        root.right = temp;
        place(root.right, p);
    }
    public void check(TreeNode root, PriorityQueue<Integer> p){
        p.offer(root.val);
        if(root.left != null) check(root.left, p);
        if(root.right != null) check(root.right, p);
    }
    public TreeNode increasingBST(TreeNode root) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        if(root == null) return root;
        check(root, p);
        TreeNode head = new TreeNode(p.poll());
        place(head, p);
        return head;
    }
}