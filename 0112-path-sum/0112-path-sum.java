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
    boolean ans=false;
    int sum=0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        fun(root,sum,targetSum);
        return ans;
    }
    
    void fun(TreeNode root,int sum,int k){
        if(root==null)
        return;
        sum+=root.val;
        if(root.left==null && root.right==null){
            if(sum==k){

            ans=true;
            return;
            }
        }
        fun(root.left,sum,k);
        fun(root.right,sum,k);
        
        
    }
}