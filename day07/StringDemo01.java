package day07;

import java.util.Scanner;

/**
 * �ַ�����
 * дһ������������һ���ַ���str�����Ȳ�����20����
 * �����뵥����һ���ַ�ch��Ȼ��������ַ���str���г��ֵ����е�ch�ַ���ɾ����
 * �Ӷ��õ�һ���µ��ַ���str2��Ȼ�������ַ�����ӡ������
���������ʽ�����������У���һ����һ���ַ������ڲ�û�пո񣩣���
������һ���ַ���
�����ʽ�����������Ժ���ַ�����

��������
123-45-678
-
�������
12345678

 * @author 86180
 *
 */
public class StringDemo01 {
	public static void main(String[] args){
		//����1
/*		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ�����Ȳ�����20���ַ����ַ���");
		String str = scanner.next();
		System.out.println("������һ������Ϊ1���ַ�");
		String str01 = scanner.next();
		String s = "";
		for(int i = 0;i < str.length();i ++){
			if(str.charAt(i) != str01.charAt(0)){
				s += str.charAt(i);  �ַ���ƴ��  
			}
		}
		System.out.println(s);*/
		//����2
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ�����Ȳ�����20���ַ����ַ���");
		String str = scanner.next();
		System.out.println("������һ������Ϊ1���ַ�");
		String str01 = scanner.next();
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < str.length();i ++){
			if(str.charAt(i) != str01.charAt(0)){
				sb.append(str.charAt(i));
			}

		}
		System.out.println(sb);
		
	}

}
