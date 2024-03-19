import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		char[][] room = new char[n][n];
		int countWidth = 0;
		int countLength = 0;
		
		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			
			for (int j = 0; j < n; j++) {
				room[i][j] = line.charAt(j);
			}
		}
		
		for (int i = 0; i < room.length; i++) {
			for (int j = 0; j < room.length - 1; j++) {
				if (room[i][j] == '.' && room[i][j + 1] == '.') {
					if (j + 2 < room.length && room[i][j + 2] == '.') {
						continue;
					} else {
						countWidth++;
					}
				}
			}
		}
		
		for (int i = 0; i < room.length; i++) {
			for (int j = 0; j< room.length - 1; j++) {
				if (room[j][i] == '.' && room[j + 1][i] == '.') {
					if (j + 2 < room.length && room[j + 2][i] == '.') {
						continue;
					} else {
						countLength++;
					}
				}
			}
		}
		
		sb.append(countWidth).append(" ");
		sb.append(countLength);
		
		System.out.println(sb);
	}
	
}
