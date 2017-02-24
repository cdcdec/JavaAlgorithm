package com.cdc.algorithm_problem;
/**
 * 水仙花数是指一个 n位正整数 (n≥3),它的每个位上的数字的 n次幂之和等于它本身.
 * (例如：1^3 + 5^3+ 3^3 = 153)
 * 1634=1^4+6^4+3^4+4^4.
 * 
 * @author cdc
 *
 */
public class NarcissisticNumber {

	public static void main(String[] args) {
		for (int i = 100; i <= 999; i++) {
			boolean bl = isNarcissisticNumber1(i);
			if (bl) {
				System.out.format("%d是水仙花数", i);
				System.out.println("\n");
			}
		}
	}
	/**
	 * 求三位数的水仙花数
	 * @param x
	 * @return
	 */
	public static boolean isNarcissisticNumber1(int x) {
		boolean flag = true;
		int i = 0, j = 0, k = 0;
		i = x / 100;
		j = (x % 100) / 10;
		k = x % 10;
		if (x == i * i * i + j * j * j + k * k * k) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}
	/**
	 * 求四位数的水仙花数
	 * @param x
	 * @return
	 */
	public static boolean isNarcissisticNumber2(int x) {
		boolean flag = true;
		int i = 0, j = 0, k = 0,l=0;
		i = x / 1000;
		j = (x % 1000) / 100;
		k = (x % 100)/10;
		l=x%10;
		if (x == i * i * i*i + j*j * j * j + k*k * k * k+l*l*l*l) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

}
