package day08;

import java.util.Arrays;

/**
	 * 生成指定的字符
	 * @author 86180
	 *
	 */
public class Test01 {
	public static void main(String[] args) {
		char [] arr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
				'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char [] newArr = new char[5];
		for(int i = 0; i < newArr.length;i ++){
			int index = (int)(Math.random() * arr.length);
			newArr[i] = arr[index];	
		}
		System.out.println(Arrays.toString(newArr));
	}
}
