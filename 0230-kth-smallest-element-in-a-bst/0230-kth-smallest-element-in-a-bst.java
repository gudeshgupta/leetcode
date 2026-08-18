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
    ArrayList<Integer> np=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        fun(root,np);
        return(np.get(k-1));
    }
    void fun(TreeNode root,ArrayList np){
        if(root==null){
           
            return;
        }
        fun(root.left,np);
        np.add(root.val);
        fun(root.right,np);
        return;
    }

}