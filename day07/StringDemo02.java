package day07;
/**
 * 字符串相关方法
 * @author 86180
 *
 */
public class StringDemo02 {
	public static void main(String[] args){
		//字符串长度比较
		String s1 = "abc";
		String s2 = "sasdads";
		System.out.println(s1.length() == s2.length());
		//字符串内容比较
		String s3 = new String("abc");
		String s4 = new String("abc");
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));//字符串内容比较用equals
		//字符串不区分大小写比较
		String s5 = "abc";
		String s6 = "aBc";
		System.out.println(s5.equalsIgnoreCase(s6));//不区分大小写equalsIgnoreCase方法
	}
}
