package test;
public class Graduate{
	public void printA(){
		System.out.println("父类打印方法");
	}
	public Graduate(){
		System.out.println("父类构造方法");
	}
}
class SubClass extends Graduate{
	public void printA(){
		System.out.println("子类打印方法");
	}
	public SubClass(){System.out.println("子类构造方法");}
	public void printB(){
		super.printA();
		this.printA();
		printA();
	}
	public static void main(String [] args){
		SubClass s=new SubClass();
		s.printA();
		s.printB();
	}
}