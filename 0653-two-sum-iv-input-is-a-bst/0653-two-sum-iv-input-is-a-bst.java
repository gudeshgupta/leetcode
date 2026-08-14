class Solution {
    
    Stack<TreeNode> asc = new Stack<>();
    Stack<TreeNode> des = new Stack<>();

    public boolean findTarget(TreeNode root, int k) {
        
        if (root == null)
            return false;

        
        TreeNode t = root;
        while (t != null) {
            asc.push(t);
            t = t.left;
        }

        
        t = root;
        while (t != null) {
            des.push(t);
            t = t.right;
        }

        TreeNode i = getsmall();
        TreeNode j = getbig();

        while (i != null && j != null && i != j) {

            int sum = i.val + j.val;

            if (sum == k)
                return true;

            if (sum < k) {
                i = getsmall();
            } else {
                j = getbig();
            }
        }

        return false;
    }

    TreeNode getsmall() {

        if (asc.isEmpty())
            return null;

        TreeNode small = asc.pop();

        TreeNode t = small.right;

        while (t != null) {
            asc.push(t);
            t = t.left;
        }

        return small;
    }

    TreeNode getbig() {

        if (des.isEmpty())
            return null;

        TreeNode big = des.pop();

        TreeNode t = big.left;

        while (t != null) {
            des.push(t);
            t = t.right;
        }

        return big;
    }
}