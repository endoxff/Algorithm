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
		
		int count = n;
		
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(st.nextToken());
			
			if (x == 1) {
				count--;
			} else {
				int flag = 1;
				
				for (int j = 2; j < x; j++) {
					if (x % j == 0) {
						flag = 0;
						count--;
						break;
					}
				}
			}
			
		}
		
		System.out.println(count);
	}
}
