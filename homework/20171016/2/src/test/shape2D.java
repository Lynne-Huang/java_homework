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
		// TODO 自动生成的方法存根
		return PI*r*r;
	}
	@Override
	public double zc() {
		// TODO 自动生成的方法存根
		return 2*PI*r;
	}
	@Override
	public String Display() {
		// TODO 自动生成的方法存根
		return "圆的"+/*this.name*/"半径："+r+",周长："+zc()+",面积："+area();//如何把名字附上去，待研究
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
		// TODO 自动生成的方法存根
		return length*wide;
	}
	@Override
	public double zc() {
		// TODO 自动生成的方法存根
		return 2*(length+wide);
	}
	@Override
	public String Display() {
		// TODO 自动生成的方法存根
		return "矩形的"/*+this.name2+*/+"长:"+length+",宽:"+wide+",周长："+zc()+",面积："+area();
	}
	
}
