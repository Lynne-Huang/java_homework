package homework;
/*2����д���򣬽������ļ������ݶ�ȡ�ϲ�����һ���ļ��С�*/
import java.io.*;
public class WriteByteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try
		{
			FileReader fin1 = new FileReader("D:/JAVA/java_homework/homework/20171122/7.1�� ��дӦ�ó��򣬴Ӽ��̶�ȡ�û�����������ֽ����ݣ����䱣����ָ�����ļ��У����ļ��������ݶ�ȡ����������ʾ����Ļ�ϡ�/a.txt");
			FileReader fin2 = new FileReader("D:/JAVA/java_homework/homework/20171122/7.1�� ��дӦ�ó��򣬴Ӽ��̶�ȡ�û�����������ֽ����ݣ����䱣����ָ�����ļ��У����ļ��������ݶ�ȡ����������ʾ����Ļ�ϡ�/b.txt");
																//���ļ���Ϊ����Դ����������
			BufferedReader br1 = new BufferedReader(fin1);		//�����������ַ�������
			BufferedReader br2 = new BufferedReader(fin2);
			BufferedWriter bw3 = new BufferedWriter(new FileWriter("D:/JAVA/java_homework/homework/20171122/7.1�� ��дӦ�ó��򣬴Ӽ��̶�ȡ�û�����������ֽ����ݣ����䱣����ָ�����ļ��У����ļ��������ݶ�ȡ����������ʾ����Ļ�ϡ�/c.txt"));
																//�����������ַ������
			String s,s1,s2;	
			s1=br1.readLine();
			s2=br2.readLine();									//��ȡһ���ַ���
			while(s1!=null)
			{
				bw3.write(s1);									//���ַ���s1д���ļ�bw3��
				s1=br1.readLine();								//��ȡһ���ַ���
				bw3.newLine();									//д��س����з�
			}
			while(s2!=null)
			{
				bw3.write(s2);
				s2=br2.readLine();
				bw3.newLine();
			}
			br1.close();										//�ر�
			br2.close();
			bw3.close();
			System.out.println("�ļ��Ͳ��ɹ�");
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
