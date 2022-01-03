package 푼문제;
import java.io.*;
import java.util.StringTokenizer;
/**
 * No2908_aConstant
 * 2022-01-03
 * @author Dong-yeong0
 */

public class No2908_aConstant {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(input.readLine(), " ");
        /**
         * 자바에서 String 객체는 변경이 불가능한 불변(immutable) 객체이다
         * 예를 들어 String str1 = "abc", String str2 = "def" 에 str1 + str2; 같은 연산을 할 때
         * 새로운 String 객체가 생성된다. String객체를 더하는 행위는 메모리 할당과 메모리 해제를 발생시키며
         * 더하는 연산이 많아진다면 성능적으로 좋지가 않다.
         * 100만개의 문자열을 연결해야되는 상황이 있다고 가정하고 생각하면 끔찍
         * 이 상황에 고려할 수 있는 것 중 하나인 StringBuilder는 변경이 가능한 문자열을 생성해준다.
         * 여기서 문자열을 뒤집을 수 있는 reverse()
         */
        int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        System.out.println(A > B ? A:B);
    }
}
