import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] array;
	static Integer[] dp;
	static int max;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		array = new int[n];
		dp = new Integer[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[0] = array[0];
		max = array[0];
		
		continuousSum(n - 1);
		
		System.out.println(max);
	}
	
	static int continuousSum(int n) {
		if(dp[n] == null) {
			dp[n] = Math.max(continuousSum(n - 1) + array[n], array[n]);
			max = Math.max(dp[n], max);
		}
				
		return dp[n];
	}

}
