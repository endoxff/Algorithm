class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = changeMode(mode);
            } else {
                ret = makeRet(ret, mode, i, code.charAt(i));
            }
        }
        
        if (ret.toString().length() == 0) {
            return "EMPTY";
        }
        
        return ret.toString();
    }
    
    public int changeMode(int mode) {
        if (mode == 0) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public StringBuilder makeRet(StringBuilder ret, int mode, int i, char c) {
        if (mode == 0 && i % 2 == 0) {
            ret.append(c);
        } else if (mode == 1 && i % 2 == 1) {
            ret.append(c);
        }
        
        return ret;
    }
}