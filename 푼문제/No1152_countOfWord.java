package 푼문제;
import java.io.*;
import java.util.StringTokenizer;
/**
 * No1152_countOfWord
 * 2022-01-03
 * @author Dong-yeong0
 */
public class No1152_countOfWord {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        /* 내가 생각했던 답. (공백까지 처리되어서 7이 나올때도 있었음)
        String arr[] = input.readLine().split(" ");
        System.out.println(arr.length);
        */
        // 답안 StringTokenizer 사용
        StringTokenizer st = new StringTokenizer(input.readLine(), " ");
        System.out.println(st.countTokens());
    }
    
}