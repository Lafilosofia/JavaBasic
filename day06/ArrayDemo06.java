package day06;

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
public class ArrayDemo06 {
	public static void main(String[] args){
		//��һ�� ��һ�а�����������N��K
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������С��ʮ�����������");
		int[] arr = new int[2];
		for(int i = 0;i < arr.length;i ++){
			arr[i]= scanner.nextInt();
		}
		int n = arr[0];                                        //�������������i��k
		int k = arr[1];
		System.out.println(Arrays.toString(arr));
		//�ڶ��� ����N��ÿ�а���һ������Ai
        int [] arr1 = new int[n];		
        for(int i = 0;i < arr1.length;i ++){
        	arr1[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(arr1));
        //������ ����ܹ��ж��ٸ�k�����������
        int count = 0; 								//����һ��������������ý��
        for(int i = 0;i < n;i ++){                 //�ж������е�Ԫ����k�ı���
        	if(arr1[i] % k == 0){
        		count ++;
        	}
        }
       System.out.println(count);
        
        for(int i = 0; i < n - 1;i ++){  		   //��
        	 int s = arr1[i];                                   
        	for(int j = 1;j < n - i;j ++){        //��
        		        s += arr1[i + j];
        		        if(s % k == 0){
        		        	count ++;
        		        }
        	}
        }
        System.out.println(count);
        
        
		
	}

}
