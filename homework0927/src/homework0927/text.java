package homework0927;

import java.util.Scanner;

public class text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.	�Ӽ���������һ����n��Ȼ�����1+2+��+n�ĺ͡���while��do-while��for��
		Scanner sr = new Scanner(System.in);
		System.out.println("����һ������");
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
	*/	System.out.println("��1�ӵ�"+num+"�ĺ�Ϊ"+sum);
	
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
			System.out.println("������a["+i+"]��ֵ");
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
