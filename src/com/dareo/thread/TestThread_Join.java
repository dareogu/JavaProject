package com.dareo.thread;

import java.util.Date;

/**
 * 线程的合并，相当于调用
 *
 * @author Dareo_Gu
 * 2017-10-15
 */
public class TestThread_Join {
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    JoinThread j1 = new JoinThread("Sub join thread");
    j1.start();
    try {
      j1.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    for (int i = 100; i >= 3; i--) {
      System.out.println("main thread:" + i);
    }
  }
}

class JoinThread extends Thread {
  JoinThread(String str) {
    super(str);
  }

  public void run() {
    for (int i = 1; i <= 100; i++) {
      try {
        sleep(1000);
        System.out.println(new Date() + getName() + i);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}