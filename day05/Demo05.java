package day05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 二维数组：
 * 如果一维数组中的各个元素仍然是一维数组，那么他就是一个二维数组，二维数组常用于表示表，
 * 表中的信息以行和列的形式组成，第一个下标代表元素所在的行，第二个元素代表元素的列
 * @author 86180
 *
 */
public class Demo05 {
	public static void main(String [] args){
		/*
		 * 二维数组的声明：
		 * 类型[][]
		 * 名称：
		 * 二维数组里存放的一维数组
		 * 类型[][] 名称={数组1，数组2，数组3，数组4}
		 */
		//二维数组的声明并初始化
		int[][] arr1 = {{1,2,3,4},{5,6,7,8}};
		int[][] arr2 = new int [2][4];  //两个一维数组 一个一维数组里有四个元素
		//二维数组的长度一般指行 .length
		int n = arr1.length;
			System.out.println("arr数组的长度是"+ n);
		//二维数组中第二个元素的长度
		int n1 = arr1 [1].length;
			System.out.println("二维数组中的第二个元素的长度"+ n1);
		//获取二维数组中的元素  获取arr1的二维数组中的第1个元素的第3个元素
			System.out.println(arr1[0][2]);
			//给二位数组的元素赋值
			arr1[1][1] = 11;
			System.out.println(arr1[1][1]);
		/*
		 * 用户输入两个整数分别代表行和列并以空格隔开
		 * 每一行随机生成的整数存入数组中
		 */
		Scanner scanner = new Scanner(System.in);  //让用户输入		
		Random random = new Random(); //生成随机数
		System.out.println("请输入两个整数分别代表行和列并以空格隔开:");
		int a = scanner.nextInt();     //赋值行的值
		int b = scanner.nextInt();     //赋值列的值
		int[][] arr3 = new int[a][b]; //定义声明新二维数组
		for (int i = 0;i < a;i ++){    //行循环输入
			for (int j = 0; j < b;j ++){  //列循环输入
				arr3[i][j] = random.nextInt(100); //随机生成整数赋值给数组
			}
		}
		for (int i =0 ;i < arr3.length;i ++){		//循环数组的行
			System.out.println(Arrays.toString(arr3[i])); //输出数组
				
		}

		
	}
}
