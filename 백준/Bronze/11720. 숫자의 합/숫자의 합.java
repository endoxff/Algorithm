import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String num = br.readLine();
		char[] array = num.toCharArray();
		
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += (int)array[i] - 48;
		}
		
		System.out.println(sum);
	}

}
