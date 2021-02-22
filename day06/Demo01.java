package day06;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 一个整数n的阶乘可以写成n!，它表示从1到n这n个整数的乘积。
 * 阶乘的增长速度非常快，例如，13！就已经比较大了，
 * 已经无法存放在一个整型变量中；而35！就更大了，
 * 它已经无法存放在一个浮点型变量中。因此，当n比较大时，
 * 去计算n!是非常困难的。幸运的是，在本题中，我们的任务不是去计算n!，
 * 而是去计算n!最右边的那个非0的数字是多少。例如，5！=1*2*3*4*5=120，
 * 因此5!最右边的那个非0的数字是2。再如，7！=5040，
 * 因此7！最右边的那个非0的数字是4。再如，15！= 
 * 1307674368000，因此15！最右边的那个非0的数字是8。
 * 请编写一个程序，输入一个整数n(0<n<=100)，
 * 然后输出n!最右边的那个非0的数字是多少。
 * @author 86180
 *
 */
public class Demo01 {
	public static void main(String[] args){

/*		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个大于0的整数：");
		int n = scanner.nextInt();
		//求n的阶乘
		long s = 1;    
		for(int i = 1;i <= n;i ++){
			s*=i;
		}
		System.out.println(s);
		//将long类型转化为字符串类型
		String str = s + "";
		for(int i = str.length() - 1;i >= 0;i --)       //字符串的长度是方法所以要加()
			if(str.charAt(i)!='0'){						//如果
		      System.out.println(str.charAt(i));
		      break;
			}*/
		//当数字较大 大于16位是 已经不能用double 类型存储了 所以采用BigDecimal类型
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个大于0的整数：");
		int n = scanner.nextInt();
		BigDecimal a = new BigDecimal(1);
		for(int i = 1;i <= n;i ++){
			a = a.multiply(new BigDecimal(i));
		}
		System.out.println(a);
		//将aBigDecial转化成字符串类型
		String str = a+"";
		for (int i = str.length() - 1;i >= 0;i --){
			if(str.charAt(i)!='0'){
				System.out.println(str.charAt(i));
				break;
			}
		}
		
		
	}

}








