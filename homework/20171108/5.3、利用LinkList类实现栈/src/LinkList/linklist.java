package LinkList;
import java.util.*;
/*2、利用LinkList类实现栈*/
public class linklist {
	private LinkedList list = new LinkedList();
	public void add(Object obj){
		list.add(obj);
	}
	public Object get(){
		return list.removeLast();
	}
	public boolean isEmpty(){
		return list.isEmpty();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linklist alist=new linklist();
		alist.add("123");
		alist.add("456");
		alist.add("789");
		while(!alist.isEmpty()) {
			System.out.println(alist.get());
		}

	}

}
