class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            arr = swap(arr, queries[i][0], queries[i][1]);
        }
        
        return arr;
    }
    
    public int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
        return arr;
    }
}