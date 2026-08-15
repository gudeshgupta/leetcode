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
    boolean isnull=false;
   
    public boolean isCompleteTree(TreeNode root) {
        return fun(root);
    }
    boolean fun(TreeNode root){
        if(root==null){
            return true;
       
        }
         Queue<TreeNode>pq=new LinkedList<>();
         pq.add(root);
         while(!pq.isEmpty()){
            TreeNode t=pq.poll();
            if(t==null){
                isnull=true;
            }else{
                if(isnull==true)
                return false;

                pq.add(t.left);
                pq.add(t.right);
            }
         }
         return true;


        
    }
}