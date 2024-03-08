import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		double[] array = new double[n];
		double max = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			array[i] = Double.parseDouble(st.nextToken());
			
			if (array[i] > max) {
				max = array[i];
			}
		}
		
		double sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += ((array[i] / max) * 100);
		}
		
		System.out.println(sum / n);

	}

}
