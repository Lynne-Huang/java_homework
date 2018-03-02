package bilibili��Ļͳ��ʱ������;//ͳ�Ƶ�Ļ��ʼʱ��
/*����˼·
 * ����->ͳ��->����
 * ���ļ����룬��ΪҪ֪������������ʲô�˴�ѡ���ַ������ַ��� java���ַ�������Unicode������ʶ����ֵ��ַ�
 * ���ַ���ע�����ʹ�û�����
 * ���������ݴ���ArrayList(��ʵ����һ����̬����
 * ����Map�����ظ�key���ص㣬��ֵ���洢�ظ��Ĵ���
 * ��map����treemap
 * ��ֵ�����������
 * */
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class readStream {


	public static void main(String[] args) throws IOException{
		try{
			long startTime=System.nanoTime();   //��ȡ��ʼʱ��  
			FileReader fin = new FileReader("F:/JAVA/java_homework/ͳ���ظ�����/a.txt");
							//FileReader�����ڴ�һ���ļ��ж�ȡ�ַ���ʱ��Ҫ���ࡣ��ȡһ���ֽ�����ת��Ϊ����Unicode�ַ���������ֵ��
							//���ļ���Ϊ����Դ����������
				BufferedReader br1 = new BufferedReader(fin);		//�����������ַ�������//BufferReader��ȡ���������ݺ�BufferWriter������д�뻺����
																	//FileWriter�����ڽ��ַ���д��һ���ļ��е���
															//�����������ַ������
				String s0;	
				ArrayList<String> a=new ArrayList<String>();
				while((s0=br1.readLine())!=null)
				{
					a.add(s0);
				}
				System.out.println(a.size());
				System.out.println("\nMap����");  
				Map<String,Integer> map=new HashMap<String,Integer>();
				for(String temp : a)
				{
						Integer count = (Integer) map.get(temp);
						map.put(temp, (count == null )?1:count+1);	
				}
		        printMap(map);
		        System.out.println("\n--------------TreeMap����-��key����-------------------------");
		        Map<String,Integer> treeMap = new TreeMap<String,Integer>(map);
		        printMap(treeMap);
		        
		        System.out.println("\n--------------Map  value����-------------------------");
		        sortMap(treeMap);
				br1.close();								//�ر�
			

				long endTime=System.nanoTime(); //��ȡ����ʱ��  
				System.out.println("�ܵ�Ļ����"+a.size()+"\nbilibili- ( �b- �b)�ĥ� Ǭ��~");
				System.out.println("��������ʱ�䣺 "+(endTime-startTime)/1000000+"ms"); 
		}
		catch(IOException ioe)
		{
			System.out.println(ioe);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	public static void sortMap(Map<String,Integer>map){
		 Set<Map.Entry<String,Integer>> mapEntries = map.entrySet();

	        //ʹ���������Լ��Ͻ�������ʹ��LinkedList�����ڲ���Ԫ��
	        List<Map.Entry<String, Integer>> result = new LinkedList<>(mapEntries);
	        //�Զ���Ƚ������Ƚ������е�Ԫ��
	        Collections.sort(result, new Comparator<Entry<String, Integer>>() {
	            //����entry��ֵ��Entry.getValue()��������������
	            @Override
	            public int compare(Entry<String, Integer> o1,Entry<String, Integer> o2) {
	                
	                return o1.getValue().compareTo(o2.getValue()) ;
	            }
	});
	        //���ź���Ĵ��뵽LinkedHashMap(�ɱ���˳��)�У���Ҫ�洢����ֵ��Ϣ�Ե��µ�ӳ���С�
	        Map<String,Integer> linkMap = new LinkedHashMap<>();
	        for(Entry<String,Integer> newEntry :result){
	            linkMap.put(newEntry.getKey(), newEntry.getValue());            
	        }
	        //����entrySet()��������linkMap
	        for(Map.Entry<String, Integer> mapEntry : linkMap.entrySet()){
	            System.out.println("key:"+mapEntry.getKey()+"  value:"+mapEntry.getValue());
	        }
	}
	public static void printMap(Map<String, Integer> map) {
        for (Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator(); iterator.hasNext();) {
			Entry<String, Integer> entry = iterator.next();
			System.out.println("Key-value : " + entry.getKey() + "- "+ entry.getValue());
		}
	 
	}
}
