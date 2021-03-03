package day08;

import java.util.Arrays;

/**
 * 生成不重复的字符
 * @author 86180
 *
 */
public class Test02 {
	public static void main(String[] args) {
		char [] arr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
				'O','P','Q','R','S','T','U','V','W','X','Y','Z'};	//生成新的不重复的数组
		boolean [] flag = new boolean[arr.length];					//定义一个开关 且保证开关的下标与arr的下标一致对应
		char [] newArr = new char [20];
		for(int i =0;i < newArr.length;i ++){                      //循环
			int index;												//声明下标变量
			do{                                                     //用do while实现先执行再判断
				index = (int)(Math.random() * arr.length);			//查找未知下标 
			}
			while(flag[index] == true);								//当开关为true时返回执行do语句
			flag[index] = true;										//为false则表示没有用过 并将其赋值为true
			newArr[i] = arr[index];                                 //并把它放在一个新数组并输出
				
			
		}
		System.out.println(Arrays.toString(newArr));
		
		
	}

}
