import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int x = 1;
		int count = 1;
		
		if (n == 1) {
			System.out.println("1");
		} else {
			while (x < n) {
				x = x + (6 * count);
				count++;
			}
			
			System.out.println(count);
		}
		
	}

}
