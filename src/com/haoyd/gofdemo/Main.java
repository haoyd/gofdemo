package com.haoyd.gofdemo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static final Map<Integer, String> PATTERNS = new HashMap<>();

    static {
        /**
         * 创建型
         */
        PATTERNS.put(0, "单例");
        PATTERNS.put(1, "简单工厂");
        PATTERNS.put(2, "工厂方法");
        PATTERNS.put(3, "建造者");
        PATTERNS.put(4, "原型");

        /**
         * 结构型
         */
        PATTERNS.put(5, "适配器");
        PATTERNS.put(6, "装饰器");
        PATTERNS.put(7, "代理");
        PATTERNS.put(8, "外观");
        PATTERNS.put(9, "桥接");
        PATTERNS.put(10, "组合");
        PATTERNS.put(11, "享元");

        /**
         * 行为型
         */
        PATTERNS.put(12, "策略");
        PATTERNS.put(13, "模板");
        PATTERNS.put(14, "观察者");
        PATTERNS.put(15, "迭代器");
        PATTERNS.put(16, "责任链");
        PATTERNS.put(17, "命令");
        PATTERNS.put(18, "备忘录");
        PATTERNS.put(19, "状态");
        PATTERNS.put(20, "访问者");
        PATTERNS.put(21, "中介者");
        PATTERNS.put(22, "解释器");
    }

    public static void main(String[] args) {
        printPatterns();

        int index = 0;

        Scanner scan = new Scanner(System.in);
        // 判断是否还有输入
        while (scan.hasNextLine()) {
            String str = scan.nextLine();

            if (str.equals("exit")) {
                scan.close();
                break;
            }

            index = Integer.parseInt(str);

            System.out.println("您选择的是：" + PATTERNS.get(index) + "\n\n");
        }
        scan.close();
    }

    private static void printPatterns() {
        PATTERNS.forEach((key, value) -> {
            System.out.println(key + "\t" + value);
        });

        System.out.println("\n\n请输入设计模式序号：\n\n");
    }
}
