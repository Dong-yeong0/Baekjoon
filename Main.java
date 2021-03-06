/**
 * for submission
 * @author Dong-yeong0
 */
import java.util.*;
import java.io.*;
public class Main { // Main
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int N = Integer.parseInt(input.readLine());
        int count = 0;
        for(int i = 0; i < N; i++) {
            if(check() == true) {
                count++;
            }
        }
        System.out.println(count);
	}
    private static boolean check() throws IOException {
        boolean[] alphabet = new boolean[26];
        String keyword = input.readLine();
        int prev = 0;

        for(int i = 0; i < keyword.length(); i++) {
            int now = keyword.charAt(i);
            if(prev != now) {
                if(alphabet[now - 'a'] == false) {
                    prev = now;
                    alphabet[now - 'a'] = true;
                } else {
                    return false;
                }
            } else {
                continue;
            }
        }

        return true;
    }
}