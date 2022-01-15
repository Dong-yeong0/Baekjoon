package 풀지못한문제;

import java.io.*;
import java.util.*;
/**
 * No10250_acmHotel
 * 2022-01-15
 * @author Dong-yeong0
 */

public class No10250_acmHotel {
    public static void main(String[] args) throws IOException {
 
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
 
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(input.readLine());
 
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(input.readLine(), " ");
 
			int H = Integer.parseInt(st.nextToken());
			st.nextToken();
			int N = Integer.parseInt(st.nextToken());
 
			if (N % H == 0) {
				sb.append((H * 100) + (N / H)).append('\n');
 
			} else {
				sb.append(((N % H) * 100) + ((N / H) + 1)).append('\n');
			}
		}
		System.out.print(sb);
 
	}
}
