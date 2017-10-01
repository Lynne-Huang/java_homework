package homework0927;

import java.util.Scanner;

public class text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.	从键盘上输入一个数n，然后计算1+2+…+n的和。（while、do-while、for）
		Scanner sr = new Scanner(System.in);
		System.out.println("输入一个数字");
		int num = sr.nextInt();
		int sum = 0;
		//int i = 0;
		
		for(int i=0;i<=num;i++)
		{
			sum=sum+i;
		}
		/*while(i<=num)
		{
			sum+=i;
			i++;
		}*/
		/*do
		{
			sum+=i;
			i++;
		}while(i<=num);
	*/	System.out.println("从1加到"+num+"的和为"+sum);
	
		/*
		int a[]=new int[5];
		for(int i = 0;i<a.length;i++)
		{
			a[i]=i;
		}
		for(int i = a.length-1;i>=0.;i--)
		{
			System.out.println("a["+i+"]="+i);
		}
		*/
	/*	int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			Scanner sr = new Scanner(System.in);
			System.out.println("给数组a["+i+"]赋值");
			int num = sr.nextInt();
			a[i]=num;
		}
		int max = a[0];
		int min = a[0];
		for(int i = 0;i<a.length;i++)
		{
			
			
			if(a[i] > max)
				max = a[i];
			if(a[i] < min)
				min = a[i];
			System.out.println("a[i]"+"="+a[i]);
			
		}
		System.out.println("max"+"="+max);
		System.out.println("min"+"="+min);
		*/
	}

}
