package day07;

import java.util.Random;
import java.util.Scanner;

public class ZuoYe02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ӭ���Բ���ĸ��Ϸ��");
		while(true){										//��ѭ���ж�������Ƿ�Ϊ5��7��9 ��������� �񽫻�һֱѯ��
			System.out.println("��������Ϸ����5��7��9����");
			int input = scanner.nextInt();                 		
			if(input == 5 || input == 7 || input == 9){
				System.out.println("������"+input+"����ĸ");
				String input01 = scanner.next();      //�û�����һ���ַ���
				String str02= GuessingGame(input);
				 compare(input01,str02);
				//System.out.println(str02);       //����GussingGame�����������ĸ
				
				break;
			}else{
				System.out.println("�������");
				continue;
			}
		}
		
		
		
	}

	public static String GuessingGame(int a){
		char [] str = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		Random random = new Random();
		String str01 = "";
		for(int i = 0; i < a; i ++){       //ѭ�������е��ַ�
			int s = random.nextInt(26);    //������ɸ���s
			//System.out.println(str[s]);
			str01+=str[s];               //��s���ַ����ӣ������ַ����� 
			
		}
		//System.out.println(str01);
		return str01;
	}
	
	public static void compare(String p,String q){         //�½�һ������ �����Ƚ��û������������ɵ��ַ����м������
		
		int count = 0;
		double sum = 0;
		for(int i = 0;i < p.length();i ++){
			if(p.charAt(i) == q.charAt(i)){
				
				sum = sum + 100.0 / p.length();
				count ++;
				System.out.println("���е�"+i+"���ַ���λ����ȷ");
			}
			
		}System.out.println("��¶���"+count+"���ַ�");
		int all = 0;
		all++;
		System.out.println("��ķ�����"+sum);
		
	}
	
}
