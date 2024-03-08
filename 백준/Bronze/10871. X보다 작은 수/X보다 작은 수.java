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
		int x = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int[] array = new int[n];
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
			if (array[i] < x) {
				sb.append(array[i]).append(" ");
			}
		}
		
		System.out.println(sb);
	}

}
