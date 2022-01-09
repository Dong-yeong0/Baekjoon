package 푼문제;

import java.io.*;

/**
 * No2292_honeyComb
 * 2022-01-09
 * @author Dong-yeong0
 */
public class No2292_honeyComb {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        // 벌집 방 번호
        int N = Integer.parseInt(input.readLine());
        int count = 1;
        int startNumber = 2;

        // 번호가 1번일 경우는 1을 출력
        if(N == 1) {
            System.out.println(1);
        } else {
            while(startNumber <= N) {
                // 2 ~ 7 돌고 8부터 시작이니까 2 + (6 * 1) = 8
                // 8 ~ 19 -> 8 + (6*2) = 20 이런식의 알고리즘
                startNumber = startNumber + (6 * count);
                count++;
            }
            System.out.println(count);
        }
        

    }
    
}