import java.util.*;;
/*
 * 3������HashMap�����洢��˾�绰���벾��
 * ���а�����˾�ĵ绰����͹�˾���ƣ�
 * Ȼ��ɾ��һ����˾�Ͳ�ѯһ����˾��*/
public class HashMap_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		
		map.put("����", "12346");
		map.put("����", "54855");
		map.put("�µ�", "151584");
		map.put("����", "154752");
		map.put("����", "1545245");
		
		map.remove("����");
		Set set = map.keySet();
		Iterator it =set.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			System.out.println("��˾����:"+obj+"   "+"��˾�绰:"+map.get(obj));
		}
		System.out.println();
		System.out.println("������Ҫ��ѯ�Ĺ�˾����:");
		Scanner scanner =new Scanner(System.in);
		String s=scanner.next();
		System.out.println("��˾�����ǣ�");
		System.out.println(map.get(s));
		System.out.println();
		
	}

}
