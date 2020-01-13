package com.haoyd.gofdemo;

/**
 * 统计每个页面用户点击按钮的次数总和。
 */
public class Singleton {
    public void main() {
        HomePage homePage = new HomePage();
        homePage.doWorks();
        homePage.finishPage();

        OrderPage orderPage = new OrderPage();
        orderPage.doWorks();
        orderPage.finishPage();
    }
}

/**
 * 点击计数器
 */
class ClickCounter {

    private static int clickNum = 0;

    public static void countClick() {
        clickNum++;
    }

    public static int getClickNum() {
        return clickNum;
    }
}

/**
 * 主页面
 */
class HomePage {

    public HomePage() {
        Logger.pageIn("主页");
    }

    /**
     * 该页面的所有操作
     */
    public void doWorks() {
        openBanner();
        openClassList();
    }

    /**
     * 退出页面
     */
    public void finishPage() {
        Logger.pageOut("主页");
        Logger.outMain("总共点击了 " + ClickCounter.getClickNum() + " 次");
    }

    /**
     * 打开 banner
     */
    private void openBanner() {
        Logger.out("打开 banner");
        ClickCounter.countClick();
    }

    /**
     * 打开分类列表
     */
    private void openClassList() {
        Logger.out("打开分类列表");
        ClickCounter.countClick();
    }
}

/**
 * 订单页面
 */
class OrderPage {
    public OrderPage() {
        Logger.pageIn("订单");
    }

    /**
     * 退出页面
     */
    public void finishPage() {
        Logger.pageOut("订单");
        Logger.outMain("总共点击了 " + ClickCounter.getClickNum() + " 次");
    }

    /**
     * 该页面的所有操作
     */
    public void doWorks() {
        finishOrder();
        evaluateOrder();
    }

    private void finishOrder() {
        Logger.out("点击完成订单");
        ClickCounter.countClick();
    }

    private void evaluateOrder() {
        Logger.out("评价订单");
        ClickCounter.countClick();
    }
}
