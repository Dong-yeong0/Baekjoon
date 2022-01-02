package 푼문제;

/**
 * No11720_SumOfNumber
 * 2022-01-02
 * @author Dong-yeong0
 */

import java.io.*;
import java.util.*;
public class No11720_SumOfNumber {
    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String a = sc.next();

        int sum = 0;

        for(int i = 0; i < n; i++) {
            sum += a.charAt(i) - '0';
        }

        System.out.println(sum);
        
    }
}