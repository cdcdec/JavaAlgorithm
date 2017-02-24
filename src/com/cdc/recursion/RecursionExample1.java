package com.cdc.recursion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * �ݹ�һ���ļ����µ������ļ�,����������ļ����µ��ļ�; �������D��(��Ŀ¼)�µ��ļ��ᱨ��???
 * 
 * @author cdc
 *
 */
public class RecursionExample1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RecursionExample1 recursionExample1 = new RecursionExample1(
				"d://recursionExample1.txt");
		recursionExample1.recursive("D:\\Android");

	}

	public RecursionExample1(String filePath) {
		try {
			PrintStream printStream = new PrintStream(new FileOutputStream(
					filePath));
			System.setOut(printStream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<File> recursive(String dirPath) throws IOException {
		List<File> lists = new ArrayList<File>();
		File file = new File(dirPath);
		if (file.exists()) {
			File[] files = file.listFiles();
			if (files.length == 0) {
				System.out.println("�ļ����ǿյ�!");
				return null;
			} else {
				for (File file2 : files) {
					if (file2.isDirectory()) {
						System.out.println("�ļ���:" + file2.getCanonicalPath());
						recursive(file2.getAbsolutePath());
					} else {
						System.out.println("�ļ�:" + file2.getCanonicalPath());
						lists.add(file2);
					}
				}
			}
		} else {
			System.out.println("�ļ�������!");

		}
		return lists;

	}

}
