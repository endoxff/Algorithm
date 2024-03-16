import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		while (n != -1) {
			ArrayList<Integer> array = new ArrayList<Integer>();
			int sum = 0;
			
			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					array.add(i);
					sum += i;
				}
			}
			
			if (n == sum) {
				sb.append(n).append(" = ");
				for (int j = 0; j < array.size() - 1; j++) {
					sb.append(array.get(j)).append(" + ");
				}
				sb.append(array.get(array.size() - 1)).append("\n");
			} else {
				sb.append(n).append(" is NOT perfect.").append("\n");
			}
			
			n = Integer.parseInt(br.readLine());
		}
		
		System.out.println(sb);
	}

}
