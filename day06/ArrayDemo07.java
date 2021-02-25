package day06;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 给定一个长度为N的数列，A1, A2, ... AN，
 * 如果其中一段连续的子序列Ai, Ai+1, ... Aj(i <= j)之和是K的倍数，
 * 我们就称这个区间[i, j]是K倍区间。
　　你能求出数列中总共有多少个K倍区间吗？
输入格式
　　第一行包含两个整数N和K。(1 <= N, K <= 100000)
　　以下N行每行包含一个整数Ai。(1 <= Ai <= 100000)
输出格式
　　输出一个整数，代表K倍区间的数目。

 * @author 86180
 *
 */
public class ArrayDemo07 {
	public static void main(String[] args){
		//方法一
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入大于1小于200的整数");
		int n = scanner.nextInt();
		int [] arr = new int[n];
		for(int i = 0;i < arr.length;i ++){
			arr[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		//对数组升序排列
		Arrays.sort(arr);
		System.out.println("排序后的数组"+Arrays.toString(arr));
		//方法二 冒泡排序
		/*方法二(冒泡排序):
		 *
		 * 23 21 3 109 17
		 * 
		 * 第一轮:21 3 23 17 109 i=0  length-1-i//列      0<length-1//行
		 * 第二轮:3 21 17 23     i=1  length-1-i//列      1<length-1//行
		 * 第三轮:3 17 21        i=2  length-1-i//列      2<length-1//行
		 * 第四轮:3 17           i=3  length-1-i//列      3<length-1//行
		 * 
		 *数值交换法
		 *int a=arr[0]
		 *arr[0]=arr[1] 21 21 3 109 15
		 *arr[1]=a      21 23 3 109 15
		 */
		 for(int i = 0;i < arr.length;i ++);{
		 int i = 0;
		for(int j = 0;j < arr.length - 1 - i ;j ++){
			 if(arr[j] > arr[j + 1]){
				 int temp = arr[j];
				 arr[j] = arr[j + 1];
				 arr[j + 1] = temp;
			 }
		 }
		 }
		 System.out.println("排列后的数组"+Arrays.toString(arr));
	}

}
