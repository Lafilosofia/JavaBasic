package day07;
/**
 * 三位数 872
 * 求 个位 十位 百位 的值分别是多少
 * @author 86180
 *
 */
public class Demo {
	public static void main(String[] args){
		//百位
		int a = 32423;
		int b = a / 100;
		//各位
		int g = a % 10;
		//十位
		int s = a % 100 / 10;
		System.out.print("各位"+g+"十位"+s+"百位"+b);
	}
}
