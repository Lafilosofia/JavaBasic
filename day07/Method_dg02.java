package day07;

import java.util.Scanner;

/**
 * 求出区间[a,b]中所有整数的质因数分解。
输入格式
　　输入两个整数a，b。
输出格式
　　每行输出一个数的分解，形如k=a1*a2*a3...(a1<=a2<=a3...，k也是从小到大的)(具体可看样例)

 * @author 86180
 *
 */
public class Method_dg02 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);			//用户输入
		System.out.println("请输入1个大于0的正整数：");
		int a = scanner.nextInt();							//输入的随机数赋给a
		System.out.println("请再输入1个大于"+a+"的正整数：");
		int b = scanner.nextInt();							//再次输入的随机数赋给b

		for(int i = a;i <= b;i ++){
			System.out.print(i+"=");           //为了不换行不写ln
			
				//判断i是质数还是合数
			boolean p = prime(i);             //判断所传进来的参数i是不是素数
			if(p == false){
				//质数
				System.out.println(i);
			}else{
				//合数
				//继续进行判断直到是质数为止
				
				abc(i);							//调用方法
			}
				
		}
		
	}
	public static void abc(int number){
		for(int i = 2;i < number;i ++){
			if(number % i == 0){
				System.out.print(i+"*");
				boolean b =prime(number / i);
				if(b == false){
					System.out.println(number / i);//质数
				}else{
					abc(number / i);//合数
				}
				break;
			}
		}
	}

	public static boolean prime(int number){
		boolean flag = false;
		for(int i = 2;i < number;i ++){
			if(number % i == 0){
				flag = true;
				return flag;
			}
		}
		return flag;
	}

}
