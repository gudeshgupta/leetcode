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
    List<Integer> dia=new ArrayList<>();
    List<List<Integer>> res=new ArrayList<>();
    int sum=0;

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        fun(root,sum,targetSum);
        return res;
    }
    void fun(TreeNode root,int sum,int k){
        if(root==null)
        return ;

        sum+=root.val;
        dia.add(root.val);
        if(root.left==null && root.right==null){
            if(sum==k)
            res.add(new ArrayList <>(dia));
           
        dia.remove(dia.size()-1);
         return;
        }
        
        fun(root.left,sum,k);
        fun(root.right,sum,k);
        dia.remove(dia.size()-1);
        
    }

}