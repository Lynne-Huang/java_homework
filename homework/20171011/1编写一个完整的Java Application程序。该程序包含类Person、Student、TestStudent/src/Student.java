/*
 *  ��Person�����������������µ����Ժͷ�����
 *  ������
 *  sNo:long���ͣ���ʾѧ����ѧ�š�
 *  sClass:String���󣬱�ʾѧ���İ༶��
 *  �ڷ���
 *  Student(long sNo,String name,Char sex,String id):���췽��
 *  SetClass(String sClass):����ѧ���İ༶��Ϣ
 *  Public String toString():����ѧ���ĸ�����Ϣ������ѧ�š��༶����������������
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
		return"ѧ��:"+getsNo()+"\n�༶:"+getsClass()+"\n����:"+getName()+"\n�Ա�:"+getSex()+"\n���֤��:"+getId()+"\n��ϵ�绰:"+getPhone()+"\nE-mail:"+getEmail();
	}
}