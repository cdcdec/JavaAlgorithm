package com.cdc.algorithm_problem;
/**
 * 判断�?个数是否是素�?(质数)
 * @author cdc
 *
 */
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber prime = new PrimeNumber();
		int i = 0;
		for (i = 2; i <= 30; i++) {
			boolean bl = prime.isPrimeNumber1(i);
			if (bl) {
				System.out.format("%d是质�?", i);
				System.out.println("\r");
			}
		}

		// �?100以内的质�?

	}

	/**
	 * 判断�?个数是否是素�?1
	 * 
	 * @param x
	 * @return
	 */
	public boolean isPrimeNumber1(int x) {
		boolean flag = true;
		if (x < 2) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(x); i++) {
				//  若能被整除，则说明不是素数，返回false  
				if (x % i == 0) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	/**
	 * 判断�?个数是否是素�?2
	 * 
	 * @param x
	 * @return
	 */
	public boolean isPrimeNumber2(int x) {
		boolean flag = true;
		if (x < 2) {
			return false;
		} else {
			for (int i = 2; i <= x; i++) {
				for (int j = 2; j <= i; j++) {
					if (i % j == 0 && i != j) {
						flag = false;
						break;
					}
					if (i % j == 0 && i == j) {
						flag = true;
					}
				}
			}
		}
		return flag;
	}
}
