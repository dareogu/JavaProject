package com.practice;

/**
 * @Auther Dareo Gu
 * @Create: 2023-03-14 21:26
 * <p>
 * 公元五世纪，我国古代数学家张丘建在《算经》一书中提出了“百鸡问题”：鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？
 * 现要求你打印出所有花一百元买一百只鸡的方式。
 **/
public class HJ72_S_100MoneyBuy100Chicken {

  public static void main(String[] args) {
    //        5x+3y+z/3=100;
    //        x+y+z=100;
    //        简化得 7x+4y=100;
    int x, y, z;
    for (x = 0; x <= 14; x++) {
      if ((100 - 7 * x) % 4 == 0) {
        y = (100 - 7 * x) / 4;
        z = 100 - x - y;
        System.out.print(x + " ");
        System.out.print(y + " ");
        System.out.print(z + " ");
        System.out.println();
      }
    }
  }
}
