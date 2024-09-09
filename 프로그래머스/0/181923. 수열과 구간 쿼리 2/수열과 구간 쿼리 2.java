class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] array = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            array[i] = find(arr, queries[i][0], queries[i][1], queries[i][2]);
        }
        
        return array;
    }
    
    public int find(int[] arr, int s, int e, int k) {
        int n = 1000001;
        
        for (int i = s; i <= e; i++) {
            if (arr[i] > k && arr[i] < n) {
                n = arr[i];
            }
        }
        
        if (n == 1000001) {
            return -1;
        }
        
        return n;
    }
}