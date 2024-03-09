import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < t; i++) {
			String str = br.readLine();
			
			sb.append(str.charAt(0)).append(str.charAt(str.length() - 1)).append("\n");
		}

		System.out.println(sb);
	}

}
