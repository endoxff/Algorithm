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
		
		StringBuilder sb = new StringBuilder();
		
		while (a != 0 && b != 0 && c != 0) {
			int max = a;
			
			if (b > max) {
				max = b;
			}
			if (c > max) {
				max = c;
			}
			
			if (max >= a + b + c - max) {
				sb.append("Invalid").append("\n");
			} else {
				if (a == b && b == c) {
					sb.append("Equilateral").append("\n");
				} else if (a == b || b == c || a == c) {
					sb.append("Isosceles").append("\n");
				} else {
					sb.append("Scalene").append("\n");
				}
			}
			
			st = new StringTokenizer(br.readLine());
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(sb);
	}

}
