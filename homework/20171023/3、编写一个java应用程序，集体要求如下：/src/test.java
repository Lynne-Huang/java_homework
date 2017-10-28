
public class test {
	public static void testSpeakHello(people speak){
		speak.SpeakHello();
	}
	public static void testAverageHeight(people hight){
		hight.AverageHeight();
	}
	public static void testAverageWeight(people weight){
		weight.AverageWeight();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChinaPeople c = new ChinaPeople();
		AmericanPeople a = new AmericanPeople();
		testSpeakHello(a);
		testAverageHeight(a);
		testAverageWeight(a);
		a.AmericanBoxing();
		
		testSpeakHello(c);
		testAverageHeight(c);
		testAverageWeight(c);
		c.ChinaKongfu();
	}

}
