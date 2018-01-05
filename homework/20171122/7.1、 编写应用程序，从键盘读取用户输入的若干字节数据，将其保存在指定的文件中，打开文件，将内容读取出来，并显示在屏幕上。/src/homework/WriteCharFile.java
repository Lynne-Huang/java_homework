package homework;

import java.io.*;

/*1、 编写应用程序，从键盘读取用户输入的若干字节数据，
 * 将其保存在指定的文件中，打开文件，将内容读取出来，
 * 并显示在屏幕上。*/
/*一个字节数组、输入流输出流*/
public class WriteCharFile {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		try
		{
			int n=512;
			byte i[]=new byte[n];
			System.out.println("Please input text：");
			int num = System.in.read(i);		//读取标准输入流
			FileOutputStream fout = new FileOutputStream("d:/JAVA/java_homework/homework/20171122/7.1、 编写应用程序，从键盘读取用户输入的若干字节数据，将其保存在指定的文件中，打开文件，将内容读取出来，并显示在屏幕上。/a.txt");
												//创建文件输出流对象***注意地址要用/写
			fout.write(i, 0, num);				//写入输入流
			fout.close();						//关闭输入流
			System.out.println("Save to myfile.txt");
		}
		catch(IOException ioe)
		{
			System.out.println(ioe);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
