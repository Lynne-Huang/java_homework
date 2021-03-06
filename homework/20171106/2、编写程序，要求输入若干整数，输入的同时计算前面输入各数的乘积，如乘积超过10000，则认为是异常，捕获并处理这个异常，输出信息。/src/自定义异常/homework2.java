package 自定义异常;

import java.util.Scanner;

/**
 * 编写程序，要求输入若干整数，
 * 输入的同时计算前面输入各数的乘积，
 * 若乘积超过100000，
 * 则认为是异常，捕获并处理这个异常，输出信息。
 * @author Lynne琳
 *
 */

public class homework2 {
	public static void main(String[] args) {
		int  product = 1 ;
		Scanner in = new Scanner(System.in);
		while(true)
		{
			System.out.println("输入一个整数");
			
			int num = in.nextInt();
			product *= num;
			System.out.println(product);
			if(product>100000)
			{
				try{
					throw new Exception("乘积已超出上限！");
				}
				catch(Exception e){
					System.out.println(e.getMessage());
				}
				break;
			}
		}

	}
}
