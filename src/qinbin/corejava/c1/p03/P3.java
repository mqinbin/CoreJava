package qinbin.corejava.c1.p03;

import java.util.Random;
import java.util.StringJoiner;

/**
 * Created by Q on 2016/9/22.
 */
public class P3 {
    public static void main(String[] args) {
        Random aRandom = new Random();
        int a = aRandom.nextInt(10000);
        int b = aRandom.nextInt(10000);
        int c = aRandom.nextInt(10000);
        System.out.println(String.format("a:[%d],b:[%d],c:[%d]", a, b, c));
        int max = chooseMax1(a, b, c);
        System.out.println(String.format("max is:[%d]",chooseMax2(a,b,c)));
    }

    private static int chooseMax1(int a, int b, int c) {
        return chooseMax1(chooseMax1(a, b), c);
    }

    private static int chooseMax1(int a, int b) {
//        if (a > b) {
//            return a;
//        } else {
//            return b;
//        }
        return a > b ? a : b;
    }

    private static int chooseMax2(int a, int b, int c) {
        return Math.max(Math.max(a,b),c);
    }
}
