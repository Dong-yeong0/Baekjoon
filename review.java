/**
 * 복습
 * @author Dong-yeong0
 */
import java.io.*;
import java.util.StringTokenizer;


public class review {

    public static void main(String[] args) throws IOException {
        No2908();
    }
    // 11720 숫자의 합
    public static void No11720() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        input.readLine();

        int sum = 0;
        for(byte value : input.readLine().getBytes()) {
            sum += (value - '0');
        }
        System.out.println(sum);
    }
    // 10809 알파벳 찾기
    public static void No10809() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        // a~z 배열
        int arr[] = new int[26];
        // 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다.
        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        String S = input.readLine();

        for(int j = 0; j < S.length(); j++) {
            char alphabet = S.charAt(j);
            if(arr[alphabet - 'a'] == -1){
                arr[alphabet - 'a'] = j;
            }
        }
        for(int value : arr) {
            System.out.println(value);
        }   
    }
    // 2675 문자열 반복
    public static void No2675() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(input.readLine());
        for(int i = 0; i < testCase; i++) {
            String arr[] = input.readLine().split(" ");
            int R = Integer.parseInt(arr[0]);
            String S = arr[1];
            for(int j = 0; j < S.length(); j++) {
                for(int k = 0; k < R; k++){
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
    // 1152 단어의 개수
    public static void No1152() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(input.readLine(), " ");
        System.out.println(st.countTokens());
    }
    // 2908 상수
    public static void No2908() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(input.readLine(), " ");

        int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        System.out.println(A > B ? A:B);
    }
}
