import java.util.Scanner;

public class home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			Scanner sr = new Scanner(System.in);
			System.out.print("a["+i+"]=");
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
	}

}
