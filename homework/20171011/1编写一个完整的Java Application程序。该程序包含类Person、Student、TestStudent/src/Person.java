/********************************************************
 * ①属性
 * name:String对象，表示一个人的姓名
 * sex:char类型，用来表示性别
 * id:String对象，表示身份证号
 * Phone：String对象，表示联系电话
 * email:String对象，表示E-mail地址
 * ②方法
 * Person(Name name,char sex,String id);构造方法
 * String getid();获得身份证号
 * void setEmail(String email):设置E-mail地址
 * void setPhone(String phone):设置联系电话
 * Public String toString():返回个人的各项信息，包括姓名、性别等上述属性。
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
		return"姓名"+getName()+"性别"+getSex()+"身份证号"+getId()+"联系电话"+getPhone()+"E-mail"+getEmail();
	}
}


