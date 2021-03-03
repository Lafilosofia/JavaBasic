package day08;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Ϊ����ĸ��Ϸ�����Ϸ�ȼ�����Ϸ�ȼ���Ϊ���ȣ�5��7��9��
 * ��������Ҫ�²����ĸ��������Ϸ��ʼʱ�������ѡ����Ϸ�ȼ���5��7��9����
 * ���ѡ��7������������7���ַ���Ȼ���������һ���ַ�������7���ַ���
 * ����7���ַ������������7���ַ��ȽϿ��Ƿ���ȷ��Ҫ��������ɵĲ��ظ����ַ�
 * ��Ϊ���û��µ��ַ����ж��û�ÿ��������ַ���������ɵ��ַ����ַ����˼�����
 * �ַ���λ�ö��˼������ܷ�Ϊ��������ַ�����*100���´�һ�ο�10�֣�
 * ֱ�����¶Բ�����ܷ֡��ַ���A-Z֮�䡣
 * 
 * ������
 * 1.�����Ϸ�ȼ�
 * 2.���ݵȼ���ͬ��������ɲ�ͬ���ַ�����
 * 3.�û�������ַ���������ɵ��ַ��Ƚϣ�������¶Ե��ַ�������λ����ȷ�ĸ���
 * 4.���ݵȼ���ͬ����¶Ժ�ÿ���ȼ����ܷ�
 * @author 86180
 *
 */
public class GuessingGame {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("��������Ϸ�ȼ��Ѷȷֱ�Ϊ1��2��3�������˳�");
			int grades = scanner.nextInt();
			switch (grades){
				case 1:
					//������5���ַ�
					int a = 5;
					diffcutly(a);
					 break;
					
					 
				case 2:
					//������7���ַ�
					int b=7;
					diffcutly(b);
					break;
				case 3:
					//������9���ַ�
					int c=9;
					diffcutly(c);
					break;
				default:
					//�������˳�
					System.out.println("����������˳�����ӭ�´�������");
					return;
				
		}
		
			
		}
		
	}
	
	private static void diffcutly(int a) {
		Scanner scanner = new Scanner(System.in);
		 char [] ch= getRandomChar(a);                  //���÷���������ɲ��ظ����ַ�
		 System.out.println("������"+a+"���ַ����˳�������exit");
		 int score = ch.length * 100;  						//�������
		 while(true){
			 System.out.println("��²�");
			 String s = scanner.next().trim().toUpperCase();	//�û������ַ�����ȥ�����߿ո��Ҵ�д
			 if("EXIT".equals(s)){
				 System.out.println("��Ϸ�������ݰ�");
				 return;
			 }
			 			 
			 /*
			 * ����java��û���ṩ�����û����������ַ����鷽����
			 * ���н����û������������ַ��������ת��Ϊ�ַ�����
			 */
			 char[] input = s.toCharArray();
			 if(input.length!=ch.length){
				 System.out.println("������Ϸ�"+a+"���ַ�");
				 continue;
			 }
			 			 
			 //������ɵ��ַ����û�������������Ƚ�
			 //�������
			 int [] result =check(ch,input);
			 
			 if(result[1] == ch.length){
				 System.out.println("��ϲ��¶��ˣ��ܷ��ǣ�"+score+"������²�");
				 break;
			 }else{
				 score = score - 10;
				 
			 }
			 
		 }
		
	}

	public static int[] check(char[] ch,char [] input){
		int [] arr = new int[2];								//����������������Ų¶��ַ��ĸ����� �ַ�λ�öԵĸ���
		for(int i = 0;i < ch.length;i ++){						//ѭ��
			for(int j = 0;j < input.length;j ++){
				if(ch [i] == input [j]){						//����������±��Ӧ�����ַ��¶���
					arr[0] ++;									//��¶Ե��ַ�������1
					if(i == j){									//����������±���ȣ����ַ�λ�ò¶���
						arr[1] ++;								//��¶Ե��ַ�λ�ø�����1
					}
					break;
				}
			}
		}
		System.out.println("�ַ��¶���"+arr[0]+"�����ַ�λ�ò¶���"+arr[1]+"��");
		return arr;
	}
	
				//������ɲ��ظ����ַ�	                      
	public static char[] getRandomChar(int x){		//�������β� Ӧ�ö�Ӧ����ֵ������
		
		char [] arr ={'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
				'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		boolean [] flag = new boolean[arr.length];
		char [] newArr = new char[x];
		for(int i = 0;i < newArr.length;i ++){
			int index;
			do{
				index = (int)(Math.random() * arr.length);
			}
			while(flag[index] == true);
			flag[index] = true;
			newArr[i] = arr[index];		
		}
		System.out.println(Arrays.toString(newArr));
		return newArr;
		
	}
	
}
