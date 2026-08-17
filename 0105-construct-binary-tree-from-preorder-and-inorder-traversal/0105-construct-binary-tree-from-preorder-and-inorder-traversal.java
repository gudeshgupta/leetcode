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
    int idx=0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            n.put(inorder[i],i);
        }
        return fun(preorder,0,inorder.length-1);
        
    }
    TreeNode fun(int[] preorder,int low,int high){
        if(low>high)
        return null;
        TreeNode temp=new TreeNode(preorder[idx]);
        int index=n.get(preorder[idx]);
        idx++;
        temp.left=fun(preorder,low,index-1);
        temp.right=fun(preorder,index+1,high);

        return temp;
    }
}