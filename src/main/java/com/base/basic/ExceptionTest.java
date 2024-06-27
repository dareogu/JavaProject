package com.base.basic;

/**
 * @Auther Dareo Gu
 * @Create: 2024-06-16 11:37
 **/
public class ExceptionTest {
  public static void main(String[] args) {
    Bar bar = new Bar();

    try {
      bar.enter(15);
    } catch (IllegalArgumentException var3) {
      System.out.println("错误信息：" + var3.getMessage());
    }

    System.out.println("end");
  }

  static class Bar {
    Bar() {
    }

    public void enter(int age) throws IllegalArgumentException {
      if (age < 18) {
        throw new IllegalArgumentException("年龄不合格");
      } else {
        System.out.println("欢迎光临");
      }
    }
  }

}
