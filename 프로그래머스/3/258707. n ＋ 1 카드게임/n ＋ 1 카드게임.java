import java.util.*;

class Solution {
    int n, index, target;
    Set<Integer> myCard, newCard;
    
    public int solution(int coin, int[] cards) {
        int answer = 0;
        
        initialize(cards);
        
        while (true) {
            answer++;
            
            if (index >= n) {
                break;
            }
            
            pickCard(cards);
            
            boolean flag = false;
            
            for (int num: myCard) {
                if (myCard.contains(target - num)) {
                    myCard.remove(num);
                    myCard.remove(target - num);
                    flag = true;
                    break;
                }
            }
            
            if (!flag) {
                if (coin >= 1) {
                    for (int num: myCard) {
                        if (newCard.contains(target - num)) {
                            myCard.remove(num);
                            newCard.remove(target - num);
                            coin--;
                            flag = true;
                            break;
                        }
                    }
                }
            }
            
            if (!flag) {
                if (coin >= 2) {
                    for (int num: newCard) {
                        if (newCard.contains(target - num)) {
                            newCard.remove(num);
                            newCard.remove(target - num);
                            coin -= 2;
                            flag = true;
                            break;
                        }
                    }
                }
            }
            
            if (!flag) {
                break;
            }
        }
        
        return answer;
    }
    
    private void initialize(int[] cards) {
        n = cards.length;
        index = n / 3;
        target = n + 1;
        
        myCard = new HashSet<>();
        newCard = new HashSet<>();
                
        for (int i = 0; i < index; i++) {
            myCard.add(cards[i]);
        }
    }
    
    private void pickCard(int[] cards) {
        newCard.add(cards[index++]);
        newCard.add(cards[index++]);
    }
}