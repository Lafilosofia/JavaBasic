package day06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 给定一个序列，每次询问序列中第l个数到第r个数中第K大的数是哪个。
输入格式
第一行包含一个数n，表示序列长度。
第二行包含n个正整数，表示给定的序列。
第三个包含一个正整数m，表示询问个数。
接下来m行，每行三个数l,r,K，
表示询问序列从左往右第l个数到第r个数中，
从大往小第K大的数是哪个。序列元素从1开始标号。

 * @author 86180
 *
 */
public class ArrayDemo04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//第一步 第一行包含一个数n，表示序列长度
		System.out.println("请输入一个小于等于1000的正整数：");
		int n = scanner.nextInt();
		//第二步 第二行包含n个正整数，表示给定的序列
		System.out.println("请输入"+n+"个整数并用空格隔开");
		int arr[] = new int[n];
		for(int i = 0;i < arr.length; i ++){
			arr[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		//第三步 第三个包含一个正整数m，表示询问个数
		System.out.println("请输入1个小于1000的整数");
		int m = scanner.nextInt();
		//第四步 每行三个数l,r,k需要建立二维数组
		int [][]arr1 =new int[m][3];
		for(int i = 0;i < arr1.length; i ++){ 
			System.out.println("请输入三个正整数并用空格隔开");//行
			for(int j = 0;j < 3;j ++){
				arr1[i][j] = scanner.nextInt();
			}
			System.out.println(Arrays.toString(arr1[i]));  //输出每一行数组中的元素
		}
		//第五步 接下来m行，每行三个数l,r,K ,从左往右第l个数到第r个数
		int max = 0;  	//从大到小第k个数
		for (int i = 0;i < m; i ++){
			//提取l，m，r三个数
			int l = arr1[i][0];
			int r = arr1[i][1];
			int k = arr1[i][2];
			//声明一个空数组
			int newArr[] = {};
			for(int j = l-1;j < r;j ++){//根据l，r提取数组后并且放在新的数组中
			//对你的数组进行扩容
			newArr = Arrays.copyOf(newArr,newArr.length + 1);
			newArr[newArr.length-1]= arr[i];
							
			}
		//第六步，从大到小第K大的数（前提是对新的数组先排序）
			Arrays.sort(newArr);
			max = newArr[newArr.length - k];
			System.out.println(max);
			}
			
		}

	}


