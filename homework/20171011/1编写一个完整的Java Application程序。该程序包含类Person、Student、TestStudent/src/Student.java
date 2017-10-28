/*
 *  从Person类派生，增加了以下的属性和方法：
 *  ①属性
 *  sNo:long类型，表示学生的学号。
 *  sClass:String对象，表示学生的班级。
 *  ②方法
 *  Student(long sNo,String name,Char sex,String id):构造方法
 *  SetClass(String sClass):设置学生的班级信息
 *  Public String toString():返回学生的各项信息，包括学号、班级、姓名等上述属性
 *  
 */
public class Student extends Person {
	Student(String name, char sex, String id,long sNo) {
		super(name, sex, id);
		this.sNo = sNo;
		// TODO Auto-generated constructor stub
	}
	private long sNo;
	private String sClass;
	
	public long getsNo() {
	    	return sNo;
	    }
	public void setlong (long sNo){
		this.sNo = sNo;
	}
	
	public String getsClass(){
		return sClass;
	}
	public void setsClass(String sClass){
		this.sClass=sClass;
	}
	public String toString(){
		return"学号:"+getsNo()+"\n班级:"+getsClass()+"\n姓名:"+getName()+"\n性别:"+getSex()+"\n身份证号:"+getId()+"\n联系电话:"+getPhone()+"\nE-mail:"+getEmail();
	}
}