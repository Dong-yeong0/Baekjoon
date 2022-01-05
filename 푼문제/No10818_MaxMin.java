package 푼문제;

import java.io.*;
import java.util.*;
/**
 * No10818_MaxMin
 * 2022-01-05
 * @author Dong-yeong0
 */
public class No10818_MaxMin {

	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(input.readLine());

		StringTokenizer st = new StringTokenizer(input.readLine(), " ");
		
		int value = 0;
		int[] arr = new int[N];

		while(st.hasMoreTokens()) {
			arr[value] = Integer.parseInt(st.nextToken());
			value++;
		}
    // 오름차순 정렬
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[N - 1]);
	}
}
