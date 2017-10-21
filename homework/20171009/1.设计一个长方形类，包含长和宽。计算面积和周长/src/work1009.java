import java.io.PrintStream;

public class work1009 {
	private float length;
	private float wide;
	public work1009(float i,float w)
	{
		length = i;
		wide = w;
	}
	public float GetLength()
	{
		return length;
	}
	public void SetLength(float i)
	{
		if(i>0)
			length = i;
		else
			System.out.print("ERROR");
	}public float GetWide()
	{
		return wide;
	}
	public void SetWide(float w)
	{
		if(w>0)
			wide = w;
		else
			System.out.print("ERROR");
	}
	float perimeter()
	{
		return (length+wide)*2;
	}
	float area()
	{
		
		return length*wide;
	}
	public String toString()
	{
		return "长:"+GetLength()+"\t宽:"+GetWide()+"\t周长:"+perimeter()+"\t\t面积:"+area();
	}
}
