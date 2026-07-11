class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        //ArrayList<Integer>res=new ArrayList<>();
        int[] res=new int[n];
        Arrays.fill(res,-1);

        Stack<Integer>st=new Stack<>();
        //res[0]=-1;
        //st.push(nums[0]);
       for (int i = 2 * n - 1; i >= 0; i--) {
    while (!st.isEmpty() && st.peek() <= nums[i % n]) {
        st.pop();
    }

    if (i < n && !st.isEmpty()) {
        res[i] = st.peek();
    }

    st.push(nums[i % n]);
}
        return res;
    }
}