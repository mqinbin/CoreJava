package qinbin.corejava.util;

import java.util.Scanner;

/**
 * Created by Q on 2016/9/22.
 */
public class UiUtil {
    private static Scanner sScanner;

    public static Scanner getScanner() {
        if (sScanner == null) {
            sScanner = new Scanner(System.in);
        }
        return sScanner;
    }

    public static int sayAndWaitInt(String say) {
        System.out.println(say);
        return getScanner().nextInt();
    }
    public static String fixLeft(int pre,String perStr) {
        return  String.format("%-"+pre+"s",perStr) ;
    }
    public static String fixRight(int pre,String perStr) {
        return  String.format("%"+pre+"s",perStr) ;
    }

    public static String fixRightPatch0(int pre,String perStr) {
        return  String.format("%"+pre+"s",perStr).replace(' ','0') ;
    }
    public static String append(String... in){
        StringBuffer aStringBuffer = new StringBuffer();
        for (String aS : in) {
            aStringBuffer.append(aS);
        }
        return aStringBuffer.toString();
    }
    public static void out(String s){
        System.out.println(s);
    }
}
