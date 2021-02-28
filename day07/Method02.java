package day07;
/**
 * 方法定义参数和返回值：
 * 方法参数是指：
 * 1.在调用时传递给方法，需要被方法处理的数据
 * 2.方法可以有参数也可以没有参数，有参数时可以处理更灵活
 * 3.在方法定义时，需要声明方法所需要的参数变量
 * 4.在调用方法时，会将实际的参数值传递给方法的参数变量，
 *   必须保证传递参数的类型和个数符合方法的声明
 * 5.返回值：如果有返回类型，方法中需要“return”来返回对应的返回类型
 * @author 86180
 *
 */
public class Method02 {
	//带有返回值的方法
	public static int test(){
	return 2;	
	}
	
	//带有参数列表的方法
	public static void test01(String name,int age ){
		System.out.println("我的名字叫"+name+" "+"我的年龄是"+age);
	}
	
	//带有返回类型和参数列表的方法
	public static int test02(int a,int b){
		
		return a + b;
	}
	
	//不带返回值类型的方法用"return"返回
	public static void test03(){
		System.out.println("测试03");
		return;       //没有返回值类型时return表示跳出此方法
	
	
	/*public static void main(String[] args){
		int n = Method02.test();
		System.out.println(n);
		String username = "李浩哲";
		int age = 18;
		test01(username,age);
		test01("西瓜",100);*/
	/*int a = test02(4,8);*/
		
	}
}

