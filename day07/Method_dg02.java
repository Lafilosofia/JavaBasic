package day07;

import java.util.Scanner;

/**
 * �������[a,b]�������������������ֽ⡣
�����ʽ
����������������a��b��
�����ʽ
����ÿ�����һ�����ķֽ⣬����k=a1*a2*a3...(a1<=a2<=a3...��kҲ�Ǵ�С�����)(����ɿ�����)

 * @author 86180
 *
 */
public class Method_dg02 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);			//�û�����
		System.out.println("������1������0����������");
		int a = scanner.nextInt();							//��������������a
		System.out.println("��������1������"+a+"����������");
		int b = scanner.nextInt();							//�ٴ���������������b

		for(int i = a;i <= b;i ++){
			System.out.print(i+"=");           //Ϊ�˲����в�дln
			
				//�ж�i���������Ǻ���
			boolean p = prime(i);             //�ж����������Ĳ���i�ǲ�������
			if(p == false){
				//����
				System.out.println(i);
			}else{
				//����
				//���������ж�ֱ��������Ϊֹ
				
				abc(i);							//���÷���
			}
				
		}
		
	}
	public static void abc(int number){
		for(int i = 2;i < number;i ++){
			if(number % i == 0){
				System.out.print(i+"*");
				boolean b =prime(number / i);
				if(b == false){
					System.out.println(number / i);//����
				}else{
					abc(number / i);//����
				}
				break;
			}
		}
	}

	public static boolean prime(int number){
		boolean flag = false;
		for(int i = 2;i < number;i ++){
			if(number % i == 0){
				flag = true;
				return flag;
			}
		}
		return flag;
	}

}
