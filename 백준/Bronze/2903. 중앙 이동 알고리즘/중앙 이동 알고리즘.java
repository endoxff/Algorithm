import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int x = 3;
		
		for (int i = 0; i < n - 1; i++) {
			x = 2 * x - 1;
		}
		
		System.out.println((int)Math.pow((double)x, 2));
	}

}
