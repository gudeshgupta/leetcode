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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer>ans=new ArrayList<>();
        List<Integer>ans2=new ArrayList<>();
        fun(p,ans);
        fun(q,ans2);
        return ans.equals(ans2);
        
    }
    void fun(TreeNode root,List<Integer> ans){
        if(root==null){
            ans.add(null);
            return;
        }
        ans.add(root.val);
        fun(root.left,ans);
        fun(root.right,ans);

    }
}