package 푼문제;
import java.io.*;
/**
 * No1157_wordStudy
 * 2022-01-03
 * @author Dong-yeong0
 */

public class No1157_wordStudy {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        // 영문자 배열
        int alphabet[] = new int[26];
        String keyword = input.readLine();

        for(int i = 0; i < keyword.length(); i++) {
            if(65 <= keyword.charAt(i) && keyword.charAt(i) <= 90) {
                alphabet[keyword.charAt(i) - 'A']++;
            } else {
                alphabet[keyword.charAt(i) - 'a']++;
            }
        }
        int max = -1;
        char none = '?';

        for(int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] > max) {
                max = alphabet[i];
                none = (char)(i+65);
            } else if(alphabet[i] == max){
                none = '?';
            }
        }
        System.out.println(none);
    }
}
