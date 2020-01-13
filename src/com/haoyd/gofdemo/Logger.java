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

    public static void pageIn(String pageName) {
        out(" ");
        outMain("-----------------" + pageName + " start -----------------");
    }

    public static void pageOut(String pageName) {
        outMain("-----------------" + pageName + " end -----------------");
    }
}
