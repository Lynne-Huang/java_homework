import java.util.*;
public class select {
	public static void main(String[] args){
		String text="Java is certainly a good programming language. "+
		"Java was never just a language. Java is a whole platform. "+
		"Java has a lot of nice language features. "+
		"Java 2D was designed so that simple operations are simple and complex operations are feasible.";
		
		int count=0;
		int flag[]={0,0,0};
		Map hashMap=new HashMap();
		StringTokenizer st=new StringTokenizer(text,". ");
		String key[]={"Java","language","simple"};
		while(st.hasMoreTokens()){
			String k=st.nextToken();
			for(int i=0;i<3;i++){
				if(k.equals(key[i])){
					flag[i]=1;
					if(hashMap.get(k)!=null){
						count=((Integer)hashMap.get(k)).intValue();
						count++;
						hashMap.put(k, new Integer(count));
						}
					else{
						hashMap.put(k, new Integer(1));
						}
					}
				}
			}
		for(int i=0;i<3;i++){
			if(flag[i]==0)
				hashMap.put(key[i], new Integer(0));
			}
		Map map=new TreeMap(hashMap);
		Set set=map.entrySet();
		Iterator iterator=set.iterator();
		System.out.println("��Ҫͳ�Ƶ��ı�Ϊ��");
		System.out.println(text);
		System.out.println("����ΪҪͳ�Ƶĵ��ʼ����ֵĴ���(�������Ӹߵ�������)��");
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
