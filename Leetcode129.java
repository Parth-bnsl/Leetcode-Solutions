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
    int num = 0;
    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        num = num*10 + root.val;
        int ans = 0;
        if(root.left != null)
            ans += sumNumbers(root.left);
        if(root.right != null)
            ans += sumNumbers(root.right);
        if(root.left == null && root.right == null)
            ans = num;
        num/= 10;
        return ans;
    }
}
