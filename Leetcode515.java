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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root == null)
            return list;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            int max = Integer.MIN_VALUE;
            Queue<TreeNode> temp = new LinkedList<TreeNode>();
            while(!q.isEmpty()){
                TreeNode n  = q.poll();
                if(n.left != null)
                    temp.add(n.left);
                if(n.right != null)
                    temp.add(n.right);
                max = Integer.max(max,n.val);
            }
            list.add(max);
            q = temp;
        }
        return list;
    }
}
