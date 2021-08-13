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
    public int findBottomLeftValue(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            Queue<TreeNode> temp = new LinkedList<TreeNode>();
            TreeNode res = q.peek();
            while(!q.isEmpty()){
                TreeNode n = q.poll();
                if(n.left != null)
                    temp.add(n.left);
                if(n.right != null)
                    temp.add(n.right);
            }
            q = temp;
            if(temp.isEmpty())
                return res.val;
            
        }
        return -1;
    }
}
