package test;

public abstract class shape2D {
	private String name;
	public shape2D(String name2) {
		// TODO Auto-generated constructor stub
		this.name=name2;
	}
	public abstract double area();
	public abstract double zc();
	public abstract String Display();
}
class Circle extends shape2D
{	double PI=Math.PI;
	float r;
	public Circle(String name2,float r){
		super(name2);
		this.r=r;
	}

	@Override
	public double area() {
		// TODO �Զ����ɵķ������
		return PI*r*r;
	}
	@Override
	public double zc() {
		// TODO �Զ����ɵķ������
		return 2*PI*r;
	}
	@Override
	public String Display() {
		// TODO �Զ����ɵķ������
		return "Բ��"+/*this.name*/"�뾶��"+r+",�ܳ���"+zc()+",�����"+area();//��ΰ����ָ���ȥ�����о�
	}
}
class Rec extends shape2D
{
	int length,wide;
	Rec(String name, int l,int w)
	{
		super(name);
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
		return "���ε�"/*+this.name2+*/+"��:"+length+",��:"+wide+",�ܳ���"+zc()+",�����"+area();
	}
	
}
