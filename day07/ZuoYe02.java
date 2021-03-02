package day07;

import java.util.Random;
import java.util.Scanner;

public class ZuoYe02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("欢迎尝试猜字母游戏！");
		while(true){										//死循环判断输入的是否为5，7，9 是则会跳出 否将会一直询问
			System.out.println("请输入游戏级别（5、7、9）？");
			int input = scanner.nextInt();                 		
			if(input == 5 || input == 7 || input == 9){
				System.out.println("请输入"+input+"个字母");
				String input01 = scanner.next();      //用户输入一个字符串
				String str02= GuessingGame(input);
				 compare(input01,str02);
				//System.out.println(str02);       //调用GussingGame的随机生成字母
				
				break;
			}else{
				System.out.println("输入错误！");
				continue;
			}
		}
		
		
		
	}

	public static String GuessingGame(int a){
		char [] str = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		Random random = new Random();
		String str01 = "";
		for(int i = 0; i < a; i ++){       //循环数组中的字符
			int s = random.nextInt(26);    //随机生成赋给s
			//System.out.println(str[s]);
			str01+=str[s];               //将s与字符连接（连接字符串） 
			
		}
		//System.out.println(str01);
		return str01;
	}
	
	public static void compare(String p,String q){         //新建一个方法 用来比较用户输入和随机生成的字符串有几个相等
		
		int count = 0;
		double sum = 0;
		for(int i = 0;i < p.length();i ++){
			if(p.charAt(i) == q.charAt(i)){
				
				sum = sum + 100.0 / p.length();
				count ++;
				System.out.println("其中第"+i+"个字符的位置正确");
			}
			
		}System.out.println("你猜对了"+count+"个字符");
		int all = 0;
		all++;
		System.out.println("你的分数是"+sum);
		
	}
	
}
