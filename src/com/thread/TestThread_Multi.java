package com.thread;

/**
 * 测试多线程
 *
 * @author Dareo_Gu
 * 2017-10-15
 */

public class TestThread_Multi {
  public static void main(String[] args) {
    MyRunner r = new MyRunner();
    Thread t = new Thread(r);
    t.start();
    //t.run(); //如果是run，则是调用，没有起新线程
    for (int i = 0; i < 10; i++) {
      System.out.println("Main----我是第" + i + "次打印的！");
    }
  }

  private static class MyRunner implements Runnable { //实现runnable接口
    public void run() {//重写run方法
      for (int i = 0; i < 10; i++) {
        System.out.println("MyRunner----我是第" + i + "次打印的！");
      }
    }
  }
}