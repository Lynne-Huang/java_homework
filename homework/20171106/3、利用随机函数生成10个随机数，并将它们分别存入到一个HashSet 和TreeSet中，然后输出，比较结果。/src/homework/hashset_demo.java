package homework;
/*
 * 利用随机函数生成10个随机数，
 * 并将它们分别存入到一个HashSet 和TreeSet中，然后输出，比较结果。
 * @version 1.0 2017.11.22
 * @author Lynne_Huang
 */
import java.util.*;
public class hashset_demo {
	public static void main(String[] args){
		Random r=new Random();
		HashSet<Integer>hs=new HashSet<Integer>();
		while(hs.size()<10)
		{
			int num = r.nextInt(50)+1;
			hs.add(num);
		}
		for(Integer i:hs)
		{
			System.out.print(i+" ");
		}
	}
}
