package day08;

import java.util.Arrays;

/**
 * ��װһ������generateArray���÷���ʵ������ָ�����ȵ�int���飬
 * �������Ԫ��Ϊ0��ָ����Χ�ڵ�����������������鷵��
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
