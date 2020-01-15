package com.haoyd.gofdemo;

/**
 * 统计每个页面用户操作按钮的次数总和。
 */
public class Singleton {
    public void main() {

        DownloadServer downloadServer = new DownloadServer();
        downloadServer.download("水手");
        downloadServer.download("你笑起来真好看");
        downloadServer.download("花海");

//        HomePage homePage = new HomePage();
//        homePage.doWorks();
//        homePage.finishPage();
//
//        OrderPage orderPage = new OrderPage();
//        orderPage.doWorks();
//        orderPage.finishPage();
    }
}

/**
 * 操作计数器
 */
class OperationCounter {

    private static OperationCounter operationCounter = null;

    private OperationCounter() {}

    public static OperationCounter getInstance() {
        if (operationCounter == null) {
            operationCounter = new OperationCounter();
        }
        return operationCounter;
    }

    private static int clickNum = 0;

    public void countOperation() {
        clickNum++;
    }

    public int getTotalNum() {
        return clickNum;
    }
}

/**
 * 主页面
 */
class HomePage {

    public HomePage() {
        Logger.handleStart("主页");
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
        Logger.handleEnd("主页");
        Logger.outMain("总共操作了 " + OperationCounter.getInstance().getTotalNum() + " 次");
    }

    /**
     * 打开 banner
     */
    private void openBanner() {
        Logger.out("打开 banner");
        OperationCounter.getInstance().countOperation();
    }

    /**
     * 打开分类列表
     */
    private void openClassList() {
        Logger.out("打开分类列表");
        OperationCounter.getInstance().countOperation();
    }
}

/**
 * 订单页面
 */
class OrderPage {
    public OrderPage() {
        Logger.handleStart("订单");
    }

    /**
     * 退出页面
     */
    public void finishPage() {
        Logger.handleEnd("订单");
        Logger.outMain("总共操作了 " + OperationCounter.getInstance().getTotalNum() + " 次");
    }

    /**
     * 该页面的所有操作
     */
    public void doWorks() {
        finishOrder();
        evaluateOrder();
    }

    private void finishOrder() {
        Logger.out("操作完成订单");
        OperationCounter.getInstance().countOperation();
    }

    private void evaluateOrder() {
        Logger.out("评价订单");
        OperationCounter.getInstance().countOperation();
    }
}

class DownloadServer {
    public void download(String file) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Logger.handleStart("下载");
                Logger.out("下载：" + file);
                OperationCounter.getInstance().countOperation();
                Logger.handleEnd("下载");
                Logger.outMain("总共操作了 " + OperationCounter.getInstance().getTotalNum() + " 次");
            }
        }).start();
    }
}
