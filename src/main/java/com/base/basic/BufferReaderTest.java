package com.base.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Auther Dareo Gu
 * @Create: 2024-06-16 11:25
 **/
public class BufferReaderTest {
  public static void main(String args[]) throws IOException {
    char c;
    // 使用 System.in 创建 BufferedReader
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("输入字符, 按下 'q' 键退出。");
    // 读取字符
    do {
      c = (char) br.read();
      System.out.println(c);
    } while (c != 'q');
  }
}
