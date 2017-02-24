package com.cdc.algorithm_problem;
/**
 * 求最大公约数和最小公倍数
 * @author cdc
 *
 */
public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.format("%d和%d的最大公约数是:%d", 282,286,getGreatestCommonDivisor(282, 286));
		System.out.println("\r");
		System.out.format("%d和%d的最小公倍数是:%d", 282,286,getLeastCommonMultiple(282,286,getGreatestCommonDivisor(282, 286)));
	}
	/**
	 * 求两个正整数的最大公约数
	 * 辗转相除法， 
	 * 又名欧几里德算法（Euclidean algorithm）乃求两个正整数之最大公因子的算法.
	 * @param m
	 * @param n
	 * @return
	 */
	public static int getGreatestCommonDivisor(int m,int n){
		while(true){
			if((m=m%n)==0){
				return n;
			}
			if((n=n%m)==0){
				return m;
			}
		}
	}
	/**
	 * 求两个正整数的最小公倍数
	 * @param m
	 * @param n
	 * @param 这两个数的最大公约数
	 * @return
	 */
	public static int getLeastCommonMultiple(int m,int n,int c){
		int temp=m*n/c;
		return temp;
	}
	/**
	 * 更相减损法,又称"等值算法"
	 * @param m
	 * @param n
	 * @return
	 */
	public  static int getGreatestCommonDivisor2(int m,int n){
		while(m!=n){
			if(m>n){
				m-=n;
			}else{
				n-=m;
			}
		}
		return m;
	}

}
