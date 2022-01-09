package 풀지못한문제;

import java.io.*;

/**
 * No1316_groupWordChecker
 * 2022-01-03
 * @author Dong-yeong0
 */

public class No1316_groupWordChecker {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int count = 0;
        int N = Integer.parseInt(input.readLine());
        for(int i = 0; i < N; i++) {
            if(check() == true) {
                count++;
            }
        }
        System.out.println(count);
    }
    private static boolean check() throws IOException {
        boolean[] alphabet = new boolean[26];

        int prev = 0;
        String keyword = input.readLine();

        for(int i = 0; i < keyword.length(); i++) {
            int now = keyword.charAt(i);
            if(prev != now) {
                if(alphabet[now - 'a'] == false) {
                    alphabet[now - 'a'] = true;
                    prev = now;
                }
                else {
                    return false;
                }
            } else {
                continue;
            }
        }
        return true;

        
    }
}
