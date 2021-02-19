package day03;
/**
 * 通过代码计算一段程序运行的时间
 * @author Lenovo
 *
 */
public class Demo08 {
	public static void main(String[] args) {
		/*
		 * 测试执行for循环完毕后一共消耗了多少毫秒
		 * System类提供了一个静态方法currentTimeMillis()指当前的毫秒数;
		 */
		long time1=System.currentTimeMillis();//变量为long类型
		//System.out.println(time1);
		for(int i=0;i<10000;i++){
			System.out.println(i);
		}
		long time2=System.currentTimeMillis();
		//System.out.println(time2);
		System.out.println("执行for循环完毕后一共消耗了"+(time2-time1)+"毫秒");
	}
}
