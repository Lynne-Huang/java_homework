/*������
 * Width :double ���ͣ���ʾ���εĳ���
 * Height:double ���ͣ���ʾ���εĸߡ�
 * �ڷ���
 * MyRectangle(double w ,double h) ���캯����
 * toString()������������ε�������Ϣ�� �硰width=1.0��height=2.0 
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
		return "height��"+Hight+"\twidth��"+Width+"\t�����"+getArea()+"\t\t�ܳ���"+getPerimeter();
	}

}
