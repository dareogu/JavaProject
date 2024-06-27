package com.base.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @Auther Dareo Gu
 * @Create: 2024-06-16 12:12
 **/
public class ShuffleTest {

  public static void main(String args[]) {
    // create array list object
    List<String> arrlist = new ArrayList<String>();

    // populate the list
    arrlist.add("A");
    arrlist.add("B");
    arrlist.add("C");
    arrlist.add("D");
    arrlist.add("E");
    arrlist.add("F");
    arrlist.add("G");
    arrlist.add("H");

    System.out.println("Initial collection: " + arrlist);

    // shuffle the list
//    Collections.shuffle(arrlist);
    Random random = new Random(Math.addExact(0, 10));
    Collections.shuffle(arrlist, random);

    System.out.println("Final collection after shuffle: " + arrlist);
  }
}
