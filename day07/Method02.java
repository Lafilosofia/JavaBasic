package day07;
/**
 * ������������ͷ���ֵ��
 * ����������ָ��
 * 1.�ڵ���ʱ���ݸ���������Ҫ���������������
 * 2.���������в���Ҳ����û�в������в���ʱ���Դ�������
 * 3.�ڷ�������ʱ����Ҫ������������Ҫ�Ĳ�������
 * 4.�ڵ��÷���ʱ���Ὣʵ�ʵĲ���ֵ���ݸ������Ĳ���������
 *   ���뱣֤���ݲ��������ͺ͸������Ϸ���������
 * 5.����ֵ������з������ͣ���������Ҫ��return�������ض�Ӧ�ķ�������
 * @author 86180
 *
 */
public class Method02 {
	//���з���ֵ�ķ���
	public static int test(){
	return 2;	
	}
	
	//���в����б�ķ���
	public static void test01(String name,int age ){
		System.out.println("�ҵ����ֽ�"+name+" "+"�ҵ�������"+age);
	}
	
	//���з������ͺͲ����б�ķ���
	public static int test02(int a,int b){
		
		return a + b;
	}
	
	//��������ֵ���͵ķ�����"return"����
	public static void test03(){
		System.out.println("����03");
		return;       //û�з���ֵ����ʱreturn��ʾ�����˷���
	
	
	/*public static void main(String[] args){
		int n = Method02.test();
		System.out.println(n);
		String username = "�����";
		int age = 18;
		test01(username,age);
		test01("����",100);*/
	/*int a = test02(4,8);*/
		
	}
}

