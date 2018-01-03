package 课堂练习;
//课本P116

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
		double a = Integer.parseInt(args[0]);	//args[]的用法，Run Configurations Arguments
		double b = Integer.parseInt(args[1]);	//Program grguments : 空格隔开
		System.out.println("a/b="+div(a,b));
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("缺少命令行参数");
		}
		catch(NumberFormatException e)
		{
			System.out.println("输入数值格式不正确");
		}
		catch(ArithmeticException e)
		{
			System.out.println("发生算术异常"+e.getMessage());
			e.printStackTrace();
		}
		
	}

	
	

}
