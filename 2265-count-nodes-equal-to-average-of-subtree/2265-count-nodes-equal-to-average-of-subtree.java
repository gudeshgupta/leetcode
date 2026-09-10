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
    int ans=0;
    public int averageOfSubtree(TreeNode root) {
        fun(root);
        return ans;
    }
    int[] fun(TreeNode root){
        if(root==null)
        return new int[]{0,0};
        int[] l=fun(root.left);
        int[] r=fun(root.right);

        int sum=l[0]+r[0]+root.val;
        int count=l[1]+r[1]+1;

        if(sum/count==root.val)
        ans++;
        
        return new int[]{sum,count};
        }

}