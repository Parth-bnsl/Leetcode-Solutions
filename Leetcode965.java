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
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;
        int target = root.val;
        return isUnivalTree(root.left,target) && isUnivalTree(root.right,target);
    }
    public boolean isUnivalTree(TreeNode root,int target){
        if(root == null) return true;
        else if(root.val == target) return isUnivalTree(root.left,target) && isUnivalTree(root.right,target);
        return false;
    }
}
