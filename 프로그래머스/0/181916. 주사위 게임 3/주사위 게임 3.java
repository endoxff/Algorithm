class Solution {
    public int solution(int a, int b, int c, int d) {
        if (a == b && b == c && c == d) {
            return 1111 * a;
        } else if ((a == b && b == c) || (a == b && b == d)
                  || (a == c && c == d) || (b == c && c == d)) {
            if (a == b && b == c) {
                return (10 * a + d) * (10 * a + d);
            } else if (a == b && b == d) {
                return (10 * a + c) * (10 * a + c);
            } else if (a == c && c == d) {
                return (10 * a + b) * (10 * a + b);
            } else {
                return (10 * b + a) * (10 * b + a);
            }
        } else if ((a == b) || (a == c) || (a == d)
                  || (b == c) || (b == d) || (c == d)) {
               if (a == b) {
                   if (c == d) {
                       return (a + c) * Math.abs(a - c);
                   } else {
                       return c * d;
                   }
               } else if (a == c) {
                   if (b == d) {
                       return (a + b) * Math.abs(a - b);
                   } else {
                       return b * d;
                   }
               } else if (a == d) {
                   if (b == c) {
                       return (a + b) * Math.abs(a - b);
                   } else {
                       return b * c;
                   }
               } else if (b == c) {
                   if (a == d) {
                       return (a + b) * Math.abs(a - b);
                   } else {
                       return a * d;
                   }
               } else if (b == d) {
                   if (a == c) {
                       return (a + b) * Math.abs(a - b);
                   } else {
                       return a * c;
                   }
               } else  {
                   if (a == b) {
                       return (a + c) * Math.abs(a - c);
                   } else {
                       return a * b;
                   }
               }
        } else {
            return getMin(a, b, c, d);
        }
    }
    
    public int getMin(int a, int b, int c, int d) {
        int min = a;
        
        if (b < min) {
            min = b;
        }
        
        if (c < min) {
            min = c;
        }
        
        if (d < min) {
            min = d;
        }
        
        return min;
    }
}