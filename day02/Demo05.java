package day02;

import java.util.Scanner;

/**
 * Scannerʹ��
 * @author 86180
 *
 */
public class Demo05 {
 public static void main(String[] args){
	 Scanner scanner = new Scanner(System.in);
	 //�ڿ���̨�����ַ���
	 System.out.println("�������û�����");
	 //�ȴ��û�����
	 String str = scanner.nextLine();
	 System.out.println("��ո�������ǣ�"+str);
	 /*
	  * ��дһ��������̨�տ����
	  * ������Ʒ���ۣ����������Լ��տ���������Ӧ�ս�������
	  */
	 Scanner scanner1 = new Scanner(System.in);
	 System.out.println("��������Ʒ���ۣ�");
	 Double price = scanner1.nextDouble();
	 System.out.println("��������Ʒ������");
	 int sum = scanner1.nextInt();
	 //Ӧ����Ľ��
	 double money = sum*price;
	 //�������û�֧�����
	 System.out.println("�������û�֧���Ľ�");
	 double pay = scanner1.nextInt();
	 //Ӧ�ҽ��
	 double result = pay - money;
	 System.out.println("Ӧ�ҽ�"+ result);
	 
			 
 }
}
