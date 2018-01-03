package 学生管理系统;

public class Teacher extends People{
	
	private int Tno;
	private String Tname;
	
	Teacher(int TNo,String TName){
		setTNo(TNo);
		setTName(TName);
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return Tname;
	}
	public void setTName(String TName){
		this.Tname=TName;
	}
	@Override
	public int getNo() {
		// TODO Auto-generated method stub
		return Tno;
	}
	public void setTNo(int TNo){
		this.Tno=TNo;
	}

}
