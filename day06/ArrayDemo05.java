package day06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 小张是软件项目经理，他带领3个开发组。工期紧，今天都在加班呢。
 * 为鼓舞士气，小张打算给每个组发一袋核桃（据传言能补脑）。
 * 他的要求是：
(1) 各组的核桃数量必须相同
(2) 各组内必须能平分核桃（当然是不能打碎的）
(3) 尽量提供满足1,2条件的最小数量（节约闹革命嘛）

 * @author 86180
 *
 */
public class ArrayDemo05 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入三个正整数并用空格隔开：");
		int arr[] = new int[3];
		for(int i = 0;i < arr.length;i ++){
			arr[i] = scanner.nextInt();
		}
		int a = arr[0];
		int b = arr[1];
		int c = arr[2];
		System.out.println(Arrays.toString(arr));
		//对数组进行升序排列，求出最大值（是否是这个数组的最小公倍数）
		Arrays.sort(arr);
		//数组中的最大值
		int max = arr[arr.length-1];
		for(int i = max;i <= a*b*c;i ++){
			if(i%a == 0 && i%b == 0 && i%c == 0){
				max = i;
				break;
			}
		}
		System.out.println(max);
		
	}

}
