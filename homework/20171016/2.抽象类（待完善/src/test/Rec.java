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
		return name3+"长:"+length+",宽:"+wide+",周长："+zc()+",面积："+area();
	}
}