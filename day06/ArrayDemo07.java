package day06;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ����һ������ΪN�����У�A1, A2, ... AN��
 * �������һ��������������Ai, Ai+1, ... Aj(i <= j)֮����K�ı�����
 * ���Ǿͳ��������[i, j]��K�����䡣
������������������ܹ��ж��ٸ�K��������
�����ʽ
������һ�а�����������N��K��(1 <= N, K <= 100000)
��������N��ÿ�а���һ������Ai��(1 <= Ai <= 100000)
�����ʽ
�������һ������������K���������Ŀ��

 * @author 86180
 *
 */
public class ArrayDemo07 {
	public static void main(String[] args){
		//����һ
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������1С��200������");
		int n = scanner.nextInt();
		int [] arr = new int[n];
		for(int i = 0;i < arr.length;i ++){
			arr[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		//��������������
		Arrays.sort(arr);
		System.out.println("����������"+Arrays.toString(arr));
		//������ ð������
		/*������(ð������):
		 *
		 * 23 21 3 109 17
		 * 
		 * ��һ��:21 3 23 17 109 i=0  length-1-i//��      0<length-1//��
		 * �ڶ���:3 21 17 23     i=1  length-1-i//��      1<length-1//��
		 * ������:3 17 21        i=2  length-1-i//��      2<length-1//��
		 * ������:3 17           i=3  length-1-i//��      3<length-1//��
		 * 
		 *��ֵ������
		 *int a=arr[0]
		 *arr[0]=arr[1] 21 21 3 109 15
		 *arr[1]=a      21 23 3 109 15
		 */
		 for(int i = 0;i < arr.length;i ++);{
		 int i = 0;
		for(int j = 0;j < arr.length - 1 - i ;j ++){
			 if(arr[j] > arr[j + 1]){
				 int temp = arr[j];
				 arr[j] = arr[j + 1];
				 arr[j + 1] = temp;
			 }
		 }
		 }
		 System.out.println("���к������"+Arrays.toString(arr));
	}

}
