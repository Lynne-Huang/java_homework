import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5.	�Ӽ���������һ����n��Ȼ�����1+2+��+n�ĺ͡���while��do-while��for��
				Scanner sr = new Scanner(System.in);
				System.out.println("����һ������");
				int num = sr.nextInt();
				int sum = 0;
				int i;
				for(i=0;i<=num;i++)
				{
					sum=sum+i;
				}
				System.out.println("��1�ӵ�"+num+"�ĺ�Ϊ"+sum);
				while(i<=num)
				{
					sum+=i;
					i++;
				}
				System.out.println("��1�ӵ�"+num+"�ĺ�Ϊ"+sum);
				sum=0;
				i=0;
				do
				{
					sum+=i;
					i++;
				}while(i<=num);
				System.out.println("��1�ӵ�"+num+"�ĺ�Ϊ"+sum);
	}

}
