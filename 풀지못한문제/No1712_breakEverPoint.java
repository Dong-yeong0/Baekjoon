import java.io.*;
import java.util.*;
/**
 * No1712_breakEverPoint
 * 2022-01-03
 * @author Dong-yeong0
 */

public class No1712_breakEverPoint {
    public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      StringTokenizer st = new StringTokenizer(br.readLine());
      
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      int C = Integer.parseInt(st.nextToken());

      if (C <= B) {
        System.out.println("-1");
      } 
      else {
        System.out.println((A/(C-B))+1);
      }
    }
}
