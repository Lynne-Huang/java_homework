package ������ϰ;
//�α�P116

public class CatchMultipleExceptions {
	public static double div(double num1,double num2)
	{
		if(num2==0)
		{
			throw new ArithmeticException();
		}
		else
		{
		return num1/num2;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		double a = Integer.parseInt(args[0]);	//args[]���÷���Run Configurations Arguments
		double b = Integer.parseInt(args[1]);	//Program grguments : �ո����
		System.out.println("a/b="+div(a,b));
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ȱ�������в���");
		}
		catch(NumberFormatException e)
		{
			System.out.println("������ֵ��ʽ����ȷ");
		}
		catch(ArithmeticException e)
		{
			System.out.println("���������쳣"+e.getMessage());
			e.printStackTrace();
		}
		
	}

	
	

}
