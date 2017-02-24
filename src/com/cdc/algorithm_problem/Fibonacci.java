package com.cdc.algorithm_problem;
/**
 * 递归调用
 * 
 * 兔子在出生两个月后，就有繁殖能力，
 * 一对兔子每个月能生出一对小兔子来。
 * 如果所有兔子都不死，那么一年以后可以繁殖多少对兔子？
 * 
 * 第一个月小兔子没有繁殖能力，所以还是一对
 * 两个月后，生下一对小兔对数共有两对
 * 三个月以后，老兔子又生下一对，因为小兔子还没有繁殖能力，所以一共是三对。
 * 斐波那契数列（Fibonacci sequence），又称黄金分割数列,
 * 因数学家列昂纳多·斐波那契（Leonardoda Fibonacci）以兔子繁殖为例子而引入，故又称为“兔子数列”，
 * 指的是这样一个数列：1、1、2、3、5、8、13、21、34、……
 * 在数学上，
 * 斐波纳契数列以如下被以递归的方法定义：F(0)=1，F(1)=1, F(n)=F(n-1)+F(n-2)（n>=2，n∈N*）
 * @author cdc
 *
 */
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci  fibonacci=new Fibonacci();
		int i=0;
		for (i = 1; i <=20; i++) {
			System.out.format("第%d个月兔子的数量是:%d", i,fibonacci.f(i));
			System.out.println("\r");
		}
	}
	
	public int f(int x){
		if(x==1 || x==2){
			return 1;
		}else{
			int temp=f(x-1)+f(x-2);
			return temp;
		}
	}

}
