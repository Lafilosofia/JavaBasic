package day03;

import java.util.Random;

import java.util.Scanner;

public class Demo06 {
	public static void main(String[] args) {
		/*
		 * 求1+2+3...+10之和
		 */
/*		int sum=0;
		for(int i=1;i<=10;i++){
			sum+=i;
		}
		System.out.println("1+2+3...+10之和:"+sum);*/
		
		/*
		 * for的嵌套循环
		 */
		/*for(int i=0;i<5;i++){
			for(int j=1;j<6;j++){
				if((i+j)==4){
					break;//满足(i+j)==4后 break就直接跳出当前循环
				}
				System.out.println(i+"+"+j+"="+(i+j));
			}	
		}*/
		
		/*
		 * 课堂作业:
		 * 随机生成10加法题,让用户算,满分100分,如果算错一次
		 * 扣掉10分;
		 * 条件1:
		 * 1.随机生成100包含100范围内的整数相加
		 * 2.游戏结束后算出总分多少
		 * 例如:(1): 3+6="?".如果错则扣10分
		 */
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		int grade=100;
		for(int i=1;i<=10;i++){
			int a=random.nextInt(101);
			int b=random.nextInt(101);
			int answer=a+b;
			System.out.println("("+i+"):"+a+"+"+b+"=?");
			int input=scanner.nextInt();//用户输入的答案
			if(answer==input){
				System.out.println("恭喜你,答案正确!");			
			}else{
				System.out.println("回答错误,正确答案是:"+answer);
				grade-=10;
			}	
		}
			System.out.println("你的总分是:"+grade+"分");
			
		
		
	}
}
