/*1��	��дһ��Java����
 * ����һ��MyPlus�࣬
 * MyPlus��������plus()������
 * �ֱ�Բ�ͬ�Ĳ���������͡�*/
public class MyMath {
	int MAX(int a,int b,int c)
	{
		int max=a;
		if(b>=max)
			max=b;
		if(c>=max)
			max=c;
		return max;
		
	}
	int MAX(int a,int b,int c,int d)
	{
		int max=a;
		if(b>=max)
			max=b;
		if(c>=max)
			max=c;
		if(d>=max)
			max=d;
		
		return max;
	}
	int MAX(int [] a )
	{
		int max = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		return max;
	}

}
