/********************************************************
 * ������
 * name:String���󣬱�ʾһ���˵�����
 * sex:char���ͣ�������ʾ�Ա�
 * id:String���󣬱�ʾ���֤��
 * Phone��String���󣬱�ʾ��ϵ�绰
 * email:String���󣬱�ʾE-mail��ַ
 * �ڷ���
 * Person(Name name,char sex,String id);���췽��
 * String getid();������֤��
 * void setEmail(String email):����E-mail��ַ
 * void setPhone(String phone):������ϵ�绰
 * Public String toString():���ظ��˵ĸ�����Ϣ�������������Ա���������ԡ�
 *********************************************************/
public class Person {
	private String name;
	private char sex;
	private String id;
	private String phone;
	private String email;
	Person(String name,char sex,String id){
		this.name = name;
		this.sex = sex;
		this.id = id;
		
	}
	String getId(){
		return id;
	}
	void setId(String Id){
		this.id=Id;
	}
	String getName(){
		return name;
	}
	void setName(String name){
		this.name = name;
	}
	char getSex(){
		
		return sex;
	}
	void setSex(char sex){
		this.sex = sex;
	}
	String getEmail(){
		return email;
	}
	void setEmail(String Email){
		this.email=Email;
	}
	String getPhone(){
		return phone;
	}
	void setPhone(String Phone){
		this.phone=Phone;
	}
	public String toString(){
		return"����"+getName()+"�Ա�"+getSex()+"���֤��"+getId()+"��ϵ�绰"+getPhone()+"E-mail"+getEmail();
	}
}


