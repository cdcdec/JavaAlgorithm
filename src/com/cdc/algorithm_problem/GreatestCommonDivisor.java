package com.cdc.algorithm_problem;
/**
 * �����Լ������С������
 * @author cdc
 *
 */
public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.format("%d��%d�����Լ����:%d", 282,286,getGreatestCommonDivisor(282, 286));
		System.out.println("\r");
		System.out.format("%d��%d����С��������:%d", 282,286,getLeastCommonMultiple(282,286,getGreatestCommonDivisor(282, 286)));
	}
	/**
	 * �����������������Լ��
	 * շת������� 
	 * ����ŷ������㷨��Euclidean algorithm����������������֮������ӵ��㷨.
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
	 * ����������������С������
	 * @param m
	 * @param n
	 * @param �������������Լ��
	 * @return
	 */
	public static int getLeastCommonMultiple(int m,int n,int c){
		int temp=m*n/c;
		return temp;
	}
	/**
	 * �������,�ֳ�"��ֵ�㷨"
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
