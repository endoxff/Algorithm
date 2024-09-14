class Solution {
    public String solution(String my_string, int[][] queries) {
        String result = my_string;
        
        for (int i = 0; i < queries.length; i++) {
            result = reverse(result, queries[i][0], queries[i][1]);
        }
        
        return result;
    }
    
    public String reverse(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        StringBuilder reverse = new StringBuilder();
        
        for (int i = 0; i < s; i++) {
            sb.append(my_string.charAt(i));
        }
        
        for (int i = s; i <= e; i++) {
            reverse.append(my_string.charAt(i));
        }
        
        sb.append(reverse.reverse());
        
        for (int i = e + 1; i < my_string.length(); i++) {
            sb.append(my_string.charAt(i));
        }
        
        return sb.toString();
    }
}