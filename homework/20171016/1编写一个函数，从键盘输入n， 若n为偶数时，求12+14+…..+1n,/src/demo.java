import java.util.*;


public class demo {
	//private static Scanner a;

	/*1、	编写一个函数，从键盘输入n， 若n为偶数时，求1/2+1/4+…..+1/n,
	 * 若为奇数时，求 1/1+1/3+…..+1/n。
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入一个数字");
		Scanner a = new Scanner (System.in);
		int num = a.nextInt(); 

		double sum=0;
		if(num%2==1)
		{
			for(double i=1;i<=num;i=i+2)
			{
				sum=sum+1/i;
			}
		}
		else
		{
			for(double i=2;i<=num;i=i+2)
			{
				sum=sum+1/i;
			}
		}
		System.out.println("结果:"+sum);	

	}

}
