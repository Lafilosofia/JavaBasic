package day06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 3.	��������
���������������󣬷ֱ���m*s��s*n��С���������������˵Ľ����
�����ʽ
������һ�У��ո����������������m,s,n����������200����
����������m�У�ÿ��s�����ո��������������ʾ����A��i��j����
����������s�У�ÿ��n�����ո��������������ʾ����B��i��j����
�����ʽ
����m�У�ÿ��n���ո��������������������ľ���C��i��j����ֵ��
��������
2 3 2
1 0 -1
1 1 -3
0 3
1 2
3 1
�������
-3 2
-8 2

 * @author 86180
 *
 */
public class Demo02 {
	public static void main(String[] args){
/*		String str = "1 2 3 4 5 ";
		String[] arrstr = str.split(" ");
		System.out.println(arrstr[2]);
		//�ַ���ת��Ϊint����
		int b = Integer.parseInt(arrstr[4]);
		System.out.println(b);*/
		//��һ������һ�У��ո����������������m,s,n
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ո������������������");
		String str = scanner.nextLine();
		String[] arrStr = str.split(" ");
		//���������ַ���ת��Ϊint����
		int m = Integer.parseInt(arrStr[0]);
		int s = Integer.parseInt(arrStr[1]);
		int n = Integer.parseInt(arrStr[2]);
		//�ڶ�����
		int[][] arr01 = new int[m][s];
		int[][] arr02 = new int[s][n];
	
		for(int i = 0; i < m ; i ++){
			System.out.println("������"+s+"���������ÿո����");
			String att = scanner.nextLine();
			String[] arrStt = att.split(" ");
			//����û�������ַ����ֽⲢ����arr��ά������
			for(int j = 0;j < arrStt.length;j ++){
				arr01[i][j] = Integer.parseInt(arrStt[j]);
			
			}
			//��ӡÿһ�е�����
			System.out.println(Arrays.toString(arr01[i]));
		}
		    //��������s��
		for(int i = 0;i < s; i ++){
		System.out.println("������"+n+"���������ÿո����");
		String btt = scanner.nextLine();
		String[] arrstt = btt.split(" ");
		for(int j = 0;j < arrstt.length ;j ++ ){
			arr02[i][j] = Integer.parseInt(arrstt[j]);
		}
		System.out.println(Arrays.toString(arr02[i]));	
		
		}
		//���Ĳ�
		for(int i = 0;i < m ; i ++){
			for(int j = 0;j < n;j ++){
				int sum = 0;
				for(int k = 0; k < s;k ++){
					sum +=arr01[i][k] * arr02[k][j];
					
				}
				System.out.print(sum+" ");
			}
			System.out.println();
		}
		
		
	}
	
}






