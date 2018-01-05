package homework;
/*2、编写程序，将两个文件的内容读取合并到另一个文件中。*/
import java.io.*;
public class WriteByteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try
		{
			FileReader fin1 = new FileReader("D:/JAVA/java_homework/homework/20171122/7.1、 编写应用程序，从键盘读取用户输入的若干字节数据，将其保存在指定的文件中，打开文件，将内容读取出来，并显示在屏幕上。/a.txt");
			FileReader fin2 = new FileReader("D:/JAVA/java_homework/homework/20171122/7.1、 编写应用程序，从键盘读取用户输入的若干字节数据，将其保存在指定的文件中，打开文件，将内容读取出来，并显示在屏幕上。/b.txt");
																//以文件名为数据源创建输入流
			BufferedReader br1 = new BufferedReader(fin1);		//创建缓冲区字符输入流
			BufferedReader br2 = new BufferedReader(fin2);
			BufferedWriter bw3 = new BufferedWriter(new FileWriter("D:/JAVA/java_homework/homework/20171122/7.1、 编写应用程序，从键盘读取用户输入的若干字节数据，将其保存在指定的文件中，打开文件，将内容读取出来，并显示在屏幕上。/c.txt"));
																//创建缓冲区字符输出流
			String s,s1,s2;	
			s1=br1.readLine();
			s2=br2.readLine();									//读取一行字符串
			while(s1!=null)
			{
				bw3.write(s1);									//将字符串s1写到文件bw3中
				s1=br1.readLine();								//读取一行字符串
				bw3.newLine();									//写入回车换行符
			}
			while(s2!=null)
			{
				bw3.write(s2);
				s2=br2.readLine();
				bw3.newLine();
			}
			br1.close();										//关闭
			br2.close();
			bw3.close();
			System.out.println("文件和并成功");
		}
		catch(IOException ioe){
			System.out.println(ioe);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
