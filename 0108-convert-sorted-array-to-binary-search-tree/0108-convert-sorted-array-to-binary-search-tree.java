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
    public TreeNode sortedArrayToBST(int[] nums) {
        return fun(nums,0,nums.length-1);
    }
    TreeNode fun(int[] nums,int left,int right){
    if(left>right)
    return null;

    int mid=left+(right-left)/2;
    TreeNode temp=new TreeNode(nums[mid]);
    temp.left=fun(nums,left,mid-1);
    temp.right=fun(nums,mid+1,right);

    return temp;
    }
   

}