
public class Main {
	
	public static boolean[] array = new boolean[10001];
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		selfNumber();
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == false) {
				sb.append(i).append("\n");
			}
		}
		
		System.out.println(sb);
	}
	
	public static void selfNumber() {
		array[0] = true;
		
		for (int i = 1; i <= 10000; i++) {
			int n = i;
			int sum = n;
			
			while (n > 0) {
				sum += (n % 10);
				n /= 10;
			}
			
			if (sum <= 10000) {
				array[sum] = true;
			}
		}
	}
}
