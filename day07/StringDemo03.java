package day07;

import java.util.Scanner;

/**
 * �����������ɴ�д��ĸ��Сд��ĸ��ɵ��ַ���(���Ƚ���1��10֮��)��
 * ����֮��Ĺ�ϵ������4�����֮һ��
����1�������ַ������Ȳ��ȡ����� Beijing �� Hebei
����2�������ַ�������������ȣ�������Ӧλ���ϵ��ַ���ȫһ��(���ִ�Сд)��
���� Beijing �� Beijing
����3�������ַ���������ȣ���Ӧλ���ϵ��ַ����ڲ����ִ�Сд��ǰ���²��ܴﵽ��ȫһ��
��Ҳ����˵���������������2�������� beijing �� BEIjing
����4�������ַ���������ȣ����Ǽ�ʹ�ǲ����ִ�СдҲ����ʹ�������ַ���һ�¡�
���� Beijing �� Nanjing
��������ж�����������ַ���֮��Ĺ�ϵ�����������е���һ�࣬������������ı�š�

 * @author 86180
 *
 */
public class StringDemo03 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String str = scanner.next();
		System.out.println("������һ���ַ���");
		String str01 = scanner.next();
		if(str.length() != str01.length()){
			System.out.println(1);
			return;
		}
		if(str.length() == str01.length() && str.equals(str01)){
			System.out.println(2);
			return;
		}
		if(str.length() == str01.length() && str.equalsIgnoreCase(str01)){
			System.out.println(3);
			return;
		}
		if(str.length() == str01.length() && ! str.equalsIgnoreCase(str01)){
			System.out.println(4);
		}
	}
}
