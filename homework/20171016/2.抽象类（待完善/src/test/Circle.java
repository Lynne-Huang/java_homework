package test;

public class Circle extends shape2D{
	double PI=Math.PI;
	float r;
	String name3;
	public Circle(String name2,float r){
		super(name2);
		name3=name2;//感觉有别的更好的方法，以后在想
		this.r=r;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
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
		return name3+"半径："+r+",周长："+zc()+",面积："+area();//如何把名字附上去，待研究
	}

}
