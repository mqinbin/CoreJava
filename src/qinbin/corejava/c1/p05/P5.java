package qinbin.corejava.c1.p05;

import java.util.Random;

import static qinbin.corejava.util.UiUtil.*;

/**
 * Created by Q on 2016/9/22.
 */
public class P5 {
    public static void main(String[] args) {

        Random aRandom = new Random();
        double aDouble =( aRandom.nextDouble()  + 1 )* Double.MAX_VALUE /2;
        // 当double转int的时候，如果超过了Integer.MAX_VALUE,则转的int为Integer.MAX_VALUE
        int intFromDouble = (int)aDouble;

        out(""+aDouble);
        out(fixRightPatch0(64,Long.toBinaryString(Double.doubleToLongBits(aDouble))));
        out(""+intFromDouble);
        out(fixRightPatch0(64,Integer.toBinaryString(intFromDouble)));



        long aLong = (2L<< 32)  -1;
        // 当double转int的时候，如果超过了Integer.MAX_VALUE,则取二进制后面的32为,所以正数可能变成负的
        int intFromLong = (int) aLong;
        out(""+aLong);
        out(fixRightPatch0(64,Long.toBinaryString(aLong)));
        out(""+intFromLong);
        out(fixRightPatch0(64,Integer.toBinaryString(intFromLong)));

    }





}
