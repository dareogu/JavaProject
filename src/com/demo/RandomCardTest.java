package com.demo;

/**
 * 洗牌算法
 *
 * @author 老炎
 * 2017-11-19
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomCardTest {
  public static void main(String[] args) {
    String[] a = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    String[] b = {"红心", "黑桃", "方块", "梅花"};
    List<String> ls = new ArrayList<String>(); //洗牌前
    List<String> XP = new ArrayList<String>(); //洗牌后
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        ls.add(b[j] + a[i]);
      }
    }
    ls.add("小王");
    ls.add("大王");
    System.out.println("洗牌前的牌序为：" + ls);  //生成集合中有序的牌

    int k = 0; //记录生成的随机数，即想获得的牌的序号
    for (int i = ls.size(); i >= 1; i--) {
      Random r = new Random();
      k = r.nextInt(i);
      XP.add(54 - i, ls.get(k)); //把原始牌序中随机获取的牌添加到洗牌后的集合中
      ls.remove(k);  //把已经添加到洗牌后集合中的牌给去除
    }
    System.out.println("洗牌后的牌序为：" + XP);
  }
}
