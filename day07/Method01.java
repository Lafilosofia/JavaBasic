package day07;
/**
 * ������
 * ���� ����
 * 1.�������ڷ�װһ���ض����߼����ܣ���ִ�м�����߲���
 * 2.���������ڳ����з���������
 * 3.�������Լ��ٴ����ظ����������ά��
 * ���巽������Ҫ�أ�
 * ���δ� ����ֵ���� ������ �����б� ������
 * @author 86180
 *
 */
public class Method01 {
	public static void test(){
		for(int i = 0;i < 3 ;i ++){
			System.out.println(i);
		}
	}
	public void test01(){
		
	}
	public static void main(String[] args){
		/*
		 * �����η����д���static���ε��Ǿ�̬����
		 * ���þ�̬����������.��̬������
		 * �ڱ����е��÷�������ʡ������ ϵͳĬ��  ������.()
		 *		 */
		Method01.test();
	  //Method01.test01(); �������
	
		
	}
	public static void test02(){
	test();	
	}

}
