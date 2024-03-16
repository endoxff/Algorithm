import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				array.add(i);
			}
		}
		
		if (array.size() >= k) {
			System.out.println(array.get(k - 1));
		} else {
			System.out.println("0");
		}
	}

}
