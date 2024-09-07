class Solution {
    public int solution(int[] num_list) {
        int multi = multiply(num_list);
        int sumSqu = sumSquare(num_list);
        
        if (multi < sumSqu) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public int multiply(int[] num_list) {
        int result = 1;
        
        for (int i = 0; i < num_list.length; i++) {
            result *= num_list[i];
        }
        
        return result;
    }
    
    public int sumSquare(int[] num_list) {
        int result = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            result += num_list[i];
        }
        
        return result * result;
    }
}