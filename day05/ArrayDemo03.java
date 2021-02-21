package day05;

import java.util.Arrays;
import java.util.Random;

/**
 *数组的复制
 * @author 86180
 *
 */

public class ArrayDemo03{
	public static void main (String[] args){
/*数组复制
 * Arrays.copyOf(c参数1，参数2）
 * 参数1：原数组；
 * 参数2：新数组的长度；
 * 
 * 缺点：不灵活，效率低		
 */
		int[] arr={2,4,5,8};
		int[]newArr=Arrays.copyOf(arr,5);
	    System.out.println(Arrays.toString(newArr));
	    /*
	     * System.arraycopy(参数1，参数2，参数3，参数4，参数5） 函数
	     * 参数1：原数组名
	     * 参数2：原数组下标(起始位置)；
	     * 参数3：目标数组；
	     * 参数4：目标数组下标(起始位置)；
	     * 参数5：从原数组复制的个数(长度)；
	     */
	    int[] newArr02 = new int[6];
		System.arraycopy(arr,1,newArr02,1,2);
		System.out.println(Arrays.toString(newArr02));
		/*
		 * 随机生成14个整数0-99之间并且求出他们的最小值，然后，
		 * 将数组的长度扩容为11，生成一个新的数组并把最小值
		 * 放在原数组中的第一个元素
		 */
		Random random = new Random();
		int[] arr03 = {};//空数组;
		for(int i = 0;i < 10;i ++){
			arr03 = Arrays.copyOf(arr03,arr03.length+1);
			arr03[i] = random.nextInt(100);
			}
		System.out.println(arr03.length);
		System.out.println(Arrays.toString(arr03));
		
		//求数组中的最小值
		int min = arr03[0];
		for(int i =1 ;i<arr03.length;i ++){
			if(min > arr03[i]){
				
			}
		}
		
		//将数组的长度扩容为11，生成一个新的数组并把最小值
		//放在新的数组中的第一个元素
		int[] newArr03=new int[arr03.length+1];
		System.arraycopy(arr03,0,newArr03,1,arr03.length);
		newArr03[0]=min;
		System.out.println("newArr03的长度："+newArr03.length);
		System.out.println(Arrays.toString(newArr03));
		/*
		 * 课堂练习：
		 * 定义一个数组包含10个元素并且随机产生整数0-99
		 * 范围赋值给数组中的每一个元素，把这些随机生成的
		 * 元素的第三个到底八个赋值给我们的新的一个数组并输出
		 */
	     
	    	 Random random1 =new Random();
	    	 int[] ar ={10};
	    	 for(int a = 0;a < ar.length;a ++){
	    		 
	    	 }
	     
	
	}
}
