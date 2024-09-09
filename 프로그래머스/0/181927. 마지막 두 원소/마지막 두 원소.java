class Solution {
    public int[] solution(int[] num_list) {
        int num_list_length = num_list.length;
        int[] array = new int[num_list_length + 1];
        
        for (int i = 0; i < num_list_length; i++) {
            array[i] = num_list[i];
        }
        
        if (num_list[num_list_length - 1] > num_list[num_list_length - 2]) {
            array[num_list_length] = num_list[num_list_length - 1] - num_list[num_list_length - 2];
        } else {
            array[num_list_length] = num_list[num_list_length - 1] * 2;
        }
        
        return array;
    }
}