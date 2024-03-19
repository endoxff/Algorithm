import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int aN, aM, bM, bK;
		int[][] a, b, c;
		
		st = new StringTokenizer(br.readLine());
		
		aN = Integer.parseInt(st.nextToken());
		aM = Integer.parseInt(st.nextToken());
		
		a = new int[aN][aM];
		
		for (int i = 0; i < aN; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < aM; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		st = new StringTokenizer(br.readLine());
		
		bM = Integer.parseInt(st.nextToken());
		bK = Integer.parseInt(st.nextToken());
		
		b = new int[bM][bK];
		
		for (int i = 0; i < bM; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < bK; j++) {
				b[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		c = new int[aN][bK];
		matrix(c, a, b);
		
		for (int i = 0; i < aN; i++) {
			for (int j = 0; j < bK; j++) {
				sb.append(c[i][j]).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

	public static void matrix(int[][] c, int[][] a, int[][] b) {
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[0].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					c[i][j] += (a[i][k] * b[k][j]);
				}
			}
		}
	}
}
