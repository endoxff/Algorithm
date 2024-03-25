import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] dwarf = new int[9];
		int sum = 0;
		int spy1 = 0;
		int spy2 = 0;
		
		for (int i = 0; i < 9; i++) {
			int height = Integer.parseInt(br.readLine());
			dwarf[i] = height;
			sum += height;
		}
		
		selectionSort(dwarf);
		
		for (int i = 0; i < dwarf.length; i++) {
			for (int j = i + 1; j < dwarf.length; j++) {
				if (sum - dwarf[i] - dwarf[j] == 100) {
					spy1 = i;
					spy2 = j;
				}
			}
		}
		
		for (int i = 0; i < dwarf.length; i++) {
			if (i == spy1 || i == spy2) {
				continue;
			}
			sb.append(dwarf[i]).append("\n");
		}
		
		System.out.println(sb);
	}

	public static void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			swap(array, i, min);
		}
	}
}
