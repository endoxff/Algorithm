import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int[][] giftTable = makeGiftTable(friends, gifts);
        int[] giftIndex = makeGiftIndex(giftTable);
        
        int[] nextMonthGift = new int[friends.length];
        
        for (int i = 0; i < friends.length; i++) {
            for (int j = i + 1; j < friends.length; j++) {
                if (giftTable[i][j] > giftTable[j][i]) {
                    nextMonthGift[i]++;
                } else if (giftTable[i][j] < giftTable[j][i]) {
                    nextMonthGift[j]++;
                } else {
                    if (giftIndex[i] > giftIndex[j]) {
                        nextMonthGift[i]++;
                    } else if (giftIndex[j] > giftIndex[i]) {
                        nextMonthGift[j]++;
                    }
                }
            }
        }
        
        return Arrays.stream(nextMonthGift).max().getAsInt();
    }
    
    private int[][] makeGiftTable(String[] friends, String[] gifts) {
        int[][] giftTable = new int[friends.length][friends.length];
        
        List<String> friendList = Arrays.asList(friends);
        
        for (String gift: gifts) {
            String[] senderAndReceiver = gift.split(" ");
            int sender = friendList.indexOf(senderAndReceiver[0]);
            int receiver = friendList.indexOf(senderAndReceiver[1]);
            
            giftTable[sender][receiver]++;
        }
        
        return giftTable;
    }
    
    private int[] makeGiftIndex(int[][] giftTable) {
        int[] giftIndex = new int[giftTable.length];
        
        for (int i = 0; i < giftTable.length; i++) {
            for (int j = 0; j < giftTable.length; j++) {
                giftIndex[i] += giftTable[i][j];
                giftIndex[i] -= giftTable[j][i];
            }
        }
        
        return giftIndex;
    }
}