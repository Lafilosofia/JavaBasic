package day06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 3.	问题描述
　　输入两个矩阵，分别是m*s，s*n大小。输出两个矩阵相乘的结果。
输入格式
　　第一行，空格隔开的三个正整数m,s,n（均不超过200）。
　　接下来m行，每行s个被空格隔开的整数，表示矩阵A（i，j）。
　　接下来s行，每行n个被空格隔开的整数，表示矩阵B（i，j）。
输出格式
　　m行，每行n个空格隔开的整数，输出相乘後的矩阵C（i，j）的值。
样例输入
2 3 2
1 0 -1
1 1 -3
0 3
1 2
3 1
样例输出
-3 2
-8 2

 * @author 86180
 *
 */
public class Demo02 {
	public static void main(String[] args){
/*		String str = "1 2 3 4 5 ";
		String[] arrstr = str.split(" ");
		System.out.println(arrstr[2]);
		//字符串转化为int类型
		int b = Integer.parseInt(arrstr[4]);
		System.out.println(b);*/
		//第一步：第一行，空格隔开的三个正整数m,s,n
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入空格隔开的三个正整数：");
		String str = scanner.nextLine();
		String[] arrStr = str.split(" ");
		//将隔开的字符串转化为int类型
		int m = Integer.parseInt(arrStr[0]);
		int s = Integer.parseInt(arrStr[1]);
		int n = Integer.parseInt(arrStr[2]);
		//第二部：
		int[][] arr01 = new int[m][s];
		int[][] arr02 = new int[s][n];
	
		for(int i = 0; i < m ; i ++){
			System.out.println("请输入"+s+"个整数并用空格隔开");
			String att = scanner.nextLine();
			String[] arrStt = att.split(" ");
			//请把用户输入的字符串分解并放在arr二维数组中
			for(int j = 0;j < arrStt.length;j ++){
				arr01[i][j] = Integer.parseInt(arrStt[j]);
			
			}
			//打印每一行的数组
			System.out.println(Arrays.toString(arr01[i]));
		}
		    //第三步：s行
		for(int i = 0;i < s; i ++){
		System.out.println("请输入"+n+"个整数并用空格隔开");
		String btt = scanner.nextLine();
		String[] arrstt = btt.split(" ");
		for(int j = 0;j < arrstt.length ;j ++ ){
			arr02[i][j] = Integer.parseInt(arrstt[j]);
		}
		System.out.println(Arrays.toString(arr02[i]));	
		
		}
		//第四步
		for(int i = 0;i < m ; i ++){
			for(int j = 0;j < n;j ++){
				int sum = 0;
				for(int k = 0; k < s;k ++){
					sum +=arr01[i][k] * arr02[k][j];
					
				}
				System.out.print(sum+" ");
			}
			System.out.println();
		}
		
		
	}
	
}






