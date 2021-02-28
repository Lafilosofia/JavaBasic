package day07;

import java.util.Scanner;

/**
 * 作业：
 * 买汽水：
 * 加入一块钱买一瓶汽水，
 * 但是两个瓶盖兑换一瓶汽水，
 * 三个空瓶子兑换一瓶汽水
 * 让用户输入钱数（正整数）
 * 求一共可以喝多少瓶汽水
 * 分析：例如：
 * 停止条件：瓶盖 < && 2 空瓶子 < 3
 * 11块钱  有11个瓶盖 有11个空瓶子
 * int a = 11 \ 2 瓶盖兑换的汽水  int a1 = 11 % 2 瓶盖兑换汽水后剩余的瓶盖 
 * int b = 11 \ 3 空瓶子兑换的汽水 int b1 = 11 % 3 空瓶子兑换汽水后剩余的空瓶子
 * 
 * @author 86180
 *
 */
public class Method_dg04 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入大于0的正整数");
		int money = scanner.nextInt();
		//钱数 money大于1 才有兑换的情况
		if(money == 1){
			System.out.println("你可以喝"+money+"瓶汽水");
		}
		else{
			//一共喝的汽水=money+空瓶子所兑换的汽水
			int all = money + dg(money,money);
		System.out.println("你一共可以喝"+all);	
			
		}
	}
	public static int dg(int a,int b){
		/*
		 * a是瓶盖 
		 * b是空瓶子
		 */
		//
		if(a < 2 && b <3){
			return 0;
		}
		//瓶盖兑换的汽水
		//瓶盖兑换汽水后剩余的瓶盖
		//空瓶子兑换的汽水
		//空瓶子兑换汽水后剩余的空瓶子
		
		int empty = a / 2;
		int empty1 = a % 2;
		int pool = b / 3;
		int pool1 = b % 3;
		return empty + pool + dg(empty + empty1 + pool,empty + pool + pool1);
	}

}
