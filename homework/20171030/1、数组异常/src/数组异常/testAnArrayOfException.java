package 数组异常;

import java.util.Scanner;

public class testAnArrayOfException {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int[] num=new int[5];
		for(int i=0;i<6;i++){
			try{
			num[i]=input.nextInt();
			System.out.println(num[i]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("下标异常");
			}
			finally{
				System.out.println(i);
			}
		}
		input.close();
	}
}