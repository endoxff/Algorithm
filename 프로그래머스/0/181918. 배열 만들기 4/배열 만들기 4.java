import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        
        while (i < arr.length) {
            if (list.size() == 0) {
                list.add(arr[i++]);
            } else {
                if (list.get(list.size() - 1) < arr[i]) {
                    list.add(arr[i++]);
                } else {
                    list.remove(list.size() - 1);
                }
            }
        }
        
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