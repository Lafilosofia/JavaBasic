package day06;

import java.util.Scanner;

/**
 * ����һ��ʵ��x������С��nʹ�ã�1/2+1/3+1/4+...+1/(n+1)>=x��
�����ʵ��x��֤���ڵ���0.01��С�ڵ���5.20��
����ǡ������λС������ĳ���Ҫ�ܹ�����������ݣ�
����ͣ�ض���x�����x������0.00�������𰸣������˳�����
�����ʽΪ����һ��x�����һ��n card(s)������n��ʾҪ����Ĵ𰸡�
�����ʽ
������������x�ľ�����ֵ
�����ʽ
�����������n����ֵ����ʽΪn card(s)
��������
1.00
3.71
0.04
5.19
0.00

�������
3 card(s)
61 card(s)
1 card(s)
273 card(s)

 * @author 86180
 *
 */
public class Demo03 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ��ʵ����֤���ڵ���0.01��С�ڵ���5.20��");
		double x = scanner.nextDouble();
		double sum = 0.0;
		int n = 1;
		if(x==0.0){
			System.out.println("�˳�����");
			return ;
		}
					
		//���sum���ڻ��ߵ���x��ôΪfalse
		while(sum < x){
			sum+=1.0/(n+1);
			n ++;
					}
		System.out.println((n-1) + "card(s)");
		
	}

}
