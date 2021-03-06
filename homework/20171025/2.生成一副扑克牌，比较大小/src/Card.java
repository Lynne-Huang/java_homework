/*
 * （1）	有两个private访问权限的字符串变量face和suit。face描述一张牌的牌面值（如：A、K、Q、J、10、9、8、7、6、5、4、3、2等），suit描述一张牌的花色（如：“梅花”、“黑桃”、“红桃”、“方块”）。
 * （2）	有一个public访问权限的构造方法，为类中的两个变量赋值
 * （3）	有一个protected访问权限的方法getFace()，得到扑克牌的牌面值
 * （4）	有一个protected访问权限的方法getSuit()，得到扑克牌的牌面值
 * （5）	有一个重写方法toString()，返回表示扑克牌的花色和牌面值字符串（如：“红桃A”，“方块J”）
 * 扩展：生成一副扑克牌，实现比大小函数
 */
public class Card {
	private String face;
	private	String suit;
	public Card(String aface,String asuit){
		setFace(aface);
		setSuit(asuit);
	}
	protected String getFace(){
		return face;
	}
	public void setFace(String aface){
		this.face = aface;
	}
	protected void setSuit(String asuit){
		this.suit = asuit;
	}
	public String getSuit(){
		return suit;
	}
	public String toString(){
		return "卡的数值和花色："+getSuit()+getFace();
	}
}
