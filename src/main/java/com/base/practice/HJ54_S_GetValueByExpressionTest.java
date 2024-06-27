package com.base.practice;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

/**
 * @Auther Dareo Gu
 * @Create: 2023-03-14 20:33
 *
 * 给定一个字符串描述的算术表达式，计算出结果值。
 *
 * 输入字符串长度不超过 100 ，合法的字符包括 ”+, -, *, /, (, )” ， ”0-9”
 * 即只进行整型运算，确保输入的表达式合法
 **/
public class HJ54_S_GetValueByExpressionTest {
  public static void main(String[] args) throws ScriptException {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    input = input.replace("[", "(");
    input = input.replace("{", "(");
    input = input.replace("}", ")");
    input = input.replace("]", ")");
    ScriptEngine scriptEngine = new
        ScriptEngineManager().getEngineByName("nashorn");
    System.out.println(scriptEngine.eval(input));
  }
}
