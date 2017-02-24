package com.cdc.recursion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 递归一个文件夹下的所有文件,包括这个子文件夹下的文件; 如果遍历D盘(根目录)下的文件会报错???
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
				System.out.println("文件夹是空的!");
				return null;
			} else {
				for (File file2 : files) {
					if (file2.isDirectory()) {
						System.out.println("文件夹:" + file2.getCanonicalPath());
						recursive(file2.getAbsolutePath());
					} else {
						System.out.println("文件:" + file2.getCanonicalPath());
						lists.add(file2);
					}
				}
			}
		} else {
			System.out.println("文件不存在!");

		}
		return lists;

	}

}
