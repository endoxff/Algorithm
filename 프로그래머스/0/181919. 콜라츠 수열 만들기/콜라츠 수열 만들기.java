import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int x = n;
        
        do {
            list.add(x);
            
            if (x % 2 == 0) {
                x /= 2;
            } else {
                x = 3 * x + 1;
            }
            
        } while (x != 1);
        
        list.add(1);
        
        return listToArray(list);
    }
    
    public int[] listToArray(ArrayList<Integer> list) {
        int[] array = new int[list.size()];
        
        for (int i = 0 ; i < list.size() ; i++) {
            array[i] = list.get(i).intValue();
        }
        
        return array;
    }
}