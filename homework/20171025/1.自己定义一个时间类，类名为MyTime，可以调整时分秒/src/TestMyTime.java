
public class TestMyTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTime time = new MyTime(11, 9, 16);
		System.out.println(time.toString());
		time.addSecond(50);
		time.addMinute(60);
		time.addHour(14);
		
	
		System.out.println(time.toString());
		time.subSecond(10);
		time.subMinute(20);
		time.subHour(3);
		System.out.println(time.toString());

	}

}
