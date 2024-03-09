import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int r = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			
			for (int j = 0; j < str.length(); j++) {
				for (int k = 0; k < r; k++) {
					sb.append(str.charAt(j));
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}
