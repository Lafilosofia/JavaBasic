package day07;

import java.io.InputStream;
import java.util.Scanner;

/**
 * �û�������������k��n��0<k<n��
 * ��k=0��k=nʱ����������1
 * ��0<k<nʱ ����k��n-1
 * @author 86180
 *
 */
public class Method_dg01 {
 
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);	
	System.out.println("������һ��������");
	int n = scanner.nextInt();
	System.out.println("���������0С��"+n+"��������");
	int k = scanner.nextInt();
	int a = practice(k,n);                //�ؼ�������practice����
	System.out.println(a);

	 	}
	public static int practice(int k,int n){
		if(k == 0 || k == n){
			return 1;
		}
		else{
			return practice(k,n - 1) + practice(k - 1,n - 1);    //�ݹ���a�εõ�a
		}
		
	}

}
