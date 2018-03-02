package bilibili弹幕统计时间排序;//统计弹幕开始时间
/*程序思路
 * 分组->统计->排序
 * 将文件传入，因为要知道具体数据是什么此处选用字符流，字符流 java中字符编码是Unicode，可以识别奇怪的字符
 * 用字符流注意配合使用缓冲区
 * 将所有数据传入ArrayList(其实就是一个动态数组
 * 利用Map不可重复key的特点，键值来存储重复的次数
 * 对map排序treemap
 * 键值升序排序输出
 * */
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class readStream {


	public static void main(String[] args) throws IOException{
		try{
			long startTime=System.nanoTime();   //获取开始时间  
			FileReader fin = new FileReader("F:/JAVA/java_homework/统计重复次数/a.txt");
							//FileReader是用于从一个文件中读取字符流时主要的类。读取一个字节流并转化为代表Unicode字符的整型数值。
							//以文件名为数据源创建输入流
				BufferedReader br1 = new BufferedReader(fin);		//创建缓冲区字符输入流//BufferReader读取缓冲区数据和BufferWriter将数据写入缓冲区
																	//FileWriter是用于将字符流写入一个文件中的类
															//创建缓冲区字符输出流
				String s0;	
				ArrayList<String> a=new ArrayList<String>();
				while((s0=br1.readLine())!=null)
				{
					a.add(s0);
				}
				System.out.println(a.size());
				System.out.println("\nMap排序");  
				Map<String,Integer> map=new HashMap<String,Integer>();
				for(String temp : a)
				{
						Integer count = (Integer) map.get(temp);
						map.put(temp, (count == null )?1:count+1);	
				}
		        printMap(map);
		        System.out.println("\n--------------TreeMap排序-以key排序-------------------------");
		        Map<String,Integer> treeMap = new TreeMap<String,Integer>(map);
		        printMap(treeMap);
		        
		        System.out.println("\n--------------Map  value排序-------------------------");
		        sortMap(treeMap);
				br1.close();								//关闭
			

				long endTime=System.nanoTime(); //获取结束时间  
				System.out.println("总弹幕数："+a.size()+"\nbilibili- ( ゜- ゜)つロ 乾杯~");
				System.out.println("程序运行时间： "+(endTime-startTime)/1000000+"ms"); 
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

	        //使用链表来对集合进行排序，使用LinkedList，利于插入元素
	        List<Map.Entry<String, Integer>> result = new LinkedList<>(mapEntries);
	        //自定义比较器来比较链表中的元素
	        Collections.sort(result, new Comparator<Entry<String, Integer>>() {
	            //基于entry的值（Entry.getValue()），来排序链表
	            @Override
	            public int compare(Entry<String, Integer> o1,Entry<String, Integer> o2) {
	                
	                return o1.getValue().compareTo(o2.getValue()) ;
	            }
	});
	        //将排好序的存入到LinkedHashMap(可保持顺序)中，需要存储键和值信息对到新的映射中。
	        Map<String,Integer> linkMap = new LinkedHashMap<>();
	        for(Entry<String,Integer> newEntry :result){
	            linkMap.put(newEntry.getKey(), newEntry.getValue());            
	        }
	        //根据entrySet()方法遍历linkMap
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
