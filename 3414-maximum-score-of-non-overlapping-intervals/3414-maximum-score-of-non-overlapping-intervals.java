class Solution {

    class Pair {
        long sum;
        List<Integer> list;

        Pair(long sum, List<Integer> list) {
            this.sum = sum;
            this.list = list;
        }
    }

    Pair[][] dp;

    public int[] maximumWeight(List<List<Integer>> intervals) {

        int n = intervals.size();

        
        int[][] arr = new int[n][4];

        for (int i = 0; i < n; i++) {
            arr[i][0] = intervals.get(i).get(0);
            arr[i][1] = intervals.get(i).get(1);
            arr[i][2] = intervals.get(i).get(2);
            arr[i][3] = i;
        }

       
        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0])
                return Integer.compare(a[0], b[0]);

            return Integer.compare(a[1], b[1]);
        });

        dp = new Pair[n][5];

        Pair ans = solve(arr, 0, 4);

        int[] result = new int[ans.list.size()];

        for (int i = 0; i < ans.list.size(); i++) {
            result[i] = ans.list.get(i);
        }

        return result;
    }

    private Pair solve(int[][] arr, int i, int k) {

        if (i == arr.length || k == 0) {
            return new Pair(0, new ArrayList<>());
        }

        if (dp[i][k] != null) {
            return dp[i][k];
        }

        
        Pair skip = solve(arr, i + 1, k);
        int end = arr[i][1];

        int next = findNext(arr, i + 1, end);

        Pair temp = solve(arr, next, k - 1);

        List<Integer> takeList =
                new ArrayList<>(temp.list);

        takeList.add(arr[i][3]);

        Collections.sort(takeList);

        Pair take = new Pair(
                arr[i][2] + temp.sum,
                takeList
        );

        dp[i][k] = better(take, skip) ? take : skip;

        return dp[i][k];
    }

    private int findNext(int[][] arr, int left, int end) {

        int right = arr.length;

        while (left < right) {

            int mid = left + (right - left) / 2;

            // STRICTLY greater
            if (arr[mid][0] > end) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean better(Pair a, Pair b) {

        if (a.sum != b.sum) {
            return a.sum > b.sum;
        }

        int n = Math.min(a.list.size(), b.list.size());

        for (int i = 0; i < n; i++) {

            if (!a.list.get(i).equals(b.list.get(i))) {
                return a.list.get(i) < b.list.get(i);
            }
        }

        return a.list.size() < b.list.size();
    }
}