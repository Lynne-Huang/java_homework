
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//7. ����һ��һά���飬�䳤��Ϊ5������ѭ��������Ԫ�ؽ��и�ֵ��Ȼ����������һ��ѭ�������������Ԫ�ص����ݡ�
		int a[]=new int[5];
		for(int i = 0;i<a.length;i++)
		{
			a[i]=i;
		}
		for(int i = a.length-1;i>=0.;i--)
		{
			System.out.println("a["+i+"]="+i);
		}
	}

}
