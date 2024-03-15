import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int minX = 10000;
		int minY = 10000;
		int maxX = -10000;
		int maxY = -10000;
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if (x < minX) {
				minX = x;
			}
			
			if (x > maxX) {
				maxX = x;
			}
			
			if (y < minY) {
				minY = y;
			}
			
			if (y > maxY) {
				maxY = y;
			}
		}
		
		int width = 0;
		int height = 0;
		
		if (minX > 0 && maxX > 0) {
			width = maxX - minX;
		} else if (minX < 0 && maxX > 0) {
			width = maxX + (minX * -1);
		} else {
			width = (maxX - minX) * -1;
		}
		
		if (minY > 0 && maxY > 0) {
			height = maxY - minY;
		} else if (minY < 0 && maxY > 0) {
			height = maxY + (minY * -1);
		} else {
			height = (maxY - minY) * -1;
		}
		
		System.out.println(width * height);
	}

}
