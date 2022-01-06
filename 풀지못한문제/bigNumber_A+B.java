package 풀지못한문제;
import java.io.*;
import java.util.*;
import java.math.BigInteger;
/**
 * No10757_bigNumber_A_plus_B.java
 * 2022-01-06
 * @author Dong-yeong0
 */

public class No10757_bigNumber_A_plus_B.java {
    public static void main(String[] args) throws IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(input.readLine(), " ");
		
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		
		A = A.add(B);
		
		System.out.println(A.toString());
	}
}
