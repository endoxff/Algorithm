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
		int b = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		while (n / b != 0) {
			if (n % b > 9) {
				sb.append((char)((n % b) + 55));
			} else {
				sb.append(n % b);
			}
			
			n /= b;
		}
		
		if (n % b > 9) {
			sb.append((char)((n % b) + 55));
		} else {
			sb.append(n % b);
		}
		
		System.out.println(sb.reverse());
	}

}
