package day02;

import java.util.Scanner;

/**
 * Scanner使用
 * @author 86180
 *
 */
public class Demo05 {
 public static void main(String[] args){
	 Scanner scanner = new Scanner(System.in);
	 //在控制台输入字符串
	 System.out.println("请输入用户名：");
	 //等待用户输入
	 String str = scanner.nextLine();
	 System.out.println("你刚刚输入的是："+str);
	 /*
	  * 编写一个收银柜台收款程序
	  * 根据商品单价，购买数量以及收款金额计算输出应收金额和找零
	  */
	 Scanner scanner1 = new Scanner(System.in);
	 System.out.println("请输入商品单价：");
	 Double price = scanner1.nextDouble();
	 System.out.println("请输入商品的数量");
	 int sum = scanner1.nextInt();
	 //应收入的金额
	 double money = sum*price;
	 //请输入用户支付金额
	 System.out.println("请输入用户支付的金额：");
	 double pay = scanner1.nextInt();
	 //应找金额
	 double result = pay - money;
	 System.out.println("应找金额："+ result);
	 
			 
 }
}
