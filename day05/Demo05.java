package day05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * ��ά���飺
 * ���һά�����еĸ���Ԫ����Ȼ��һά���飬��ô������һ����ά���飬��ά���鳣���ڱ�ʾ��
 * ���е���Ϣ���к��е���ʽ��ɣ���һ���±����Ԫ�����ڵ��У��ڶ���Ԫ�ش���Ԫ�ص���
 * @author 86180
 *
 */
public class Demo05 {
	public static void main(String [] args){
		/*
		 * ��ά�����������
		 * ����[][]
		 * ���ƣ�
		 * ��ά�������ŵ�һά����
		 * ����[][] ����={����1������2������3������4}
		 */
		//��ά�������������ʼ��
		int[][] arr1 = {{1,2,3,4},{5,6,7,8}};
		int[][] arr2 = new int [2][4];  //����һά���� һ��һά���������ĸ�Ԫ��
		//��ά����ĳ���һ��ָ�� .length
		int n = arr1.length;
			System.out.println("arr����ĳ�����"+ n);
		//��ά�����еڶ���Ԫ�صĳ���
		int n1 = arr1 [1].length;
			System.out.println("��ά�����еĵڶ���Ԫ�صĳ���"+ n1);
		//��ȡ��ά�����е�Ԫ��  ��ȡarr1�Ķ�ά�����еĵ�1��Ԫ�صĵ�3��Ԫ��
			System.out.println(arr1[0][2]);
			//����λ�����Ԫ�ظ�ֵ
			arr1[1][1] = 11;
			System.out.println(arr1[1][1]);
		/*
		 * �û��������������ֱ�����к��в��Կո����
		 * ÿһ��������ɵ���������������
		 */
		Scanner scanner = new Scanner(System.in);  //���û�����		
		Random random = new Random(); //���������
		System.out.println("���������������ֱ�����к��в��Կո����:");
		int a = scanner.nextInt();     //��ֵ�е�ֵ
		int b = scanner.nextInt();     //��ֵ�е�ֵ
		int[][] arr3 = new int[a][b]; //���������¶�ά����
		for (int i = 0;i < a;i ++){    //��ѭ������
			for (int j = 0; j < b;j ++){  //��ѭ������
				arr3[i][j] = random.nextInt(100); //�������������ֵ������
			}
		}
		for (int i =0 ;i < arr3.length;i ++){		//ѭ���������
			System.out.println(Arrays.toString(arr3[i])); //�������
				
		}

		
	}
}
