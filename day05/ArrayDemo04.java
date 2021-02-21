package day05;

import java.util.Arrays;

/**
 * 扑克牌：
 * 扑克牌一共54张牌，把这54张扑克牌根据不同的
 * 花色通过数组的方式放入一个数组中并显示给控制台
 * 要求：花色为一个数组，扑克牌中的数字为一个数组
 * @author 86180
 *
 */
public class ArrayDemo04 {
	public static void main (String[] args){
		//花色
		String [] colorArr={"红桃","黑桃","梅花","方块"};
		//扑克牌里的数字
		String [] numberArr={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		//放扑克牌的数组
		String[]newArr={};
		int index=0;
		for(int i = 0;i<colorArr.length;i++){
			for(int j = 0; j<numberArr.length;j++){
				newArr=Arrays.copyOf(newArr,newArr.length+1);
				newArr[index++] = colorArr[i]+numberArr[j];
				
			}
		}
		System.out.println(newArr.length);
		newArr=Arrays.copyOf(newArr, newArr.length+2);
		newArr[newArr.length-2]="小王";
		newArr[newArr.length-1]="大王";
		System.out.println(Arrays.toString(newArr));
		//方法二
		String[] newArr02=new String[54];
		for(int i=0;i<newArr02.length-2;i++){
			newArr02[i]=colorArr[i%colorArr.length]+numberArr[i%numberArr.length];
		}
		newArr02[newArr02.length-2]="小王";
		newArr02[newArr02.length-1]="大王";
		System.out.println(Arrays.toString(newArr02));
		}
}
