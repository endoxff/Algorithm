import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String n = st.nextToken();
		int b = Integer.parseInt(st.nextToken());
		
		double result = 0;
		
		for (int i = 0; i < n.length(); i++) {
			int x = 0;
			
			if ((int)n.charAt(i) < 65) {
				x = (int)n.charAt(i) - 48;
			} else {
				x = (int)n.charAt(i) - 55;
			}
			
			result += Math.pow((double)b, n.length() - 1 - i) * x;
		}
		
		System.out.println((int)result);
	}

}
