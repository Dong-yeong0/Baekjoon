package 풀지못한문제;

import java.io.*;

/**
 * No1193_findFraction
 * 2022-01-09
 * @author Dong-yeong0
 */

public class No1193_findFraction {
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
 
		int cross_count = 1, prev_count_sum = 0;
 
		while (true) {
			if (X <= prev_count_sum + cross_count) {	
				
				if (cross_count % 2 == 1) {	
					System.out.print((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
					break;
				} 
				
				else { 
					System.out.print((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
					break;
				}
 
			} else {
				prev_count_sum += cross_count;
				cross_count++;
			}
		}
	}
}
