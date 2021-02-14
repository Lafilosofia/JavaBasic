package day01;
/**
 * 基本类型演示
 * @author 86180
 *
 */
public class Demo02 {
	public static void main(String[] args){
		//这种变量叫“驼峰命名法”（见名知意）
		int userPassword = 5;
		System.out.println(userPassword);
		/*
		 * Java变量：存数的,代词,指带的是它们所存的那个数
		 */
		//(1)声明并初始化
		int a = 6; //声明整数变量a并赋值为6
		//(2)先声明后初始化
		int b;
		b = 8;
		//(3)多个声明，并初始化
		int c = 9,d = 10;
		System.out.println(c);
		System.out.println(d);
		int c1,d1 = 10;
		//System.out.println(c1); //编译错误,声明c1,但是未初始化
		/*(4)变量规范：
		 * 1.只能由字母,数字,'_'和'$'符组成
		 * 2.不能以数字开头
		 * 3.不能写"关键字" (比如Java类中提供的红色字体，
		 * public static class,for while...)
		 */
		//int 9y9hj_$;  //编译错误,变量不能以数字开头
		//int void=0; //编译错误,变量不能为关键字
		//(5)int整形的范围(-2147483648~~2147483647)在内存中占4个字节
		int e = 2147483647;
		int e1 = 1;
		int sum = e+e1;
		System.out.println(sum);
		
		
		//(6)long类型(-2^63 ~~ 2^63-1)8个字节
		//long类型后面必须要跟"L"或者小写(l),若不写"L",当数值超过int类型的范围时将会报错,
		//若没超过,则小类型转大类型自动类型转换
		long f=21474836476581L;
		
		//(7)double(浮点型(小数型),8个字节,范围比long大)
		double h=50.78;
		System.out.println(h);
		//int h1=70.89;  //编译错误,类型不匹配
		
		//(8)boolean(布尔类型,1个字节,只能存true或false 用于语句判断)
		boolean g=true; //对
		boolean g1=false;  //错
		
		//(9)char(字符型,两个字节)
		/*
		 * 采用Unicode编码格式,每个字符都有一个对一个的码
		 * 表现的形式是char字符,本质上是int码(0到65535)
		 * ASCII('a'--97,'A'--65,'0'--48,'\0'--0)
		 * 2.字符直接量必须放在单引号中,并且只有一个
		 * 3.特殊字符(\ ' ")需要通过"\"来转义
		 */
		char ch='a';
		System.out.println(ch);
		int ch1=ch;
		System.out.println(ch1);
		char ch2='\0';  //编译错误,字符中必须有且只有一个字符,不能为空,但是可以为空字符('\0'),也不能写多个字符
		System.out.println(ch2);
		//char ch2='\\';//特殊字符需要用"\"来转义
		int ch3=ch2;
		System.out.println(ch3);
		
		
		
	}
}
