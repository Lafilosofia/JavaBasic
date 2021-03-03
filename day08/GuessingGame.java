package day08;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 为猜字母游戏添加游戏等级。游戏等级设为三等：5、7和9，
 * 代表所需要猜测的字母个数。游戏开始时，由玩家选择游戏等级（5，7，9）。
 * 如果选择7，则会随机产生7个字符，然后玩家输入一个字符串包含7个字符，
 * 看这7个字符和随机产生的7个字符比较看是否正确，要求随机生成的不重复的字符
 * 作为让用户猜的字符，判断用户每次输入的字符和随机生成的字符，字符对了几个，
 * 字符的位置对了几个，总分为随机生成字符长度*100，猜错一次扣10分，
 * 直到最后猜对并输出总分。字符在A-Z之间。
 * 
 * 分析：
 * 1.设计游戏等级
 * 2.根据等级不同，随机生成不同的字符个数
 * 3.用户输入的字符和随机生成的字符比较，并算出猜对的字符个数和位置正确的个数
 * 4.根据等级不同输出猜对后每个等级的总分
 * @author 86180
 *
 */
public class GuessingGame {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("请输入游戏等级难度分别为1，2，3，否则退出");
			int grades = scanner.nextInt();
			switch (grades){
				case 1:
					//请输入5个字符
					int a = 5;
					diffcutly(a);
					 break;
					
					 
				case 2:
					//请输入7个字符
					int b=7;
					diffcutly(b);
					break;
				case 3:
					//请输入9个字符
					int c=9;
					diffcutly(c);
					break;
				default:
					//错误请退出
					System.out.println("输入错误！已退出！欢迎下次再来！");
					return;
				
		}
		
			
		}
		
	}
	
	private static void diffcutly(int a) {
		Scanner scanner = new Scanner(System.in);
		 char [] ch= getRandomChar(a);                  //调用方法随机生成不重复的字符
		 System.out.println("请输入"+a+"个字符：退出请输入exit");
		 int score = ch.length * 100;  						//定义分数
		 while(true){
			 System.out.println("请猜测");
			 String s = scanner.next().trim().toUpperCase();	//用户输入字符串并去掉两边空格并且大写
			 if("EXIT".equals(s)){
				 System.out.println("游戏结束，拜拜");
				 return;
			 }
			 			 
			 /*
			 * 由于java里没有提供接受用户传过来的字符数组方法，
			 * 所有接受用户输入数据用字符串，最后转化为字符数组
			 */
			 char[] input = s.toCharArray();
			 if(input.length!=ch.length){
				 System.out.println("请输入合法"+a+"个字符");
				 continue;
			 }
			 			 
			 //随机生成的字符和用户输入的数据作比较
			 //并且求出
			 int [] result =check(ch,input);
			 
			 if(result[1] == ch.length){
				 System.out.println("恭喜你猜对了，总分是："+score+"请继续猜测");
				 break;
			 }else{
				 score = score - 10;
				 
			 }
			 
		 }
		
	}

	public static int[] check(char[] ch,char [] input){
		int [] arr = new int[2];								//定义新数组用来存放猜对字符的个数和 字符位置对的个数
		for(int i = 0;i < ch.length;i ++){						//循环
			for(int j = 0;j < input.length;j ++){
				if(ch [i] == input [j]){						//条件：如果下标对应，则字符猜对了
					arr[0] ++;									//其猜对的字符个数加1
					if(i == j){									//条件：如果下标相等，则字符位置猜对了
						arr[1] ++;								//其猜对的字符位置个数加1
					}
					break;
				}
			}
		}
		System.out.println("字符猜对了"+arr[0]+"个，字符位置猜对了"+arr[1]+"个");
		return arr;
	}
	
				//随机生成不重复的字符	                      
	public static char[] getRandomChar(int x){		//方法的形参 应该对应返回值的类型
		
		char [] arr ={'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
				'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		boolean [] flag = new boolean[arr.length];
		char [] newArr = new char[x];
		for(int i = 0;i < newArr.length;i ++){
			int index;
			do{
				index = (int)(Math.random() * arr.length);
			}
			while(flag[index] == true);
			flag[index] = true;
			newArr[i] = arr[index];		
		}
		System.out.println(Arrays.toString(newArr));
		return newArr;
		
	}
	
}
