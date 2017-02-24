package com.cdc.algorithm_problem;
/**
 * 质因数分�?
 * 每个合数(除了0,1和质数外的数)都可以写成几个质数相乘的形式�?
 * 其中每个质数都是这个合数的因数，叫做这个合数的分解质因数�? 
 * 分解质因数只针对合数�?
 * @author cdc
 *
 */
public class PrimeFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorization(286));
	}
	/**
	 * 分解质因�?
	 * 对n进行分解质因数，应先找到�?个最小的质数k，然后按下述步骤完成:
	 * (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。�?
	 * (2)如果n>=k，但n能被k整除，则应打印出k的�?�，并用n除以k的商,作为新的正整数你n,重复执行第一步�?��?
	 * (3)如果n不能被k整除，则用k+1作为k的�??,重复执行第一�?.
	 * @param n
	 * @return
	 */
	public static String factorization(int n){
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append(n+"=");
		if(n<2){
			System.out.println("必须输入不小�?2的正整数�?");
		}else{
			int minPrime=2;
			while(minPrime<=n){
				if(minPrime==n){
					stringBuilder.append(n);
					break;
				}else if(n%minPrime==0){
					stringBuilder.append(minPrime+" * ");
					//把剩下的结果赋给x 
					n=n/minPrime;
				}else{
					minPrime++;
				}
			}
		}
		return stringBuilder.toString();
	}

}
