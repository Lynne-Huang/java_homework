package 学生管理系统;

public class Student extends People{
	private int sno;
	private String sname;
	
	Student(int Sno,String Sname)
	{
		SetName(Sname);
		SetSno(Sno);
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return sname;
	}
	public void SetName(String Sname)
	{
		if(Sname!="\0")
		this.sname=Sname;
	}
	
	@Override
	public int getNo() {
		// TODO Auto-generated method stub
		return sno;
	}
	public void SetSno(int Sno)
	{
		if(Sno!=0)
		this.sno=Sno;
	}
	

}
