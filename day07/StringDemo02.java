package day07;
/**
 * �ַ�����ط���
 * @author 86180
 *
 */
public class StringDemo02 {
	public static void main(String[] args){
		//�ַ������ȱȽ�
		String s1 = "abc";
		String s2 = "sasdads";
		System.out.println(s1.length() == s2.length());
		//�ַ������ݱȽ�
		String s3 = new String("abc");
		String s4 = new String("abc");
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));//�ַ������ݱȽ���equals
		//�ַ��������ִ�Сд�Ƚ�
		String s5 = "abc";
		String s6 = "aBc";
		System.out.println(s5.equalsIgnoreCase(s6));//�����ִ�СдequalsIgnoreCase����
	}
}
