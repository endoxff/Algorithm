import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] array = new int[10001];
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			
			array[num]++;
		}
		
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array[i]; j++) {
				sb.append(i).append("\n");
			}
		}
		
		System.out.println(sb);
	}

}
