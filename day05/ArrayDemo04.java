package day05;

import java.util.Arrays;

/**
 * �˿��ƣ�
 * �˿���һ��54���ƣ�����54���˿��Ƹ��ݲ�ͬ��
 * ��ɫͨ������ķ�ʽ����һ�������в���ʾ������̨
 * Ҫ�󣺻�ɫΪһ�����飬�˿����е�����Ϊһ������
 * @author 86180
 *
 */
public class ArrayDemo04 {
	public static void main (String[] args){
		//��ɫ
		String [] colorArr={"����","����","÷��","����"};
		//�˿����������
		String [] numberArr={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		//���˿��Ƶ�����
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
		newArr[newArr.length-2]="С��";
		newArr[newArr.length-1]="����";
		System.out.println(Arrays.toString(newArr));
		//������
		String[] newArr02=new String[54];
		for(int i=0;i<newArr02.length-2;i++){
			newArr02[i]=colorArr[i%colorArr.length]+numberArr[i%numberArr.length];
		}
		newArr02[newArr02.length-2]="С��";
		newArr02[newArr02.length-1]="����";
		System.out.println(Arrays.toString(newArr02));
		}
}
