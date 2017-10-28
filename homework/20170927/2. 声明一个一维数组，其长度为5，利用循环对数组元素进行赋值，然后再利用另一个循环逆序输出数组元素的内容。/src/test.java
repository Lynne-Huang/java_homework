
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//7. 声明一个一维数组，其长度为5，利用循环对数组元素进行赋值，然后再利用另一个循环逆序输出数组元素的内容。
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
