package day01;
/**
 * ����������ʾ
 * @author 86180
 *
 */
public class Demo02 {
	public static void main(String[] args){
		//���ֱ����С��շ���������������֪�⣩
		int userPassword = 5;
		System.out.println(userPassword);
		/*
		 * Java������������,����,ָ����������������Ǹ���
		 */
		//(1)��������ʼ��
		int a = 6; //������������a����ֵΪ6
		//(2)���������ʼ��
		int b;
		b = 8;
		//(3)�������������ʼ��
		int c = 9,d = 10;
		System.out.println(c);
		System.out.println(d);
		int c1,d1 = 10;
		//System.out.println(c1); //�������,����c1,����δ��ʼ��
		/*(4)�����淶��
		 * 1.ֻ������ĸ,����,'_'��'$'�����
		 * 2.���������ֿ�ͷ
		 * 3.����д"�ؼ���" (����Java�����ṩ�ĺ�ɫ���壬
		 * public static class,for while...)
		 */
		//int 9y9hj_$;  //�������,�������������ֿ�ͷ
		//int void=0; //�������,��������Ϊ�ؼ���
		//(5)int���εķ�Χ(-2147483648~~2147483647)���ڴ���ռ4���ֽ�
		int e = 2147483647;
		int e1 = 1;
		int sum = e+e1;
		System.out.println(sum);
		
		
		//(6)long����(-2^63 ~~ 2^63-1)8���ֽ�
		//long���ͺ������Ҫ��"L"����Сд(l),����д"L",����ֵ����int���͵ķ�Χʱ���ᱨ��,
		//��û����,��С����ת�������Զ�����ת��
		long f=21474836476581L;
		
		//(7)double(������(С����),8���ֽ�,��Χ��long��)
		double h=50.78;
		System.out.println(h);
		//int h1=70.89;  //�������,���Ͳ�ƥ��
		
		//(8)boolean(��������,1���ֽ�,ֻ�ܴ�true��false ��������ж�)
		boolean g=true; //��
		boolean g1=false;  //��
		
		//(9)char(�ַ���,�����ֽ�)
		/*
		 * ����Unicode�����ʽ,ÿ���ַ�����һ����һ������
		 * ���ֵ���ʽ��char�ַ�,��������int��(0��65535)
		 * ASCII('a'--97,'A'--65,'0'--48,'\0'--0)
		 * 2.�ַ�ֱ����������ڵ�������,����ֻ��һ��
		 * 3.�����ַ�(\ ' ")��Ҫͨ��"\"��ת��
		 */
		char ch='a';
		System.out.println(ch);
		int ch1=ch;
		System.out.println(ch1);
		char ch2='\0';  //�������,�ַ��б�������ֻ��һ���ַ�,����Ϊ��,���ǿ���Ϊ���ַ�('\0'),Ҳ����д����ַ�
		System.out.println(ch2);
		//char ch2='\\';//�����ַ���Ҫ��"\"��ת��
		int ch3=ch2;
		System.out.println(ch3);
		
		
		
	}
}
