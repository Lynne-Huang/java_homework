/*
 *   ①用以下信息生成一个Student对象aStudent。
 *   姓名：刘德华
 *   性别：男
 *   身份证号：22033198807070333
 *   学号：2008002
 *   ②设置E-mail:gzdx@126.com
 *   设置联系电话:88078549
 *   ③输出对象aStudent 的各项信息。
 */
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student aStudent= new Student("刘德 华 ",'男',"22033198807070333",2008002);
		aStudent.setEmail("gzdx@126.com");
		aStudent.setPhone("88078549");
		aStudent.setsClass("3班");
		System.out.println(aStudent.toString());

		
	}

}
