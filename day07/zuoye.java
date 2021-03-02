package day07;
/**
 * 封装一个方法generateArray，该方法实现生成指定长度的int数组，
 * 该数组的元素为0到指定范围内的随机数，并将该数组返回。
 */
import java.util.Arrays;
import java.util.Random;

public class zuoye {
	public static int[] generateArray(int length,int max){
		int [] arr = new int[length];
		Random random = new Random();
		for(int i = 0;i < arr.length; i ++){
			arr[i] = random.nextInt(max);
		}
		return arr;
		
	}
	public static void main(String[] args){
		int [] arr = generateArray(10,20 );          //调用方法
		System.out.println("生成的数组为："+Arrays.toString(arr));
	}
	public static void Gussinggame(String[] args){
		char [] str = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		Random random = new Random();
		int s = random.nextInt(26);
		System.out.println(str[s]);
		
	}
}
