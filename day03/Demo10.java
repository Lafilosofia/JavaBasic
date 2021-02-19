package day03;
/**
 * 一个物体从高空100m进行自由落体下落,每次下落后
 * 反弹上去的距离是原来的一半;
 * 问:第10次落地后一共经历了多少路程?
 * 最后一次反弹上去的距离是多少?
 * 
 * 分析:
 * 第一次:100m(下落)--->50m(反弹)
 * 第二次:50m(下落)---->25m(反弹)
 * 第三次:50m(下落)---->12.5m(反弹)
 * 第四次:12.5m(下落)-->6.25m(反弹)
 * ...
 * ...
 * 条件:
 * double sum=0;//落地后经历的总路程
 * double s=100;//第一次落地的高度(距离)
 * double t=s/2;//第一次落地后反弹的高度(距离)
 * 
 * 第一轮:总路程:sum=sum+s+s/2			s=t
 * 第二轮:总路程:sum=sum+s+s/2			s=t
 * 
 * @author 86180
 *
 */
public class Demo10 {
	public static void main(String[] args) {
		double sum=0;//落地后经历的总路程
		double s=100;//第一次落地的高度(距离)
		double t=0;//第一次落地后反弹的高度(距离)
		for(int i=1;i<=10;i++){
			System.out.println("第"+i+"落地高度:"+s+"m");
			t=s/2;
			System.out.println("第"+i+"反弹高度:"+t+"m");
			sum=sum+s+t;
			System.out.println("第"+i+"落地反弹后总高度:"+sum+"m");
			s=t;
		}
		System.out.println("第10次落地后一共经历了"+(sum-t)+"m");
		System.out.println("最后一次反弹上去的距离是"+t+"m");
	}
}
