package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo002 {
	public static void main(String	[] args){
		//��һ��
		Scanner scanner = new Scanner(System.in);
		System.out.println("������������������");
		int m = scanner.nextInt();
		int s = scanner.nextInt();
		int n = scanner.nextInt();
		//�ڶ���
		int[][] arr01 = new int [m][s];
		int[][] arr02 = new int [s][n];		
		for(int i = 0; i < m ;i ++){
			System.out.println("������"+s+"������");
			for(int j = 0; j < s; j ++){
				arr01[i][j] = scanner.nextInt();
				
			}
			System.out.println(Arrays.toString(arr01[i]));
		}
		for(int i =0; i < s;i ++){
			System.out.println("������"+n+"���������ÿո����");
			for(int j = 0 ;j < n ;j ++){
				arr02[i][j] = scanner.nextInt();
			}
			System.out.println(Arrays.toString(arr02[i]));
			
				
		}
		
		//��ҵ
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("������������������");		//���û�����������
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int arr1[][] = new int [a][b];
		int arr2[][] = new int [b][c];
		for(int i = 0;i < a;i ++){
			System.out.println("������"+"��������");
			for(int j = 0;j < b;j ++){
				arr1[i][j] = scanner.nextInt();
			}
			System.out.println(Arrays.toString(arr1[i]));
		}
		for(int i = 0;i < b;i ++){
			System.out.println("������"+c+"���������ÿո������");
			for(int j = 0;j < c;j ++){
				arr2[i][j] = scanner.nextInt();
			}
			System.out.println(Arrays.toString(arr2[i]));
		}
		
	}
	
}
			
		
			
		
