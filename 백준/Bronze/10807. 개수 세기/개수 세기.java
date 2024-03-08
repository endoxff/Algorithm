import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int v = Integer.parseInt(br.readLine());
		
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			if (array[i] == v) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
