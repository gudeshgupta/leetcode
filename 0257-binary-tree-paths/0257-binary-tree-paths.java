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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans= new ArrayList<>();
        if(root==null)
        return ans;

        fun(root,ans,"");
        
        return ans;

    }
    void fun(TreeNode root,List<String> ans,String path){
        if(root==null)
        return ;

        path+=root.val;

        if(root.left==null && root.right==null){
            ans.add(path);
            return;
        }
        path+="->";
        
        fun(root.left,ans,path);
        fun(root.right,ans,path);
    }
    
}