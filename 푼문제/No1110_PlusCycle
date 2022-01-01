package 푼문제;

/**
 * No1110_Average
 * 2022-01-01
 * @author Dong-yeong0
 */

import java.io.*;

public class No1110_PlusCycle{
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		input.close();
		int copy = N;
		int i = 0;
		while(true) {
			N = ((N%10) * 10) + ((N/10 + N%10) % 10);
			i++;
			if(copy == N) {
				break;
			}
		}
		System.out.println(i);
	}
}
