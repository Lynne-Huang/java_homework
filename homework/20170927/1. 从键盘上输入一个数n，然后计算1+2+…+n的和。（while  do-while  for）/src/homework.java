import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5.	从键盘上输入一个数n，然后计算1+2+…+n的和。（while、do-while、for）
				Scanner sr = new Scanner(System.in);
				System.out.println("输入一个数字");
				int num = sr.nextInt();
				int sum = 0;
				int i;
				for(i=0;i<=num;i++)
				{
					sum=sum+i;
				}
				System.out.println("从1加到"+num+"的和为"+sum);
				while(i<=num)
				{
					sum+=i;
					i++;
				}
				System.out.println("从1加到"+num+"的和为"+sum);
				sum=0;
				i=0;
				do
				{
					sum+=i;
					i++;
				}while(i<=num);
				System.out.println("从1加到"+num+"的和为"+sum);
	}

}
