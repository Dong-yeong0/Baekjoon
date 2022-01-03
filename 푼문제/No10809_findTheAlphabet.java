package 푼문제;

import java.io.*;



/**
 * No10809_findTheAlphabet
 * 2022-01-03
 * @author Dong-yeong0
 */
public class No10809_findTheAlphabet {

    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        // 알파벳 a ~ z 배열
        int arr[] = new int[26];
        // 배열 -1로 초기화
        for(int i = 0; i < arr.length; i++){
            arr[i] = -1;
        }
        // 문자 입력단
        String S = input.readLine();
        
        for(int j = 0; j < S.length(); j++) {
            char alphabet = S.charAt(j);
            if(arr[alphabet - 'a'] == -1) {
                arr[alphabet - 'a'] = j;
            }
        }
        input.close();
        for(int value : arr) {
            System.out.println(value);
        }

    }
}