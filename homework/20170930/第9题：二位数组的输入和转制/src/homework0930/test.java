package homework0930;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*9. 编写一个Java 程序，定义一个2行3列的整型 数组，要求用户从键盘中为每个元素输入一个整数，
		 * 然后输出每个数组元素的内容，再将二维数组的行列交换，然后输出交换后的数组*/
		int num[][] = new int [2][3];
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[0].length;j++)
			{
				Scanner sr = new Scanner(System.in);
				System.out.print("num["+i+"]["+j+"]=");
				num[i][j] = sr.nextInt();
			}
		}
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[0].length;j++)
			{
				
				System.out.print(num[i][j]+"\t");

			}
			System.out.println();
		}
		System.out.println("转制后：");
		int transfer[][] = new int[3][2];
		for(int i=0;i<transfer.length;i++)
		{
			for(int j=0;j<transfer[0].length;j++)
			{
				transfer[i][j] = num[j][i];
			}
		}
		for(int i=0;i<transfer.length;i++)
		{
			for(int j=0;j<transfer[0].length;j++)
			{
				
				System.out.print(transfer[i][j]+"\t");

			}
			System.out.println();
		}
	
		
	}

}
