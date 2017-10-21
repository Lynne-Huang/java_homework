import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;


public class TestComplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2. 编写刑事责任上完整的Java Application 程序 。
		 * 要求：1.编写复数Complex. 
		 * 2.编写主类TestComplex,将每对测试数据相加并显示结果，
		 * 三组测试的复数为：1+2i 和3+4i、1+2i 和1-2i、1+2i 和-1+2i。
		 * 其中，复数类Complex必须满足如下要求：
		 * （1）	复数类Complex的属性有：
		 * （2）	realPart:int型，代表复数的实部 。imaginPart:int型，代表复数的虚部。
		 * （3）	复数类Complex的方法有：Complex（）:构造函数，将复数的实部和虚部都置0。
		 * Complex（int r ,int i）:构造函数，将复数的实部初始化为r,将虚部初始化为I；
		 * complex complexAdd（Complex a）:
		 * 将当前复数对象与形参对象 a相加，所得的结果仍是一个复数对象 ，返回 给此方法的调用者。
		 * Public string  tostring()：
		 * 把当前复数对象的实部a，虚部b组合成“a+bi”的字符串形式;
		 * 若实部为0，虚部不为0，则返回“bi”;
		 * 若虚部为0，则返回”a”;
		 * */

		Complex c2 = new  Complex(3,4);
		Complex c3 = new  Complex(1,-2);
		Complex c4 = new  Complex(-1,2);
		c2 = c2.complexAdd(c2);
		c3 = c3.complexAdd(c3);
		c4 = c4.complexAdd(c4);
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
		
	}

}
