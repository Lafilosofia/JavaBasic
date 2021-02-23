package day06;

import java.util.Scanner;

/**
 * 输入一个实数x，求最小的n使得，1/2+1/3+1/4+...+1/(n+1)>=x。
输入的实数x保证大于等于0.01，小于等于5.20，
并且恰好有两位小数。你的程序要能够处理多组数据，
即不停地读入x，如果x不等于0.00，则计算答案，否则退出程序。
输出格式为对于一个x，输出一行n card(s)。其中n表示要计算的答案。
输入格式
　　分行输入x的具体数值
输出格式
　　分行输出n的数值，格式为n card(s)
样例输入
1.00
3.71
0.04
5.19
0.00

样例输出
3 card(s)
61 card(s)
1 card(s)
273 card(s)

 * @author 86180
 *
 */
public class Demo03 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个实数保证大于等于0.01，小于等于5.20：");
		double x = scanner.nextDouble();
		double sum = 0.0;
		int n = 1;
		if(x==0.0){
			System.out.println("退出程序");
			return ;
		}
					
		//如果sum大于或者等于x那么为false
		while(sum < x){
			sum+=1.0/(n+1);
			n ++;
					}
		System.out.println((n-1) + "card(s)");
		
	}

}
