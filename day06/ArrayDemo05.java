package day06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * С���������Ŀ����������3�������顣���ڽ������춼�ڼӰ��ء�
 * Ϊ����ʿ����С�Ŵ����ÿ���鷢һ�����ң��ݴ����ܲ��ԣ���
 * ����Ҫ���ǣ�
(1) ����ĺ�������������ͬ
(2) �����ڱ�����ƽ�ֺ��ң���Ȼ�ǲ��ܴ���ģ�
(3) �����ṩ����1,2��������С��������Լ�ָ����

 * @author 86180
 *
 */
public class ArrayDemo05 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������������������ÿո������");
		int arr[] = new int[3];
		for(int i = 0;i < arr.length;i ++){
			arr[i] = scanner.nextInt();
		}
		int a = arr[0];
		int b = arr[1];
		int c = arr[2];
		System.out.println(Arrays.toString(arr));
		//����������������У�������ֵ���Ƿ�������������С��������
		Arrays.sort(arr);
		//�����е����ֵ
		int max = arr[arr.length-1];
		for(int i = max;i <= a*b*c;i ++){
			if(i%a == 0 && i%b == 0 && i%c == 0){
				max = i;
				break;
			}
		}
		System.out.println(max);
		
	}

}
