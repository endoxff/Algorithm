import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[][] matrix = new int[100][100];
		
		for (int i = 0; i < 4; i++) {
			st = new StringTokenizer(br.readLine());
			
			int leftX = Integer.parseInt(st.nextToken());
			int leftY = Integer.parseInt(st.nextToken());
			int rightX = Integer.parseInt(st.nextToken());
			int rightY = Integer.parseInt(st.nextToken());
			
			drawRectangle(matrix, leftX, leftY, rightX, rightY);
		}
		
		System.out.println(countArea(matrix));
	}
	
	public static void drawRectangle(int[][] matrix, int leftX, int leftY, int rightX, int rightY) {
		for (int i = leftX; i < rightX; i++) {
			for (int j = leftY; j < rightY; j++) {
				matrix[i][j] = 1;
			}
		}
	}
	
	public static int countArea(int[][] matrix) {
		int area = 0;
		
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (matrix[i][j] == 1) {
					area++;
				}
			}
		}
		
		return area;
	}
}
