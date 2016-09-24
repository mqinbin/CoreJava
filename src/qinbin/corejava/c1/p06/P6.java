package qinbin.corejava.c1.p06;

import java.math.BigInteger;

/**
 * Created by Q on 2016/9/23.
 */
        public class P6 {
            public static void main(String[] args) {
                long startTime = System.currentTimeMillis();
        System.out.println(factorial(1000).toString());
        System.out.println("耗时"+(System.currentTimeMillis() -startTime)+"ms");
    }

    public static BigInteger factorial(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n should be more than 0");
        }
        BigInteger start = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            start = start.multiply(BigInteger.valueOf(i));
        }
        return start;

    }
}
