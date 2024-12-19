import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {        
        Map<String, Integer> parkingTimeMap = getParkingTime(records);
        int[] answer = calculateParkingFee(fees, parkingTimeMap);
        
        return answer;
    }
    
    private Map<String, Integer> getParkingTime(String[] records) {
        Map<String, Integer> inMap = new HashMap<String, Integer>();
        Map<String, Integer> parkingTimeMap = new HashMap<String, Integer>();
        
        for (String record : records) {
            String[] splitRecord = record.split(" ");
            
            int time = getTimeToMinute(splitRecord[0]);
            String car = splitRecord[1];
            String io = splitRecord[2];
            
            if (io.equals("IN")) {
                inMap.put(car, time);
            } else {
                int inTime = inMap.get(car);
                inMap.remove(car);
                
                if (parkingTimeMap.containsKey(car)) {
                    int parkingTime = parkingTimeMap.get(car);
                    parkingTimeMap.replace(car, parkingTime + time - inTime);    
                } else {
                    parkingTimeMap.put(car, time - inTime);
                }
            }
        }
        
        int lastTime = 1439;
        
        for (String car : inMap.keySet()) {
            int inTime = inMap.get(car);
            
            if (parkingTimeMap.containsKey(car)) {
                int parkingTime = parkingTimeMap.get(car);
                parkingTimeMap.replace(car, parkingTime + lastTime - inTime);
            } else {
                parkingTimeMap.put(car, lastTime - inTime);
            }   
        }
        
        return parkingTimeMap;
    }
    
    private int getTimeToMinute(String time) {
        String[] splitTime = time.split(":");
        
        int hour = Integer.parseInt(splitTime[0]) * 60;
        int minute = Integer.parseInt(splitTime[1]);
        
        return hour + minute;
    }
    
    private int[] calculateParkingFee(int[] fees, Map<String, Integer> parkingTimeMap) {
        int baseTime = fees[0];
        int baseFee = fees[1];
        int partTime = fees[2];
        int partFee = fees[3];
        
        Object[] sortedCar = parkingTimeMap.keySet().toArray();
		Arrays.sort(sortedCar);
        
        int[] answer = new int[sortedCar.length];

        for (int i = 0; i < answer.length; i++) {
            int result = baseFee;
            String car = String.valueOf(sortedCar[i]);
            
            int val = parkingTimeMap.get(car);
            if (val > baseTime) {
                result = (int) (baseFee + Math.ceil((double)(val - baseTime) / partTime) * partFee);
            }
            answer[i] = result;
        }
        
        return answer;
    }
}