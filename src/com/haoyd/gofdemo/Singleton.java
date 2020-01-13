package com.haoyd.gofdemo;

/**
 * 统计每个页面用户点击按钮的次数。
 */
public class Singleton {
    public void main() {
        HomePage homePage = new HomePage();
        homePage.doWorks();
        homePage.finishPage();
    }
}

/**
 * 点击计数器
 */
class ClickCounter {

    private int clickNum = 0;

    public void countClick() {
        clickNum++;
    }

    public int getClickNum() {
        return clickNum;
    }
}

/**
 * 主页面
 */
class HomePage {

    private ClickCounter clickCounter;

    public HomePage() {
        System.out.println();
        Logger.outMain("进入主页面");
        clickCounter = new ClickCounter();
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
        Logger.outMain("退出主页面");
        Logger.outMain("整个页面点击了 " + clickCounter.getClickNum() + " 次");
    }

    /**
     * 打开 banner
     */
    private void openBanner() {
        Logger.out("打开 banner");
        clickCounter.countClick();
    }

    /**
     * 打开分类列表
     */
    private void openClassList() {
        Logger.out("打开分类列表");
        clickCounter.countClick();
    }
}
