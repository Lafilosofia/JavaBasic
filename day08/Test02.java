package day08;

import java.util.Arrays;

/**
 * ���ɲ��ظ����ַ�
 * @author 86180
 *
 */
public class Test02 {
	public static void main(String[] args) {
		char [] arr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
				'O','P','Q','R','S','T','U','V','W','X','Y','Z'};	//�����µĲ��ظ�������
		boolean [] flag = new boolean[arr.length];					//����һ������ �ұ�֤���ص��±���arr���±�һ�¶�Ӧ
		char [] newArr = new char [20];
		for(int i =0;i < newArr.length;i ++){                      //ѭ��
			int index;												//�����±����
			do{                                                     //��do whileʵ����ִ�����ж�
				index = (int)(Math.random() * arr.length);			//����δ֪�±� 
			}
			while(flag[index] == true);								//������Ϊtrueʱ����ִ��do���
			flag[index] = true;										//Ϊfalse���ʾû���ù� �����丳ֵΪtrue
			newArr[i] = arr[index];                                 //����������һ�������鲢���
				
			
		}
		System.out.println(Arrays.toString(newArr));
		
		
	}

}
