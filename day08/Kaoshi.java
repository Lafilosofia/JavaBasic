package day08;

public class Kaoshi {
	public static void main(String[] args) {
/*		int a = 1;
		int sum = 0;
		for(int i = 0;i < 20; i ++){
			a ++;
			for(int j = 0;j < 20; j ++){
				sum = sum + a;
				System.out.println(sum);
			}
		}*/
		long sum = 0;
		for(int i = 0 ;i < 20;i ++){
			sum += (Math.pow(10, i) - 1);
		}
		System.out.println(sum);
	}
}
