package test;

import java.util.Scanner;

public class homework {
	public class StringIndexOutOf{
		String cpro_psid="u2787156";
		String cpro_pswidth="966";
		String cpro_psheigh="120";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个字符串：");
		try {
			Scanner in=new Scanner(System.in);
			String str=in.nextLine();
			System.out.println("第四个字符为："+str.charAt(3));
			int aa =Integer.parseInt(args[0]);
			System.out.println("平方为："+aa*aa);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("字符串索引越界异常");
		}
		catch(NumberFormatException e) {
			System.out.println("输入错误");
		}
    }


}


