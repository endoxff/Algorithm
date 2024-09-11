class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] array = new int[end_num - start_num + 1];
        
        int i = 0;
        for (int n = start_num; n <= end_num; n++) {
            array[i++] = n;
        }
        
        return array;
    }
}