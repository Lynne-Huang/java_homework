package test;
public class Graduate{
	public void printA(){
		System.out.println("�����ӡ����");
	}
	public Graduate(){
		System.out.println("���๹�췽��");
	}
}
class SubClass extends Graduate{
	public void printA(){
		System.out.println("�����ӡ����");
	}
	public SubClass(){System.out.println("���๹�췽��");}
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