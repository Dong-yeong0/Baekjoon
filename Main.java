/**
 * for submission
 * @author Dong-yeong0
 */
import java.io.*;
import java.util.*;
public class Main { // Main
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer sp;
		int arr[];
		int testCase = Integer.parseInt(input.readLine());

		for(int i = 0; i < testCase; i++) {
			
			sp = new StringTokenizer(input.readLine(), " ");
			int students = Integer.parseInt(sp.nextToken());
			arr = new int[students];

			double sum = 0;

			for(int j = 0; j < students; j++) {
				int value = Integer.parseInt(sp.nextToken());
				arr[j] = value;
				sum += arr[j];
			}

			double eachAvg = (sum / students);
			double count = 0;

			for(int k = 0; k < students; k++) {
				if(eachAvg < arr[k]) {
					count++;
				}
			}

			System.out.printf("%.3f%%\n", (count / students) * 100);

		}


	}
}