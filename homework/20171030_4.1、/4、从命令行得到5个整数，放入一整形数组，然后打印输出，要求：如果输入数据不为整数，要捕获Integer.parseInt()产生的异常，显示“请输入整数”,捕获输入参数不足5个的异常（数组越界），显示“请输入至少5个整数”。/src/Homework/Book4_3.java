package Homework;
/*
 * 4、	从命令行得到5个整数，放入一整形数组，然后打印输出，
 * 要求：如果输入数据不为整数，要捕获Integer.parseInt()产生的异常，显示“请输入整数”,
 * 捕获输入参数不足5个的异常（数组越界），显示“请输入至少5个整数”。
 * */
public class Book4_3 {
	public static void main(String[] args) {
		try{
			if(args.length<5){
				throw new Exception();
			}
			int a[] = new int[args.length];
			for(int i=0;i<args.length;i++)
			{
				a[i]=Integer.parseInt(args[i]);	//将String字符类型数据转换为Integer整型数据
			}
			for(int i=0;i<args.length;i++){
				System.out.println(a[i]+"");
			}
		}
		catch(NumberFormatException e){
			System.out.println("请输入整数");
		}
		catch(Exception e){
			System.out.println("请输入至少5个整数");
		}
	}
}
