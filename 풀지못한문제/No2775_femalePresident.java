import java.io.*;
/**
 * No2775_femalePresident
 * 2022-01-03
 * @author Dong-yeong0
 */

public class No2775_femalePresident {
    public static int[][] APT = new int[15][15];
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        init_APT();

        int T = Integer.parseInt(input.readLine());

        for(int i = 0; i < T; i++) {  
            int k = Integer.parseInt(input.readLine());
            int n = Integer.parseInt(input.readLine());
            sb.append(APT[k][n]).append("\n");
        }
        System.out.println(sb);

    }
    public static void init_APT() {
        for(int i = 0; i < 15; i++) {
            // i층 1호는 1고정
            APT[i][1] = 1;
            APT[0][i] = i;
        }
        
        for(int i = 1; i < 15; i++) {
            for(int j = 2; j < 15; j++) {
                APT[i][j] = APT[i][j-1] + APT[i-1][j];
            }
        }
    }
}
