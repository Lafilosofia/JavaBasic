package day07;
/**
 * �����ĵݹ飺
 * @author 86180
 *
 */
public class Method_dg03 {
	public static int test(int a){
		if(a == 1){			//�ݹ��ֹͣ����
			return 1;
		}
		else{
			a --;
			System.out.println(a);
			return test(a);
		}
	}
	public static void main(String[] args){
		int n = test(5);
		//System.out.println(n);
	}
}
