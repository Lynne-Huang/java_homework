import java.util.Scanner;

public class suma_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.	编写一个JAVA应用程序，要求从键盘输入2个整数，计算这两个数据之和并输出。
				Scanner s1 = new Scanner(System.in);
				Scanner s2= new Scanner(System.in);
				System.out.println("输入2个整数");
				int num1 = s1.nextInt();
				int num2 = s2.nextInt();
				int sum=num1+num2;
				System.out.println(num1+"+"+num2+"="+sum);

	}

}
