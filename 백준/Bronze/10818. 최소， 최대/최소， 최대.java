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
		
		int[] array = new int[n];
		
		int max = -1000001;
		int min = 1000001;
		
		for (int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
			
			if (array[i] > max) {
				max = array[i];
			}
			
			if (array[i] < min) {
				min = array[i];
			}
		}
		
		System.out.println(min + " " + max);
	}

}
