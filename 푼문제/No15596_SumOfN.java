package 푼문제;

/**
 * No15596_SumOfN
 * 2021-12-30
 * @author Dong-yeong0
 */

public class No15596_SumOfN {
    public class Test {
        long sum(int[] a) {
            long ans = 0;

            for(int i = 0; i < a.length; i++){
                ans += a[i];
            }

            return ans;
        }
    }
}