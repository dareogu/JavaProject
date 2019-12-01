package com.dareo.demo;

public class PrintDemo {
  public static void main(String[] args) {
    int a, b, c;
    a = 5;
    b = 17;
    c = a + b;
    c = -c;  //c此时赋值为负数
    long d = System.currentTimeMillis();//方法返回1970年1月1日零点到当前时间所经历的毫秒数
    System.out.println("a=" + a + " b=" + b + " c=" + c);
    System.out.println(Integer.toBinaryString(c));//打印c的二进制表示
    System.out.println(Integer.toHexString(b)); //打印d的十六进制表示
    System.out.println(Integer.MAX_VALUE); //输出int最大值
    System.out.println(Integer.max(a, b));
    System.out.println(d);
  }

}