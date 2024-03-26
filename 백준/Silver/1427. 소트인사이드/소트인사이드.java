import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] array = new int [10];
		
		String num = br.readLine();
		
		for (int i = 0; i < num.length(); i++) {
			array[num.charAt(i) - 48]++;
		}
		
		for (int i = 9; i >= 0; i--) {
			for (int j = 0; j < array[i]; j++) {
				sb.append(i);
			}
		}
		
		System.out.println(sb);
	}

}
