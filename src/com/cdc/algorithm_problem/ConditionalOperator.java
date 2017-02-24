package com.cdc.algorithm_problem;
/**
 * 条件运算符
 * (a>b)?a:b这是条件运算符的基本例子
 * @author cdc
 *
 */
public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=null;
		int n=90;
		str=(n>=90?"A":(n>60?"B":"C"));
		System.out.println("str="+str);

	}

}
