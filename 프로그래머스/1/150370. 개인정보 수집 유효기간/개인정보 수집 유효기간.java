import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        HashMap<String, Integer> termsMap = getTermsMap(terms);
        int todayToInt = getDate(today);
        
        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");
            
            if (getDate(privacy[0]) + (termsMap.get(privacy[1]) * 28) <= todayToInt) {
                answer.add(i + 1);
            }
        }
        
        return answer.stream().mapToInt(integer -> integer).toArray();
    }
    
    private HashMap<String, Integer> getTermsMap(String[] terms) {
        HashMap<String, Integer> termsMap = new HashMap<>();
        
        for (String t: terms) {
            String[] term = t.split(" ");
            termsMap.put(term[0], Integer.parseInt(term[1]));
        }
        
        return termsMap;
    }
    
    private int getDate(String strDate) {
        String[] date = strDate.split("\\.");
        
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        
        return (year * 12 * 28) + (month * 28) + day;
    }
}