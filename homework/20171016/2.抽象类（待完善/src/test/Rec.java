package test;

class Rec extends shape2D
{
	int length,wide;
	String name3;
	Rec(String name2, int l,int w)
	{
		super(name2);
		name3=name2;
		this.length=l;
		this.wide=w;
	}
	
	public double area() {
		// TODO �Զ����ɵķ������
		return length*wide;
	}
	@Override
	public double zc() {
		// TODO �Զ����ɵķ������
		return 2*(length+wide);
	}

	@Override
	public String Display() {
		// TODO �Զ����ɵķ������
		return name3+"��:"+length+",��:"+wide+",�ܳ���"+zc()+",�����"+area();
	}
}