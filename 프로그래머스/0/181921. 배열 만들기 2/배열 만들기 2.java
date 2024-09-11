import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            if (isZeroOrFive(Integer.toString(i))) {
                arr.add(i);
            }
        }
        
        if (arr.size() == 0) {
            arr.add(-1);
        }
        
        int[] array = listToArray(arr);
        
        return array;
    }
    
    public boolean isZeroOrFive(String n) {
        char[] nums = { '1', '2', '3', '4', '6', '7', '8', '9' };
        
        for (char num: nums) {
            if (n.indexOf(num) != -1) {
                return false;
            }
        }
        
        return true;
    }
    
    public int[] listToArray(ArrayList<Integer> list) {
        int[] array = new int[list.size()];
        
        for (int i = 0 ; i < list.size() ; i++) {
            array[i] = list.get(i).intValue();
        }
            
        return array;
    }
    
        
}