package day03;
/*
 * 写出九九乘法表
 */
public class Demo07 {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++){  //控制行
			for(int j=1;j<=i;j++){  //控制列
				//  "\t"相当于制表符(tab)的意思,print表示不换行
				System.out.print(j+"*"+i+"="+(j*i)+"\t");			
			}
			System.out.println();//换行
		}
		/*
		 * 当i=1;(第一轮)
		 * j=1 1*1=1
		 * 当i=2;(第二轮)
		 * j=1 1*2=2  j=2 2*2=4
		 * 当i=3;(第三轮)
		 * j=1 1*3=3  j=2 2*3=6  j=3 3*3=9
		 * ....
		 */
		
		
	}
}
