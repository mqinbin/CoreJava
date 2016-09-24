package qinbin.corejava.c1.p07;

import java.nio.channels.Pipe;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Q on 2016/9/23.
 */
public class P7 {
    public static void main(String[] args) {
//        short mask = (short) 0xDFFF;
//        Random random = new Random();
//
//        short[] shorts = new short[2];
////        shorts[0] = (short) (random.nextInt()& mask);
////        shorts[1] = (short) (random.nextInt()& mask);
//        shorts[0] = (short) 61234;
//        shorts[1] = (short) 51234;
//        Byte.to
//        calByte(shorts[0],shorts[1]);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number (from 0 to 65535): ");
        short a = (short)in.nextInt();
        System.out.print("Enter the second number (from 0 to 65535): ");
        short b = (short)in.nextInt();

        System.out.println("a + b = " + Short.toUnsignedInt((short)(a + b)));
        System.out.println("a - b = " + Short.toUnsignedInt((short)(a - b)));
        System.out.println("a * b = " + Short.toUnsignedInt(a) * Short.toUnsignedInt(b));
        System.out.println("a / b = " + Short.toUnsignedInt(a) / Short.toUnsignedInt(b));
        System.out.println("a % b = " + Short.toUnsignedInt(a) % Short.toUnsignedInt(b));
    }

    private static void calByte(short a, short b) {
        System.out.println("a"+a+" b"+b);
        System.out.println("+:" + (a + b));
        System.out.println("-:" + (a - b));
        System.out.println("*:" + (a * b));
        System.out.println("/:" + (a / b));
        System.out.println("%:" + (a % b));
    }
}
