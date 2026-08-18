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
    HashMap<Integer,Integer> n=new HashMap<>();
   
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        idx=postorder.length-1;
        for(int i=0;i<inorder.length;i++){
            n.put(inorder[i],i);
            
        }
        return fun(inorder,0,inorder.length-1,postorder);
    }
     int idx=0;
    TreeNode fun(int[] inorder,int low,int high,int[] postorder){
        if(low>high)
        return null;
        TreeNode temp=new TreeNode(postorder[idx]);
        int index=n.get(postorder[idx]);
        idx--;

        temp.right=fun(inorder,index+1,high,postorder);
        temp.left=fun(inorder,low,index-1,postorder);

        return temp;
    }
}