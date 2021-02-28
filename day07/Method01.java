package day07;
/**
 * 方法：
 * 函数 过程
 * 1.方法用于封装一段特定的逻辑功能，如执行计算或者操作
 * 2.方法可以在程序中反复被调用
 * 3.方法可以减少代码重复，方便程序维护
 * 定义方法的五要素：
 * 修饰词 返回值类型 方法名 参数列表 方法体
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
		 * 在修饰方法中带有static修饰的是静态方法
		 * 调用静态方法是类名.静态方法名
		 * 在本类中调用方法可以省略类名 系统默认  方法名.()
		 *		 */
		Method01.test();
	  //Method01.test01(); 编译错误
	
		
	}
	public static void test02(){
	test();	
	}

}
