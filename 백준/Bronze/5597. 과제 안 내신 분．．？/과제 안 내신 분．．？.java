import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] array = new int[30];
		
		for (int i = 0; i < 30; i++) {
			array[i] = 0;
		}
		
		for (int i = 0; i < 28; i++) {
			int n = Integer.parseInt(br.readLine());
			array[n - 1] = 1;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 30; i++) {
			if (array[i] == 0) {
				sb.append(i + 1).append("\n");
			}
		}
		
		System.out.println(sb);

	}

}
