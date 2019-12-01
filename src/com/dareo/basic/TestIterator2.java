package com.dareo.basic;

/**
 * 测试遍历Iterator
 *
 * @author Dareo Gu
 * 2017-10-21
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator2 {
  public static void main(String[] args) {
    Collection<String> st = new ArrayList<String>();
    st.add("abc");
    st.add("hello");
    st.add("world");
    st.add("xyz");
    Collection tw = new ArrayList();
    tw.add(new Integer(100));
    tw.add(new Hobby("tiaowu"));
    System.out.println(st);
    System.out.println(tw);
    Iterator itr = st.iterator();// 遍历输入数组中的所有元素
    while (itr.hasNext()) {
      Object o = itr.next();
      System.out.println(o);
    }
  }
}

class Hobby {
  String Aihao;

  public String getAihao() {
    return Aihao;
  }

  public void setAihao(String aihao) {
    Aihao = aihao;
  }

  public Hobby(String aihao) {
    super();
    Aihao = aihao;
  }

  @Override
  public String toString() {
    return Aihao;
  }

}