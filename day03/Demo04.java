package day03;

import java.util.Random;
import java.util.Scanner;

/**
 * 循环while(boolean){语句块}
 * 语法:boolean值若是true则继续循环,否则跳出循环
 * @author 86180
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		/*
		 * while(true){语句块}
		 * break:跳出当前循环
		 */
		/*while(true){//死循环
			System.out.println("呵呵");
			break;
		}*/
		
		/*int age=1;
		while(age<=10){
			System.out.println("年龄:"+age);
			age++;
		}*/
		
		/*
		 * 随机数
		 * 方式一:Random类提供了相应的随机产生随机数的不同方法
		 * 方式二:Math.random() 返回类型是double,如果要用此方法随机生成
		 * 整数,则需要强制类型转换(double转换为int)
		 */
		/*Random random=new Random();
		int n=random.nextInt(10);//在0-9中产生一个随机的int类型的数
		System.out.println(n);*/
		//double n=Math.random();//在0-1之间的一个随机的double类型的数
		/*int n=(int)(Math.random()*10);//在0-9之间产生一个随机的int类型的数
		System.out.println(n);*/
		
		/*
		 * 随机生成一个正整数,让用户猜数字,如果大了则提示"大了",
		 * 如果小了提示"小了",如果猜中了提示"恭喜猜对了",一共5次猜数字机会
		 */
		Scanner scanner=new Scanner(System.in);
		int n=(int)(Math.random()*21);//Math.random()*21相当于Math.random()*21+0,在0到(21-1)之间生成一个随机数
		System.out.println(n);//作弊
		int count=5;
		while(true){
			if(count==0){
				System.out.println("游戏结束,欢迎下次光临!");
				break;
			}
			System.out.println("你还有"+count+"次机会");
			System.out.println("请输入正整数");
			int input=scanner.nextInt();
			if(n<input){
				System.out.println("大了");
				count--;
			}else if(n>input){
				System.out.println("小了");
				count--;
			}else{
				System.out.println("恭喜你猜对了");
				break;
			}	
		}
		
	}
}
