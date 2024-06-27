package com.base.basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 了解java的反射机制：类都有属性，都有构造器，都有方法，都能调用方法
 * Class这个类用于操纵一个类的属性、方法和构造器
 *
 * @author Dareo_Gu
 * 2017-12-17
 */
public class ClassReflectTest {
  public static void main(String[] args) throws ClassNotFoundException {
    //根据一个类的全名字符串来获得一个类的类对象
    Class<?> clazz = Class.forName("java.lang.String"); //获取一个类的类对象
    //获得传递过来的类的所有方法，拿到方法是为了调用
    Method[] methods = clazz.getDeclaredMethods(); //Method来自reflect包
    //System.out.println(Arrays.toString(methods));
    for (Method m : methods) {
      System.out.println(m);
    }
    System.out.println("*********************************");
    //获得类的所有属性
    Field[] fields = clazz.getDeclaredFields();
    for (Field f : fields) {
      System.out.println(f);
    }
    System.out.println("*********************************");
    //获得类的所有构造器,拿到构造器是为了创建
    Constructor<?>[] cs = clazz.getDeclaredConstructors();
    for (Constructor<?> c : cs) {
      System.out.println(c);
    }

  }
}