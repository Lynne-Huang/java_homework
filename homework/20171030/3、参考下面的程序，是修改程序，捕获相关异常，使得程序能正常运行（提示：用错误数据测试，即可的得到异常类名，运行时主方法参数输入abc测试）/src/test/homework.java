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
		System.out.println("������һ���ַ�����");
		try {
			Scanner in=new Scanner(System.in);
			String str=in.nextLine();
			System.out.println("���ĸ��ַ�Ϊ��"+str.charAt(3));
			int aa =Integer.parseInt(args[0]);
			System.out.println("ƽ��Ϊ��"+aa*aa);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("�ַ�������Խ���쳣");
		}
		catch(NumberFormatException e) {
			System.out.println("�������");
		}
    }


}


