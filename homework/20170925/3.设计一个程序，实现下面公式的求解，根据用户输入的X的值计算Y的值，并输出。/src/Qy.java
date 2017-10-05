import java.util.Scanner;

public class Qy {
	public static void main(String[] args) {
	/*
 	3.	设计一个程序，实现下面公式的求解，根据用户输入的X的值计算Y的值，并输出。有下列函数
		-x+3		(x<5)
	y=	20-3*(x+3)	(5<=x<10)
		-3+x		(x>=10)
*/	
		
		
		Scanner num = new Scanner(System.in);
		System.out.println("输入一个数");
		int x = num.nextInt();
		int y = 0;
		if(x<5)
			y= -x + 3;
		else if(x>=5&&x<10)
			y = 20-3*(x+3);
		else
			y=-3+x;
		System.out.println("y="+y);

	}
}
