package lesson_demo;
import java.io.*;
/*���ֽڷ�ʽ�򿪲���ȡ�ļ��е����ݣ���ʾ����Ļ��*/
public class ReadByteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try{
			FileInputStream fin =new FileInputStream("D:/JAVA/java_homework/homework/20171122/7.1�� ��дӦ�ó��򣬴Ӽ��̶�ȡ�û�����������ֽ����ݣ����䱣����ָ�����ļ��У����ļ��������ݶ�ȡ����������ʾ����Ļ�ϡ�/a.txt");
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
