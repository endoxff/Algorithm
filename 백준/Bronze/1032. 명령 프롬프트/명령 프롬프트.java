import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		String[] result = new String[n];
		
		for (int i = 0; i < n; i++) {
			result[i] = br.readLine();
		}
		
		for (int i = 0; i < result[0].length(); i++) {
			char c = result[0].charAt(i);
			int flag = 1;
			
			for (int j = 1; j < n; j++) {
				if (c != result[j].charAt(i)) {
					flag = 0;
					break;
				}
			}
			
			if (flag == 1) {
				sb.append(c);
			} else {
				sb.append("?");
			}
		}
		
		System.out.println(sb);
	}

}
