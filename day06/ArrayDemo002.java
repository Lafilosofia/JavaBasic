package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo002 {
	public static void main(String	[] args){
		//第一步
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入三个正整数：");
		int m = scanner.nextInt();
		int s = scanner.nextInt();
		int n = scanner.nextInt();
		//第二步
		int[][] arr01 = new int [m][s];
		int[][] arr02 = new int [s][n];		
		for(int i = 0; i < m ;i ++){
			System.out.println("请输入"+s+"个整数");
			for(int j = 0; j < s; j ++){
				arr01[i][j] = scanner.nextInt();
				
			}
			System.out.println(Arrays.toString(arr01[i]));
		}
		for(int i =0; i < s;i ++){
			System.out.println("请输入"+n+"行整数并用空格隔开");
			for(int j = 0 ;j < n ;j ++){
				arr02[i][j] = scanner.nextInt();
			}
			System.out.println(Arrays.toString(arr02[i]));
			
				
		}
		
		//作业
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("请输入三个正整数：");		//让用户输入三个数
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int arr1[][] = new int [a][b];
		int arr2[][] = new int [b][c];
		for(int i = 0;i < a;i ++){
			System.out.println("请输入"+"个整数：");
			for(int j = 0;j < b;j ++){
				arr1[i][j] = scanner.nextInt();
			}
			System.out.println(Arrays.toString(arr1[i]));
		}
		for(int i = 0;i < b;i ++){
			System.out.println("请输入"+c+"个整数并用空格隔开：");
			for(int j = 0;j < c;j ++){
				arr2[i][j] = scanner.nextInt();
			}
			System.out.println(Arrays.toString(arr2[i]));
		}
		
	}
	
}
			
		
			
		
