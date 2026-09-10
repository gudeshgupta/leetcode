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
    HashMap<Integer,Integer>map=new HashMap<>();
    int max=0;
    public int[] findMode(TreeNode root) {
        fun(root);
        ArrayList<Integer>l=new ArrayList<>();
        for(int key:map.keySet()){
            if(map.get(key)==max){
                l.add(key);
            }
        }
        int[] ans=new int[l.size()];
        for(int i=0;i<l.size();i++){
            ans[i]=l.get(i);
        }
        return ans;

    }
    void fun(TreeNode root){
        if(root==null)
        return ;

        int freq=map.getOrDefault(root.val,0)+1;
        map.put(root.val,freq);
        max=Math.max(freq,max);

        fun(root.left);
        fun(root.right);

    }
}