package test1;

import java.util.Scanner;

public class home10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*10. ����һ���ַ������飬����num���û�����.�û�����num��ѧ�ţ���ʼ���ַ�������.
		**���û������num��ѧ������������������ѧ�������༶���ڰ༶�ڵ�ѧ��*/
			Scanner in = new Scanner(System.in);
			System.out.println("���뿨�ţ�");
			String letter;					//����һ���ַ���
			letter = in.nextLine();			//����һ���ַ���in.next��һ�����ʡ� �� in.nextLine��һ���С�
			System.out.println(letter);		//����ַ����е�����

			System.out.println("�����û����ͣ�"+letter.charAt(0));
			System.out.print("��ѧʱ��20"+letter.substring(4,6)+"��");
			System.out.print(letter.substring(1, 4)+"רҵ");
			System.out.print(letter.charAt(6)+"��");

			System.out.print("��"+letter.substring(7,9)+"��ѧ��");
	}

}
