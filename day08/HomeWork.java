package day08;

import java.util.Arrays;

/**
 * 封装一个方法generateArray，该方法实现生成指定长度的int数组，
 * 该数组的元素为0到指定范围内的随机数，并将该数组返回
 * @author 86180
 *
 */
public class HomeWork {
	public static int[] generateArray(int length,int max){
		int [] arr = new int[length];
		for(int i =0;i < arr.length;i ++){
			arr[i] = (int)(Math.random() * max);
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int [] arry = generateArray(10,20);
		System.out.println(Arrays.toString(arry));
	}
}
