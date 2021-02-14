package day02;
/**
 * 基本演示类型
 * @author 86180
 *
 */
public class Demo01 {
	//主程序入口 
public static void main (String[] args){
	//在控制台上的输出语句
	//print不换行  println换行
	System.out.println("hello world");   
	System.out.println("你好");
	//int userName = 1;   //这种变量叫做"驼峰命名法"
	/*
	 * Java变量：存数的代词，指带的它所存的那个数
	 */
	//(1)声明并初始化
	int a = 5;//声明整数变量a并赋值为5
	System.out.println("a");
	//(2)int整型范围 内存中占四个字节
	//(3)long在内存中占八个字节-2^63~2^64
	//long a=1351654513L;
	//(4)L表示这个是long类型的
	//(5)double类型（浮点类型，8个字节，范围很大比lang大）
	//double 
	//boolean类型(1个字节 只能存true和false)
	//char类型（字符型 2个字节）
	/*
	 * 1.采用linicode编码格式，每个字符都带有一个对
	 * 一个的码表现形式char字符，本质上是int码（0到65535）
	 * ASC11码
	 * 2.字符直接量必须放在单引号中，并且只有一个
	 * 3.特殊字符需要通过"\"来转换
	 */
	char ch='a';
	System.out.println(ch);
	int cc=ch;
	System.out.println(cc);
	char ch023=' ';
	//注意：在char字符中有一个并且只有一个字符才行
	//不能为空 但是可以为空格字符
     }
}
