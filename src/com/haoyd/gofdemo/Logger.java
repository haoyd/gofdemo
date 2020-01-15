package com.haoyd.gofdemo;

public class Logger {
    public static void outMain(String s) {
        System.out.println(s);
    }

    public static void out(String s) {
        System.out.println("  " + s);
    }

    public static void line() {
        System.out.println("--------------------------------------");
    }

    public static void handleStart(String name) {
        out(" ");
        outMain("-----------------" + name + " start -----------------");
    }

    public static void handleEnd(String name) {
        outMain("-----------------" + name + " end -----------------");
    }
}
