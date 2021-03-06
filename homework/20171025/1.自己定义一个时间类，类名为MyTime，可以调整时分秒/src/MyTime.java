/*
 * 1.	自己定义一个时间类，类名为MyTime，
 * 有三个整型成员，时hour,分minute，秒second，
 * 为了保证数据的安全性，这三个成员变量应声明为私有，
 * 提供对外公共函数，并验证有效性。为MyTime类定义构造方法，
 * 以方便创建对象时初始化成员变量。再定义toString方法，
 * 用于将时间信息打印出来为Mytime类添加以下方法
 * addSecond(int sec),addMinute(int min),addHour(int  hour), 
 * subSecond(int sec),subMinute(int min),subHour(int  hour)。
 * 分别对时、分、秒进行加减运算。
 */
public class MyTime {
	private int hour;
	private int minute;
	private int second;
	MyTime(int ahour,int aminute,int asecond ){
		setHour(ahour);
		setMinute(aminute);
		setSecond(asecond);
	}
	public int getHour(){
		return hour;
	}
	public void setHour(int ahour){
		if(ahour>=0&&ahour<24)
			this.hour=ahour;
		else
			System.out.println("输入错误");
	}
	public int getMinute(){
		return minute;
	}
	public void setMinute(int aminute){
		if(aminute>=0&&aminute<60)
			this.minute=aminute;

	}
	public int getSecond(){
		return second;
	}
	public void setSecond(int asecond){
		if(asecond>=0&&second<60)
			this.second=asecond;

	}
	public String toString(){
		return "此刻时间为"+hour+"点"+minute+"分"+second+"秒";
	}
	public void addSecond(int sec){
		second += sec;
		if(second>=60){
			addMinute(second/60);
			second -= 60;
		}
			
	}
	public void addMinute(int min){
		minute += min;
		if(minute>=60){
			addHour(minute/60);
			minute -= 60;
		}
			
	}
	public void addHour(int  ahour){
		hour += ahour;
		if(hour>=24)
			hour -= 24;
	}
	public void subSecond(int sec){
		second-=sec;
		if(second<0){
			subMinute(second/60+1);
			second += 60;
		}
	}
	public void subMinute(int min){
		minute -= min;
		if(minute<0){
			subHour(minute/60+1);
			minute += 60;
		}
	}
	public void subHour(int  ahour){
		hour -= ahour;
		if(hour<0)
			hour += 24;
		
	}
}
