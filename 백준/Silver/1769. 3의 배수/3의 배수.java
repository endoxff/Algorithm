import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String x = br.readLine();
		
		if (changeX(x) % 3 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	public static int changeX(String x) {
		int count = 0;
		
		while (x.length() > 1) {
			int sum = 0;
			
			for (int i = 0; i < x.length(); i++) {
				sum += (x.charAt(i) - 48);
			}
			
			x = Integer.toString(sum);
			count++;
		}
		
		System.out.println(count);
		return Integer.parseInt(x);
	}
}
