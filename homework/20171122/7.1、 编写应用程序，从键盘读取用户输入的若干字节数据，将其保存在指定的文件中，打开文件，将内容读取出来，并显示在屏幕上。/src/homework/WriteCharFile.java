package homework;

import java.io.*;

/*1�� ��дӦ�ó��򣬴Ӽ��̶�ȡ�û�����������ֽ����ݣ�
 * ���䱣����ָ�����ļ��У����ļ��������ݶ�ȡ������
 * ����ʾ����Ļ�ϡ�*/
/*һ���ֽ����顢�����������*/
public class WriteCharFile {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		try
		{
			int n=512;
			byte i[]=new byte[n];
			System.out.println("Please input text��");
			int num = System.in.read(i);		//��ȡ��׼������
			FileOutputStream fout = new FileOutputStream("d:/JAVA/java_homework/homework/20171122/7.1�� ��дӦ�ó��򣬴Ӽ��̶�ȡ�û�����������ֽ����ݣ����䱣����ָ�����ļ��У����ļ��������ݶ�ȡ����������ʾ����Ļ�ϡ�/a.txt");
												//�����ļ����������***ע���ַҪ��/д
			fout.write(i, 0, num);				//д��������
			fout.close();						//�ر�������
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
