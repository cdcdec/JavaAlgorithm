package com.cdc.algorithm_problem;
/**
 * �ݹ����
 * 
 * �����ڳ��������º󣬾��з�ֳ������
 * һ������ÿ����������һ��С��������
 * ����������Ӷ���������ôһ���Ժ���Է�ֳ���ٶ����ӣ�
 * 
 * ��һ����С����û�з�ֳ���������Ի���һ��
 * �����º�����һ��С�ö�����������
 * �������Ժ�������������һ�ԣ���ΪС���ӻ�û�з�ֳ����������һ�������ԡ�
 * 쳲��������У�Fibonacci sequence�����ֳƻƽ�ָ�����,
 * ����ѧ���а��ɶࡤ쳲�������Leonardoda Fibonacci�������ӷ�ֳΪ���Ӷ����룬���ֳ�Ϊ���������С���
 * ָ��������һ�����У�1��1��2��3��5��8��13��21��34������
 * ����ѧ�ϣ�
 * 쳲��������������±��Եݹ�ķ������壺F(0)=1��F(1)=1, F(n)=F(n-1)+F(n-2)��n>=2��n��N*��
 * @author cdc
 *
 */
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci  fibonacci=new Fibonacci();
		int i=0;
		for (i = 1; i <=20; i++) {
			System.out.format("��%d�������ӵ�������:%d", i,fibonacci.f(i));
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
