/**
 * 2021-12-28
 * @author Dong-yeong0
 */

package 푼문제;
import java.io.*;

public class No2562_Maxvalue { // Main
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		// 9개의 서로 다른 자연수
		int arr[] = new int[9];
		
		for(int i = 0; i<arr.length; i++){
			arr[i] = Integer.parseInt(input.readLine());
		}
		input.close();
		
		int max = 0;
		int index = 0;
		int cnt = 0;

		for(int value : arr) {
			cnt++;
			if(max < value) {
				max = value;
				index = cnt;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
	}
}