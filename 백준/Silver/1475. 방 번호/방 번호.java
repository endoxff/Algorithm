import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String n = br.readLine();
		int[] number = new int[9];
		int max = 0;
		
		for (int i = 0; i < n.length(); i++) {
			switch(n.charAt(i)) {
				case '0':
					number[0]++;
					break;
				case '1':
					number[1]++;
					break;
				case '2':
					number[2]++;
					break;
				case '3':
					number[3]++;
					break;
				case '4':
					number[4]++;
					break;
				case '5':
					number[5]++;
					break;
				case '6':
				case '9':
					number[6]++;
					break;
				case '7':
					number[7]++;
					break;
				case '8':
					number[8]++;
					break;
			}
		}
			
		if (number[6] % 2 != 0) {
			number[6] = number[6] / 2 + 1;
		} else {
			number[6] /= 2;
		}
		
		for (int i = 0; i < 9; i++) {
			if (number[i] > max) {
				max = number[i];
			}
		}
		
		System.out.println(max);
	}

}
