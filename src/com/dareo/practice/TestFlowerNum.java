package com.dareo.practice;

//public class TestFlowerNum {
//	public static void main(String[] args) {
//		int a = 0, b = 0, c = 0;
//		for (int i = 100; i < 999; i++) {
//			a = i / 100;
//			b = (i % 100) / 10;
//			c = i % 10;
//			if (i==(a*a*a+b*b*b+c*c*c)) {
//				System.out.println(i);
//			}
//		}
//	}
//}

public class TestFlowerNum {
  public static void main(String[] args) {
    for (int i = 100; i < 999; i++) {
      if (FlowerNum(i) == true) {
        System.out.println(i);
      }
    }
  }

  public static boolean FlowerNum(int i) {
    int a = 0, b = 0, c = 0;
    a = i / 100;
    b = (i % 100) / 10;
    c = i % 10;
    if (i == (a * a * a + b * b * b + c * c * c)) {
      return true;
    } else {
      return false;
    }
  }
}
