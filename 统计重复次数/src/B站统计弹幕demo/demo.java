package Bվͳ�Ƶ�Ļdemo;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class demo {
		public static void main(String[] args) throws IOException{
			try{
				FileReader fin = new FileReader("D:/����/c.txt");		/*""*/
																			//���ļ���Ϊ����Դ����������
				BufferedReader br1 = new BufferedReader(fin);		//�����������ַ�������//BufferReader��ȡ���������ݺ�BufferWriter������д�뻺����
				//BufferedWriter bw2 = new BufferedWriter(new FileWriter("D:/����/c.txt"));
																	//FileWriter�����ڽ��ַ���д��һ���ļ��е���
															//�����������ַ������
				String s0;	
				//s1=br1.readLine();									//��BufferReader�ķ���,��ȡһ���ַ���
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
		        /*for (Map.Entry<String,Integer> entry : map.entrySet()) 
		        {  
		            System.out.println("Key-value : " + entry.getKey() + "- "+ entry.getValue());  
		        }  */
		        System.out.println("\nTreeMap����-��key����");
		        Map<String,Integer> treeMap = new TreeMap<String,Integer>(map);
		        printMap(treeMap);
		        /*for (Entry<String, Integer> entry : treeMap.entrySet()) 
		        {  
		            System.out.println("Key-value : " + entry.getKey() + "- "+ entry.getValue());  
		        }  */
				br1.close();										//�ر�
				
			
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



