package day06;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * һ������n�Ľ׳˿���д��n!������ʾ��1��n��n�������ĳ˻���
 * �׳˵������ٶȷǳ��죬���磬13�����Ѿ��Ƚϴ��ˣ�
 * �Ѿ��޷������һ�����ͱ����У���35���͸����ˣ�
 * ���Ѿ��޷������һ�������ͱ����С���ˣ���n�Ƚϴ�ʱ��
 * ȥ����n!�Ƿǳ����ѵġ����˵��ǣ��ڱ����У����ǵ�������ȥ����n!��
 * ����ȥ����n!���ұߵ��Ǹ���0�������Ƕ��١����磬5��=1*2*3*4*5=120��
 * ���5!���ұߵ��Ǹ���0��������2�����磬7��=5040��
 * ���7�����ұߵ��Ǹ���0��������4�����磬15��= 
 * 1307674368000�����15�����ұߵ��Ǹ���0��������8��
 * ���дһ����������һ������n(0<n<=100)��
 * Ȼ�����n!���ұߵ��Ǹ���0�������Ƕ��١�
 * @author 86180
 *
 */
public class Demo01 {
	public static void main(String[] args){

/*		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ������0��������");
		int n = scanner.nextInt();
		//��n�Ľ׳�
		long s = 1;    
		for(int i = 1;i <= n;i ++){
			s*=i;
		}
		System.out.println(s);
		//��long����ת��Ϊ�ַ�������
		String str = s + "";
		for(int i = str.length() - 1;i >= 0;i --)       //�ַ����ĳ����Ƿ�������Ҫ��()
			if(str.charAt(i)!='0'){						//���
		      System.out.println(str.charAt(i));
		      break;
			}*/
		//�����ֽϴ� ����16λ�� �Ѿ�������double ���ʹ洢�� ���Բ���BigDecimal����
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ������0��������");
		int n = scanner.nextInt();
		BigDecimal a = new BigDecimal(1);
		for(int i = 1;i <= n;i ++){
			a = a.multiply(new BigDecimal(i));
		}
		System.out.println(a);
		//��aBigDecialת�����ַ�������
		String str = a+"";
		for (int i = str.length() - 1;i >= 0;i --){
			if(str.charAt(i)!='0'){
				System.out.println(str.charAt(i));
				break;
			}
		}
		
		
	}

}








