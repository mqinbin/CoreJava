package qinbin.corejava.c1.p02;


import qinbin.corejava.util.UiUtil;

/**
 * Created by Q on 2016/9/22.
 */
public class P2 {
    public static void main(String[] args) {
        int input = UiUtil.sayAndWaitInt("give me a integer:");
        // can be negative
        System.out.println(String.format("First:\t[%d]", input %360));
        // can't be negative
        System.out.println(String.format("Second:\t[%d]", Math.floorMod(input,360)));

    }
}
