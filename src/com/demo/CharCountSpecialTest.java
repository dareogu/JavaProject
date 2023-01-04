package com.demo;

public class CharCountSpecialTest {
  public static void main(String[] args) {
    String str = "fljdlksfjlja*lfj0slfl jlFdfj ^%$al4d3fa313dfse22!$45";
    int countchar = 0;
    int countspace = 0;
    int countnum = 0;
    int countother = 0;
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
        countchar++;
      } else if (c == ' ') {
        countspace++;
      } else if (c >= '0' && c <= '9') {
        countnum++;
      } else {
        countother++;
      }
    }
    System.out.println(str.length());
    System.out.println(countchar + "," + countspace + "," + countnum + "," + countother);

    String str2 = "Ljava834ofJaa993*45Java java JAVA/-+jflkekjlkJAva 5jf";
    String Sfind = "java";
    String[] ss = str2.split(Sfind);
    for (int i = 0; i < ss.length; i++) {
      System.out.println(ss[i]);
    }
    System.out.println(ss.length);

    int found = 0;
    int index = -1;

    while (str2.indexOf(Sfind) != -1) {
      index = str2.indexOf(Sfind);
      str2 = str2.substring(index + Sfind.length()); //截取字符串（剩下字符串从某位置开始）
      System.out.println(str2);
      found++;
    }
    System.out.println("总共找到java的次数：" + found);
  }
}
