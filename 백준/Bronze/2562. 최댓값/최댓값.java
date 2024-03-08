import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] array = new int[9];
		
		int max = 0;
		int index = -1;
		
		for (int i = 0; i < 9; i++) {
			array[i] = Integer.parseInt(br.readLine());
			
			if (array[i] > max) {
				max = array[i];
				index = i + 1;
			}
		}
		
		System.out.println(max + "\n" + index);
	}

}
