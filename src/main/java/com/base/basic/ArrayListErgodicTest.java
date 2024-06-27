package com.base.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListErgodicTest {
  public static void main(String[] args) {
    //���϶���
    List<String> elementList = new ArrayList<>();

    //���Ԫ��
    elementList.add("����һ������");
    elementList.add("������һ��������");
    elementList.add("Hello world!");
    elementList.add("�����밲��");

    //��һ�ֱ�����ʽ
    for (int i = 0; i < elementList.size(); i++) {
      String array = elementList.get(i);
      System.out.println(array);
    }

    System.out.println("====================================");
    elementList.remove(2); //ɾ��������λ�õ�String����

    //���õ��������б���
    for (Iterator<String> it = elementList.iterator(); it.hasNext(); )//�ж��Ƿ�����һ��Ԫ��
    {
      String str = it.next(); //��ȡ��һ��Ԫ�ص�ֵ
      System.out.println(str);
    }

    elementList.add(null);
    elementList.add("null");
    System.out.println("====================================");

    //�����ֱ�����ʽ
    Iterator<String> it2 = elementList.iterator();
    while (it2.hasNext()) {
      String str2 = it2.next();
      System.out.println(str2);
    }
  }
}