import java.util.*;;
/*
 * 3、利用HashMap类对象存储公司电话号码簿，
 * 其中包含公司的电话号码和公司名称，
 * 然后删除一个公司和查询一个公司。*/
public class HashMap_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		
		map.put("本田", "12346");
		map.put("名爵", "54855");
		map.put("奥迪", "151584");
		map.put("奔驰", "154752");
		map.put("三菱", "1545245");
		
		map.remove("本田");
		Set set = map.keySet();
		Iterator it =set.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			System.out.println("公司名称:"+obj+"   "+"公司电话:"+map.get(obj));
		}
		System.out.println();
		System.out.println("请输入要查询的公司名称:");
		Scanner scanner =new Scanner(System.in);
		String s=scanner.next();
		System.out.println("公司号码是：");
		System.out.println(map.get(s));
		System.out.println();
		
	}

}
