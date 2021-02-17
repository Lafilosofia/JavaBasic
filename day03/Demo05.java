package day03;
/**
 * do{语句块}while(boolean)
 * 先执行语句块再进行判断
 * boolean如果为true则继续执行语句块直到boolean为false则跳出循环
 * 
 * 注意:
 * 它和while()循环的区别在于:while()循环是先判断再执行,
 * 而do{}while()是先执行在判断
 * @author 86180
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		/*int a=0;
		do{
			System.out.println(a);
			a++;
		}while(a<6);*/
		/*
		 * for(表达式1;表达式2;表达式3){语句块}固定循环:
		 * for循环执行顺序:
		 * 先执行表达式1再执行表达式2(true)然后再执行语句块
		 * 再执行表达式3然后再执行表达式2再执行语句块再执行表达式3...
		 * 直到表达式2位false则跳出循环
		 */
		//方式一:
		for(int i=0;i<10;i++){
			if(i==6){
				//continue跳出当前判断不往下执行并返回循环继续执行循环
				continue;
			}
			System.out.println(i);
		}
		
		//方式二:
		/*int i=0;
		for(;i<10;i++){
			System.out.println(i);
		}*/
		
		//方式三:
		/*for(int i=0;i<10;){
			System.out.println(i);
			i++;
		}*/
		
		//方式四:(了解)
		/*for(;;){//死循环
			System.out.println("呵呵");
		}*/
		
		
		
		
	}
}