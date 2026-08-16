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
    TreeNode g1first,g1second,g2first,g2second,prev=null;
    int galat=0;
    public void recoverTree(TreeNode root) {
        if(root==null)
        return ;
        fun(root);
        if(galat==0){
            swap(g1first,g1second);
        }else{
            swap(g1first,g2second);
        }
        return;
    }
    void swap(TreeNode a,TreeNode b){
        int temp =a.val;
        a.val=b.val;
        b.val=temp;
        return;
    }
    void fun(TreeNode root){
        if(root==null)
        return ;

        fun(root.left);
        if(prev==null){
            prev=root;
        }
        else{
            if(prev.val>root.val){
                if(galat==0){
                    g1first=prev;
                    g2second=root;
                    galat++;
                }else{
                    g2first=prev;
                    g2second=root;
                     galat++;
                }
               
            } 
            prev=root;
           
        }
        fun(root.right);
        return;
    }
}