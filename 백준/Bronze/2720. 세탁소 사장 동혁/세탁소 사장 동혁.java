import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < t; i++) {
			int c = Integer.parseInt(br.readLine());
			int quarter = 0;
			int dime = 0;
			int nickel = 0;
			int penny = 0;
			
			if (c / 25 > 0) {
				quarter = c / 25;
				c %= 25;
			}
			
			if (c / 10 > 0) {
				dime = c / 10;
				c %= 10;
			}
			
			if (c / 5 > 0) {
				nickel = c / 5;
				c %= 5;
			}
			
			penny = c;
			
			sb.append(quarter + " ").append(dime + " ").append(nickel + " ").append(penny).append("\n");
		}
		
		System.out.println(sb);
		
	}

}
