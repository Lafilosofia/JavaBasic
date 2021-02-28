package day07;

import java.io.InputStream;
import java.util.Scanner;

/**
 * 用户输入两个整数k，n（0<k<n）
 * 当k=0或k=n时，返回整数1
 * 当0<k<n时 方法k，n-1
 * @author 86180
 *
 */
public class Method_dg01 {
 
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);	
	System.out.println("请输入一个整数：");
	int n = scanner.nextInt();
	System.out.println("请输入大于0小于"+n+"的正整数");
	int k = scanner.nextInt();
	int a = practice(k,n);                //关键：调用practice方法
	System.out.println(a);

	 	}
	public static int practice(int k,int n){
		if(k == 0 || k == n){
			return 1;
		}
		else{
			return practice(k,n - 1) + practice(k - 1,n - 1);    //递归了a次得到a
		}
		
	}

}
