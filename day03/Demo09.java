package day03;

import java.util.Scanner;

/**
 * 编写三个数值的升序程序
 * @author 86180
 *
 */
public class Demo09 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入一个整数");
		int a=scanner.nextInt();
		System.out.println("请再次输入一个整数");
		int b=scanner.nextInt();
		System.out.println("最后输入一个整数");
		int c=scanner.nextInt();
		
		//数值交换法
		int m=0;
		if(a>b){//a和b比较
			m=a;
			a=b;
			b=m;
		}
		if(b>c){//b和c比较
			m=b;
			b=c;
			c=m;
		}
		if(a>c){//a和c比较
			m=a;
			a=c;
			c=m;
		}
		System.out.println("升序排列的结果为:"+a+","+b+","+c);
		
		
	}
}
