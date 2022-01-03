package 푼문제;
import java.io.*;

/**
 * No2675_stringLoop
 * 2022-01-03
 * @author Dong-yeong0
 */
public class No2675_stringLoop {

    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(input.readLine());

        for(int i = 0; i < testCase; i++) {
            String[] str = input.readLine().split(" ");

            int loop = Integer.parseInt(str[0]);
            String S = str[1];
            for(int j = 0; j < S.length(); j++) {
                for(int k = 0; k < loop; k++) {
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }



    }
}