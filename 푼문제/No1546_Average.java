package 푼문제;

/**
 * No1546_Average
 * 2021-12-29
 * @author Dong-yeong0
 */

import java.io.*;
import java.util.*;

public class No1546_Average {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        double arr[] = new double[Integer.parseInt(input.readLine())];
        
        StringTokenizer sp = new StringTokenizer(input.readLine(), " ");

        for(int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(sp.nextToken());
            
        }

        double sum = 0;
        // 오름차순 정렬
        Arrays.sort(arr);
        
        for(int j = 0; j < arr.length; j++) {
            sum += ((arr[j] / arr[arr.length - 1]) * 100);
        }
        System.out.println(sum / arr.length);
    }
}