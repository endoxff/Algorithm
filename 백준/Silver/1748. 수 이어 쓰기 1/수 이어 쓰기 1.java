import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
		
		String n = br.readLine();
		
		System.out.println(newNumber(n));
	}

	public static int newNumber(String n) {
		int sum = 0;
		int all = 0;
		int count = 9;
		
		for (int i = 1; i < n.length(); i++) {
			sum += (count * i);
			all += count;
			count *= 10;
		}
		
		sum += (n.length() * (Integer.parseInt(n) - all));
		
		return sum;
	}
}
