import java.util.Scanner;

public class workplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner chang = new Scanner(System.in);
		System.out.print(" ‰»Î≥§£∫");
		float length = chang.nextFloat();
		Scanner kuan = new Scanner(System.in);
		System.out.print(" ‰»ÎøÌ£∫");
		float wide = kuan.nextFloat();
		
		work1009 shu = new work1009(length,wide);
		shu.SetLength(length);	
		shu.SetWide(wide);
		shu.area();
		shu.perimeter();
		System.out.print(shu.toString());
	}

}
