import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[][] array = new int[9][9];
		int max = 0;
		int n = 1;
		int m = 1;
		
		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < 9; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
				if (array[i][j] > max) {
					max = array[i][j];
					n = i + 1;
					m = j + 1;
				}
			}
		}
		
		System.out.println(max + "\n" + n + " " + m);
	}

}
