import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = i + 1;
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int k = 1;
			
			for (int j = a; j < a + ((b - a + 1) / 2); j++) {
				int temp = array[j - 1];
				array[j - 1] = array[b - k];
				array[b - k] = temp;
				k++;
			}
			
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			sb.append(array[i]).append(" ");
		}
		
		System.out.println(sb);
		
	}

}
