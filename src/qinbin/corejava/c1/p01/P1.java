package qinbin.corejava.c1.p01;

import static qinbin.corejava.util.UiUtil.*;



/**
 * Created by Q on 2016/9/22.
 */
public class P1 {
    public static void main(String[] args) {
        int input = sayAndWaitInt("give me a integer:");
        int preCount = 30;
        out(append(fixLeft(preCount, "Binary"), fixRightPatch0(32, Integer.toBinaryString(input))));
        out(append(fixLeft(preCount, "Octal"), Integer.toOctalString(input)));
        out(append(fixLeft(preCount, "Hex"), String.format("%08X",input)));
        out(append(fixLeft(preCount, "BinForReciprocal"), fixRightPatch0(32, Integer.toBinaryString(Float.floatToIntBits(1.0f / input)))));
        out(append(fixLeft(preCount, "HexForReciprocal"), String.format("%08X",Float.floatToIntBits(1.0f / input))));

    }


}