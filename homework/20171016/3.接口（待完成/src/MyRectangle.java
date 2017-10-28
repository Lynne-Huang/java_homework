/*①属性
 * Width :double 类型，表示矩形的长。
 * Height:double 类型，表示矩形的高。
 * ②方法
 * MyRectangle(double w ,double h) 构造函数。
 * toString()方法：输出矩形的描述信息， 如“width=1.0，height=2.0 
*/
public class MyRectangle implements ShapeArea {
	double Hight;
	double Width;
	MyRectangle(double w ,double h){
		this.Hight = h;
		this.Width = w;
	}
	@Override
	public Double getArea() {
		// TODO Auto-generated method stub
		return Hight*Width;
	}

	@Override
	public Double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(Width+Hight);
	}
	public String toString(){
		return "height："+Hight+"\twidth："+Width+"\t面积："+getArea()+"\t\t周长："+getPerimeter();
	}

}
