package test1;

import java.util.Scanner;

public class home10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*10. 定义一个字符串数组，长度num由用户输入.用户输入num个学号，初始化字符串数组.
		**将用户输入的num个学号依次输出，并输出该学号所属班级，在班级内的学号*/
			Scanner in = new Scanner(System.in);
			System.out.println("输入卡号：");
			String letter;					//定义一个字符串
			letter = in.nextLine();			//输入一个字符串in.next【一个单词】 或 in.nextLine【一整行】
			System.out.println(letter);		//输出字符串中的数字

			System.out.println("卡号用户类型："+letter.charAt(0));
			System.out.print("入学时间20"+letter.substring(4,6)+"年");
			System.out.print(letter.substring(1, 4)+"专业");
			System.out.print(letter.charAt(6)+"班");

			System.out.print("第"+letter.substring(7,9)+"号学生");
	}

}
