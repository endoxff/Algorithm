import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String num;
		
		while (!(num = br.readLine()).equals("0")) {
			StringBuilder reverseNum = new StringBuilder(num);
			if (num.equals(reverseNum.reverse().toString())) {
				sb.append("yes").append("\n");
			} else {
				sb.append("no").append("\n");
			}
		}
		
		System.out.println(sb);
	}

}
