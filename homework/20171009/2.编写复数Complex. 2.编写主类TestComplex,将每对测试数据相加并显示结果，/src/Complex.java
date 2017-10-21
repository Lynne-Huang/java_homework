
public class Complex {
	private int realPart;
	private int imaginPart;
	
	public  Complex()
	{
		realPart=0;
		imaginPart=0;
	}
	public  Complex(int r,int i)
	{
		this.imaginPart=i;
		this.realPart=r;
	}
	public int getRealPart()
	{
		return realPart;
	}
	public void setRealPart(int r)
	{
		realPart=r;
	}
	public int getImaginPart()
	{
		return imaginPart;
	}
	public void setImaginPart(int i)
	{
		imaginPart = i;
	}
	public Complex complexAdd(Complex a)
	{
		a.imaginPart += 2;
		a.realPart += 1;
		return a;
	}
	public String toString()
	{
		if(realPart==0)
			return ""+imaginPart+"i";
		else if(imaginPart==0)
			return realPart+"";
		else
			return realPart+"+"+imaginPart+"i";
	}
}
