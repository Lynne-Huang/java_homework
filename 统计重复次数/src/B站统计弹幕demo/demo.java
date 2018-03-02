package B站统计弹幕demo;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class demo {
		public static void main(String[] args) throws IOException{
			try{
				FileReader fin = new FileReader("D:/桌面/c.txt");		/*""*/
																			//以文件名为数据源创建输入流
				BufferedReader br1 = new BufferedReader(fin);		//创建缓冲区字符输入流//BufferReader读取缓冲区数据和BufferWriter将数据写入缓冲区
				//BufferedWriter bw2 = new BufferedWriter(new FileWriter("D:/桌面/c.txt"));
																	//FileWriter是用于将字符流写入一个文件中的类
															//创建缓冲区字符输出流
				String s0;	
				//s1=br1.readLine();									//是BufferReader的方法,读取一行字符串
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
		        /*for (Map.Entry<String,Integer> entry : map.entrySet()) 
		        {  
		            System.out.println("Key-value : " + entry.getKey() + "- "+ entry.getValue());  
		        }  */
		        System.out.println("\nTreeMap排序-以key排序");
		        Map<String,Integer> treeMap = new TreeMap<String,Integer>(map);
		        printMap(treeMap);
		        /*for (Entry<String, Integer> entry : treeMap.entrySet()) 
		        {  
		            System.out.println("Key-value : " + entry.getKey() + "- "+ entry.getValue());  
		        }  */
				br1.close();										//关闭
				
			
		}
		catch(IOException ioe)
		{
			System.out.println(ioe);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
		public static void printMap(Map<String, Integer> map) {
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Key-value : " + entry.getKey() + "- "
			                    + entry.getValue());
        }	 
	}
}



