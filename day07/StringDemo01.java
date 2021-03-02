package day07;

import java.util.Scanner;

/**
 * 字符串：
 * 写一个程序，先输入一个字符串str（长度不超过20），
 * 再输入单独的一个字符ch，然后程序会把字符串str当中出现的所有的ch字符都删掉，
 * 从而得到一个新的字符串str2，然后把这个字符串打印出来。
　　输入格式：输入有两行，第一行是一个字符串（内部没有空格），第
二行是一个字符。
输出格式：经过处理以后的字符串。

样例输入
123-45-678
-
样例输出
12345678

 * @author 86180
 *
 */
public class StringDemo01 {
	public static void main(String[] args){
		//方法1
/*		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个长度不超过20的字符的字符串");
		String str = scanner.next();
		System.out.println("请输入一个长度为1的字符");
		String str01 = scanner.next();
		String s = "";
		for(int i = 0;i < str.length();i ++){
			if(str.charAt(i) != str01.charAt(0)){
				s += str.charAt(i);  字符串拼接  
			}
		}
		System.out.println(s);*/
		//方法2
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个长度不超过20的字符的字符串");
		String str = scanner.next();
		System.out.println("请输入一个长度为1的字符");
		String str01 = scanner.next();
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < str.length();i ++){
			if(str.charAt(i) != str01.charAt(0)){
				sb.append(str.charAt(i));
			}

		}
		System.out.println(sb);
		
	}

}
