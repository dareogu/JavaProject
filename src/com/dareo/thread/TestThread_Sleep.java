package com.dareo.thread;

import java.util.Date;

/**
 * 测试多线程Sleep
 *
 * @author Dareo_Gu 2017-10-15
 */

public class TestThread_Sleep {
  public static void main(String[] args) {
    MyThread r = new MyThread();
    r.setPriority(1); // 设置优先级为1
    r.start();
    // System.out.println(r.currentThread().isAlive());//确定线程是否未终止
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      r.interrupt();
    }
    // System.out.println(r.currentThread().isAlive());//确定线程是否未终止
    for (int i = 0; i < 10; i++) {
      System.out.println("Main----我是第" + i + "次打印的！");
    }
    r.ShutDown();//停止线程
  }
}

class MyThread extends Thread { // 继承Thread类
  boolean flag = true;

  public void run() {// 重写run方法
    while (flag == true) {
      System.out.println("MyThread---" + new Date()); // 打印当前时间
      try {
        sleep(1000);
      } catch (InterruptedException e) {
        return;
      }
    }
  }

  public void ShutDown() {
    flag = false;
  }

}