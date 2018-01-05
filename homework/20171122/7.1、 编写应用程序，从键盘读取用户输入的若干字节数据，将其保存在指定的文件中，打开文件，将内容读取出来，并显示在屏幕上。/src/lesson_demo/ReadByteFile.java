package lesson_demo;
import java.io.*;
/*以字节方式打开并读取文件中的内容，显示在屏幕上*/
public class ReadByteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try{
			FileInputStream fin =new FileInputStream("D:/JAVA/java_homework/homework/20171122/7.1、 编写应用程序，从键盘读取用户输入的若干字节数据，将其保存在指定的文件中，打开文件，将内容读取出来，并显示在屏幕上。/a.txt");
			int num=0,n=512;
			byte buffer[] = new byte[n];
			while(((num=fin.read(buffer,0,n))!=-1)&&(num>0))
			{
				System.out.println(new String(buffer,0,num));
			}
			System.out.println();
			fin.close();
		}
		catch(IOException ioe)
		{
			System.out.println(ioe);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
