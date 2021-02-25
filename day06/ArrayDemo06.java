package day06;

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
public class ArrayDemo06 {
	public static void main(String[] args){
		//第一步 第一行包含两个整数N和K
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入两个小于十万的正整数：");
		int[] arr = new int[2];
		for(int i = 0;i < arr.length;i ++){
			arr[i]= scanner.nextInt();
		}
		int n = arr[0];                                        //定义两个数存放i与k
		int k = arr[1];
		System.out.println(Arrays.toString(arr));
		//第二步 以下N行每行包含一个整数Ai
        int [] arr1 = new int[n];		
        for(int i = 0;i < arr1.length;i ++){
        	arr1[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(arr1));
        //第三步 求出总共有多少个k倍区间的数量
        int count = 0; 								//定义一个数用来存放所得结果
        for(int i = 0;i < n;i ++){                 //判断数组中的元素是k的倍数
        	if(arr1[i] % k == 0){
        		count ++;
        	}
        }
       System.out.println(count);
        
        for(int i = 0; i < n - 1;i ++){  		   //行
        	 int s = arr1[i];                                   
        	for(int j = 1;j < n - i;j ++){        //列
        		        s += arr1[i + j];
        		        if(s % k == 0){
        		        	count ++;
        		        }
        	}
        }
        System.out.println(count);
        
        
		
	}

}
