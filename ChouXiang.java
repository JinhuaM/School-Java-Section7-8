abstract class Shape{
 public abstract float area();
 public abstract void printArea();
}

class Rectangle extends Shape{
	int width;
	int length;
	public Rectangle(int newWidth,int newLength){
	width=newWidth;
	length=newLength;
}
	public float area(){
	return width*length;
}
	public void printArea(){
	System.out.println("����һ�����Σ��ҵ�����ǣ�"+area());
}
}

class Circle extends Shape{
	final float pi=3.14F;
	int radius;
	public Circle(int newRadius){
	radius=newRadius;
}
	public float area(){
	return radius*radius*pi;
}
	public void printArea(){
	System.out.println("����һ��Բ�Σ��ҵ�����ǣ�"+area());
}
}

class ChouXiang{
 public static void main(String args[]){
	Rectangle s1=new Rectangle(3,4);
	s1.printArea();
	Circle s2=new Circle(2);
	s2.printArea();
}
}