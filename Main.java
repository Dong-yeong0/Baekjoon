/**
 * for submission
 * @author Dong-yeong0
 */
import java.util.*;
import java.io.*;
public class Main { // Main
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        input.readLine();

        int sum = 0;

        for(byte value : input.readLine().getBytes()) {
            sum += (value - '0');
        }
        System.err.println(sum);
	}
}