package com.dareo.thread;

/**
 * 线程的暂时让渡
 *
 * @author Dareo_Gu
 * 2017-10-15
 */
public class TestThread_Yield {
  public static void main(String[] args) {
    YieldThread y1 = new YieldThread("Sub thread1");
    YieldThread y2 = new YieldThread("Sub thread2");
    y1.start();
    y2.start();
    for (int i = 100; i >= 3; i--) {
      System.out.println("main thread:" + i);
    }
  }
}

class YieldThread extends Thread {
  YieldThread(String str) {
    super(str);
  }

  public void run() {
    for (int i = 1; i <= 100; i++) {
      System.out.println(getName() + "******" + i);
      if (i % 11 == 0 || i % 7 == 0) {
        yield();
      }
    }
  }
}
