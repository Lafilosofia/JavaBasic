package day07;
/**
 * ��λ�� 872
 * �� ��λ ʮλ ��λ ��ֵ�ֱ��Ƕ���
 * @author 86180
 *
 */
public class Demo {
	public static void main(String[] args){
		//��λ
		int a = 32423;
		int b = a / 100;
		//��λ
		int g = a % 10;
		//ʮλ
		int s = a % 100 / 10;
		System.out.print("��λ"+g+"ʮλ"+s+"��λ"+b);
	}
}
