/*
 *   ����������Ϣ����һ��Student����aStudent��
 *   ���������»�
 *   �Ա���
 *   ���֤�ţ�22033198807070333
 *   ѧ�ţ�2008002
 *   ������E-mail:gzdx@126.com
 *   ������ϵ�绰:88078549
 *   ���������aStudent �ĸ�����Ϣ��
 */
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student aStudent= new Student("���� �� ",'��',"22033198807070333",2008002);
		aStudent.setEmail("gzdx@126.com");
		aStudent.setPhone("88078549");
		aStudent.setsClass("3��");
		System.out.println(aStudent.toString());

		
	}

}
