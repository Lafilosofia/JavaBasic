package day05;

import java.util.Arrays;
import java.util.Random;

/**
 *����ĸ���
 * @author 86180
 *
 */

public class ArrayDemo03{
	public static void main (String[] args){
/*���鸴��
 * Arrays.copyOf(c����1������2��
 * ����1��ԭ���飻
 * ����2��������ĳ��ȣ�
 * 
 * ȱ�㣺����Ч�ʵ�		
 */
		int[] arr={2,4,5,8};
		int[]newArr=Arrays.copyOf(arr,5);
	    System.out.println(Arrays.toString(newArr));
	    /*
	     * System.arraycopy(����1������2������3������4������5�� ����
	     * ����1��ԭ������
	     * ����2��ԭ�����±�(��ʼλ��)��
	     * ����3��Ŀ�����飻
	     * ����4��Ŀ�������±�(��ʼλ��)��
	     * ����5����ԭ���鸴�Ƶĸ���(����)��
	     */
	    int[] newArr02 = new int[6];
		System.arraycopy(arr,1,newArr02,1,2);
		System.out.println(Arrays.toString(newArr02));
		/*
		 * �������14������0-99֮�䲢��������ǵ���Сֵ��Ȼ��
		 * ������ĳ�������Ϊ11������һ���µ����鲢����Сֵ
		 * ����ԭ�����еĵ�һ��Ԫ��
		 */
		Random random = new Random();
		int[] arr03 = {};//������;
		for(int i = 0;i < 10;i ++){
			arr03 = Arrays.copyOf(arr03,arr03.length+1);
			arr03[i] = random.nextInt(100);
			}
		System.out.println(arr03.length);
		System.out.println(Arrays.toString(arr03));
		
		//�������е���Сֵ
		int min = arr03[0];
		for(int i =1 ;i<arr03.length;i ++){
			if(min > arr03[i]){
				
			}
		}
		
		//������ĳ�������Ϊ11������һ���µ����鲢����Сֵ
		//�����µ������еĵ�һ��Ԫ��
		int[] newArr03=new int[arr03.length+1];
		System.arraycopy(arr03,0,newArr03,1,arr03.length);
		newArr03[0]=min;
		System.out.println("newArr03�ĳ��ȣ�"+newArr03.length);
		System.out.println(Arrays.toString(newArr03));
		/*
		 * ������ϰ��
		 * ����һ���������10��Ԫ�ز��������������0-99
		 * ��Χ��ֵ�������е�ÿһ��Ԫ�أ�����Щ������ɵ�
		 * Ԫ�صĵ��������װ˸���ֵ�����ǵ��µ�һ�����鲢���
		 */
	     
	    	 Random random1 =new Random();
	    	 int[] ar ={10};
	    	 for(int a = 0;a < ar.length;a ++){
	    		 
	    	 }
	     
	
	}
}
