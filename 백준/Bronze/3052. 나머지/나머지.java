import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] array = new int[42];
		
		for (int i = 0; i < 10; i++) {
			int a = Integer.parseInt(br.readLine());
			
			int remainder = a % 42;
			
			array[remainder]++;
		}
		
		int count = 0;
		
		for (int i = 0; i < 42; i++) {
			if (array[i] != 0) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
