package com.cdc.algorithm_problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MultipleAAddition {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int s=0;
		String output="";
		BufferedReader stadin=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入a的�??:");
		String input=stadin.readLine();
		for (int j = 1; j <=Integer.parseInt(input); j++) {
			output+=input;
			int a=Integer.parseInt(output);
			s+=a;
		}
		System.out.println(s);
	}

}
