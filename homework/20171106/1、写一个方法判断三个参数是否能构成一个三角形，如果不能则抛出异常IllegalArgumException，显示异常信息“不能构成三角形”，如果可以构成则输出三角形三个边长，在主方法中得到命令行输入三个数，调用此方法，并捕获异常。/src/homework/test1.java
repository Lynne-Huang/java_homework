package homework;

import java.util.Scanner;

/* дһ�������ж����������Ƿ��ܹ���һ�������Σ�
 * ����������׳��쳣IllegalArgumException��
 * ��ʾ�쳣��Ϣ�����ܹ��������Ρ���������Թ�������������������߳���
 * ���������еõ����������������������ô˷������������쳣��
 * */
public class test1 {
	static void tri(int a,int b,int c)throws IllegalArgumentException{
		if(a>0&&b>0&&c>0){
			if((a+b>c)&&(a+c>b)&&(b+c>a)){
				System.out.println("�����εı�Ϊ"+"a="+a+" b="+b+" c="+c);
		}
		else{
			throw new  IllegalArgumentException("a��b��c���ܹ���������");
		}
		}
		else{
			throw new  IllegalArgumentException("a��b��c���ܹ���������");
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = Integer.parseInt(args[2]);
			tri(a,b,c);
		}
		catch( IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}

}
