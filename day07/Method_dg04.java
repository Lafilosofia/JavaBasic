package day07;

import java.util.Scanner;

/**
 * ��ҵ��
 * ����ˮ��
 * ����һ��Ǯ��һƿ��ˮ��
 * ��������ƿ�Ƕһ�һƿ��ˮ��
 * ������ƿ�Ӷһ�һƿ��ˮ
 * ���û�����Ǯ������������
 * ��һ�����Ժȶ���ƿ��ˮ
 * ���������磺
 * ֹͣ������ƿ�� < && 2 ��ƿ�� < 3
 * 11��Ǯ  ��11��ƿ�� ��11����ƿ��
 * int a = 11 \ 2 ƿ�Ƕһ�����ˮ  int a1 = 11 % 2 ƿ�Ƕһ���ˮ��ʣ���ƿ�� 
 * int b = 11 \ 3 ��ƿ�Ӷһ�����ˮ int b1 = 11 % 3 ��ƿ�Ӷһ���ˮ��ʣ��Ŀ�ƿ��
 * 
 * @author 86180
 *
 */
public class Method_dg04 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������0��������");
		int money = scanner.nextInt();
		//Ǯ�� money����1 ���жһ������
		if(money == 1){
			System.out.println("����Ժ�"+money+"ƿ��ˮ");
		}
		else{
			//һ���ȵ���ˮ=money+��ƿ�����һ�����ˮ
			int all = money + dg(money,money);
		System.out.println("��һ�����Ժ�"+all);	
			
		}
	}
	public static int dg(int a,int b){
		/*
		 * a��ƿ�� 
		 * b�ǿ�ƿ��
		 */
		//
		if(a < 2 && b <3){
			return 0;
		}
		//ƿ�Ƕһ�����ˮ
		//ƿ�Ƕһ���ˮ��ʣ���ƿ��
		//��ƿ�Ӷһ�����ˮ
		//��ƿ�Ӷһ���ˮ��ʣ��Ŀ�ƿ��
		
		int empty = a / 2;
		int empty1 = a % 2;
		int pool = b / 3;
		int pool1 = b % 3;
		return empty + pool + dg(empty + empty1 + pool,empty + pool + pool1);
	}

}
