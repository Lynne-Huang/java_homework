import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;


public class TestComplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2. ��д����������������Java Application ���� ��
		 * Ҫ��1.��д����Complex. 
		 * 2.��д����TestComplex,��ÿ�Բ���������Ӳ���ʾ�����
		 * ������Եĸ���Ϊ��1+2i ��3+4i��1+2i ��1-2i��1+2i ��-1+2i��
		 * ���У�������Complex������������Ҫ��
		 * ��1��	������Complex�������У�
		 * ��2��	realPart:int�ͣ���������ʵ�� ��imaginPart:int�ͣ����������鲿��
		 * ��3��	������Complex�ķ����У�Complex����:���캯������������ʵ�����鲿����0��
		 * Complex��int r ,int i��:���캯������������ʵ����ʼ��Ϊr,���鲿��ʼ��ΪI��
		 * complex complexAdd��Complex a��:
		 * ����ǰ�����������βζ��� a��ӣ����õĽ������һ���������� ������ ���˷����ĵ����ߡ�
		 * Public string  tostring()��
		 * �ѵ�ǰ���������ʵ��a���鲿b��ϳɡ�a+bi�����ַ�����ʽ;
		 * ��ʵ��Ϊ0���鲿��Ϊ0���򷵻ء�bi��;
		 * ���鲿Ϊ0���򷵻ء�a��;
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
