import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		double totalCredit = 0;
		double totalScore = 0;
		
		for (int i = 0; i < 20; i++) {
			st = new StringTokenizer(br.readLine());
			
			String name = st.nextToken();
			double credit = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			
			switch (grade) {
				case "A+":
					totalCredit += credit;
					totalScore += (credit * 4.5);
					break;
				case "A0":
					totalCredit += credit;
					totalScore += (credit * 4.0);
					break;
				case "B+":
					totalCredit += credit;
					totalScore += (credit * 3.5);
					break;
				case "B0":
					totalCredit += credit;
					totalScore += (credit * 3.0);
					break;
				case "C+":
					totalCredit += credit;
					totalScore += (credit * 2.5);
					break;
				case "C0":
					totalCredit += credit;
					totalScore += (credit * 2.0);
					break;
				case "D+":
					totalCredit += credit;
					totalScore += (credit * 1.5);
					break;
				case "D0":
					totalCredit += credit;
					totalScore += (credit * 1.0);
					break;
				case "F":
					totalCredit += credit;
					totalScore += (credit * 0.0);
					break;
			}
		}
		
		System.out.println(totalScore / totalCredit);
	}

}
