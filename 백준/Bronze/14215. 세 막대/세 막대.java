import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int max = a;
		
		if (b > max) {
			max = b;
		}
		
		if (c > max) {
			max = c;
		}
		
		if (max < a + b + c - max) {
			System.out.println(a + b + c);
		} else {
			System.out.println((a + b + c - max) * 2 - 1);
		}
	}

}
