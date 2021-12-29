package Answer;
/**
 * No4344 평균은 넘겠지
 * 2021-12-29
 * @author Dong-yeong0
 */

import java.io.*;
import java.util.*;
public class No4344_Average2 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(input.readLine());
        int arr[];
        StringTokenizer sp;

        for(int i = 0; i < testCase; i++) {
            sp = new StringTokenizer(input.readLine(), " ");

            // 학생 수
            int students = Integer.parseInt(sp.nextToken());
            arr = new int[students];
            
            // 각 학생 총점
            double sum = 0;

            for(int j = 0; j < students; j++){
                // 각 학생들의 점수
                int value = Integer.parseInt(sp.nextToken());
                arr[j] = value;
                sum += value;
            }
            // 각 반 평균
            double avg = (sum / students);
            double count = 0;
            
            for(int k = 0; k < students; k++) {
                if(arr[k] > avg) {
                    count++;
                }
            }
            System.out.printf("%.3f\n",(count/students)*100);

        }


    }
}
