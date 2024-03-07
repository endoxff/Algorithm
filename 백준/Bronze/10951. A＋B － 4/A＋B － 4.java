import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String s;
		
		StringBuilder sb = new StringBuilder();
		
		while ((s = br.readLine()) != null) {
			st = new StringTokenizer(s);
			if (st.hasMoreTokens()) {
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				sb.append((a + b) + "\n");
			} else {
				break;
			}
		}
		
		System.out.println(sb);
		
	}

}
