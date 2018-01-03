package 学生管理系统;

public class course extends People {

	private int Cno;
	private String Cname;
	course(int CNo,String CName)
	{
		setCno(CNo);
		setName(CName);
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return Cname;
	}
	public void setName(String CName){
		this.Cname=CName;
	}

	@Override
	public int getNo() {
		// TODO Auto-generated method stub
		return Cno;
	}
	public void setCno(int CNo){
		this.Cno=CNo;
	}

}
