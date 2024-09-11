class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            arr = sum(arr, queries[i][0], queries[i][1], queries[i][2]);
        }
        
        return arr;
    }
    
    public int[] sum(int[] arr, int s, int e, int k) {
        for (int i = s; i <= e; i++) {
            if (i % k == 0) {
                arr[i]++;
            }
        }
        
        return arr;
    }
}