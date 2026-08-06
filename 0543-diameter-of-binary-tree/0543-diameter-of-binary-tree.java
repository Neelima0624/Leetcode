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
   if(root==null){
            return 0;
        }
        int left=right(root.left);
        int right=depth()
        depth(root);

        return diameter;
    }
      public int depth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left= depth(root.left);
        int right =depth(root.right);
        this.diameter=Math.max(diameter,left+right);
        return Math.max(left,right)+1;
 *     }
 * }
 */
class Solution {

    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {

        depth(root);

        return diameter;
    }

    public int depth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = depth(root.left);
        int right = depth(root.right);

        diameter = Math.max(diameter, left + right);

        return Math.max(left, right) + 1;
    }
}