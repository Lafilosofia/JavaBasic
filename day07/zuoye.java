package day07;
/**
 * ��װһ������generateArray���÷���ʵ������ָ�����ȵ�int���飬
 * �������Ԫ��Ϊ0��ָ����Χ�ڵ�����������������鷵�ء�
 */
import java.util.Arrays;
import java.util.Random;

public class zuoye {
	public static int[] generateArray(int length,int max){
		int [] arr = new int[length];
		Random random = new Random();
		for(int i = 0;i < arr.length; i ++){
			arr[i] = random.nextInt(max);
		}
		return arr;
		
	}
	public static void main(String[] args){
		int [] arr = generateArray(10,20 );          //���÷���
		System.out.println("���ɵ�����Ϊ��"+Arrays.toString(arr));
	}
	public static void Gussinggame(String[] args){
		char [] str = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		Random random = new Random();
		int s = random.nextInt(26);
		System.out.println(str[s]);
		
	}
}
