package day06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ����һ�����У�ÿ��ѯ�������е�l��������r�����е�K��������ĸ���
�����ʽ
��һ�а���һ����n����ʾ���г��ȡ�
�ڶ��а���n������������ʾ���������С�
����������һ��������m����ʾѯ�ʸ�����
������m�У�ÿ��������l,r,K��
��ʾѯ�����д������ҵ�l��������r�����У�
�Ӵ���С��K��������ĸ�������Ԫ�ش�1��ʼ��š�

 * @author 86180
 *
 */
public class ArrayDemo04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//��һ�� ��һ�а���һ����n����ʾ���г���
		System.out.println("������һ��С�ڵ���1000����������");
		int n = scanner.nextInt();
		//�ڶ��� �ڶ��а���n������������ʾ����������
		System.out.println("������"+n+"���������ÿո����");
		int arr[] = new int[n];
		for(int i = 0;i < arr.length; i ++){
			arr[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		//������ ����������һ��������m����ʾѯ�ʸ���
		System.out.println("������1��С��1000������");
		int m = scanner.nextInt();
		//���Ĳ� ÿ��������l,r,k��Ҫ������ά����
		int [][]arr1 =new int[m][3];
		for(int i = 0;i < arr1.length; i ++){ 
			System.out.println("�������������������ÿո����");//��
			for(int j = 0;j < 3;j ++){
				arr1[i][j] = scanner.nextInt();
			}
			System.out.println(Arrays.toString(arr1[i]));  //���ÿһ�������е�Ԫ��
		}
		//���岽 ������m�У�ÿ��������l,r,K ,�������ҵ�l��������r����
		int max = 0;  	//�Ӵ�С��k����
		for (int i = 0;i < m; i ++){
			//��ȡl��m��r������
			int l = arr1[i][0];
			int r = arr1[i][1];
			int k = arr1[i][2];
			//����һ��������
			int newArr[] = {};
			for(int j = l-1;j < r;j ++){//����l��r��ȡ������ҷ����µ�������
			//����������������
			newArr = Arrays.copyOf(newArr,newArr.length + 1);
			newArr[newArr.length-1]= arr[i];
							
			}
		//���������Ӵ�С��K�������ǰ���Ƕ��µ�����������
			Arrays.sort(newArr);
			max = newArr[newArr.length - k];
			System.out.println(max);
			}
			
		}

	}


