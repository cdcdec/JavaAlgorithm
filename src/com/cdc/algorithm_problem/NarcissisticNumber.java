package com.cdc.algorithm_problem;
/**
 * ˮ�ɻ�����ָһ�� nλ������ (n��3),����ÿ��λ�ϵ����ֵ� n����֮�͵���������.
 * (���磺1^3 + 5^3+ 3^3 = 153)
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
				System.out.format("%d��ˮ�ɻ���", i);
				System.out.println("\n");
			}
		}
	}
	/**
	 * ����λ����ˮ�ɻ���
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
	 * ����λ����ˮ�ɻ���
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
