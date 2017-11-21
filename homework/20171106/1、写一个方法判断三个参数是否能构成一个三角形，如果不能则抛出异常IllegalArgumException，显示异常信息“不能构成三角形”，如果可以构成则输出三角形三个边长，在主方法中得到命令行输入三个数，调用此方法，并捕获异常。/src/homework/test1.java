package homework;

import java.util.Scanner;

/* 写一个方法判断三个参数是否能构成一个三角形，
 * 如果不能则抛出异常IllegalArgumException，
 * 显示异常信息“不能构成三角形”，如果可以构成则输出三角形三个边长，
 * 在主方法中得到命令行输入三个数，调用此方法，并捕获异常。
 * */
public class test1 {
	static void tri(int a,int b,int c)throws IllegalArgumentException{
		if(a>0&&b>0&&c>0){
			if((a+b>c)&&(a+c>b)&&(b+c>a)){
				System.out.println("三角形的表长为"+"a="+a+" b="+b+" c="+c);
		}
		else{
			throw new  IllegalArgumentException("a，b，c不能构成三角形");
		}
		}
		else{
			throw new  IllegalArgumentException("a，b，c不能构成三角形");
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = Integer.parseInt(args[2]);
			tri(a,b,c);
		}
		catch( IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}

}
