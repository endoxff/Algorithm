import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n - 1 - i); j++) {
				sb.append(" ");
			}
			for (int k = 0; k < (i + 1); k++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}
