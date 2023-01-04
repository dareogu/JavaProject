package com.thread;

import java.util.Date;

/**
 * 线程的合并，相当于调用
 *
 * @author Dareo_Gu
 * 2017-10-15
 */
public class TestThread_Join {
  public static void main(String[] args) {
    JoinThread j1 = new JoinThread("Sub join thread");
    j1.start();
    try {
      j1.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  private static class JoinThread extends Thread {
    JoinThread(String str) {
      super(str);
    }

    @Override
    public void run() {
      for (int i = 1; i <= 10; i++) {
        try {
          sleep(1000);
          System.out.println(new Date() + " " + getName() + i);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
  }
}