package com.dareo.practice;

public class TestDuplicateSum {
  public static int Duplicate(int a, int n) {
    if (n == 1) {
      return a;
    } else {
      return (int) (Duplicate(a, n - 1) + a * Math.pow(10, n - 1));
    }
  }

  public static void SumDuplicate(int a, int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += Duplicate(a, i);
    }
    System.out.println(sum);
  }

  public static void main(String[] args) {
    System.out.println(Duplicate(2, 5));
    SumDuplicate(2, 5);
  }

//	public static void sumAA(int a,int n){
//		int sum=0;
//		for(int i=0;i<n;i++){
//			sum+=(n-i)*a*Math.pow(10, i);
//		}
//		System.out.println(sum);
//	}
//	public static void main(String[] args) {
//		sumAA(1,2);
//	}
}
