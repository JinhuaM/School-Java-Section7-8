import java.text.DecimalFormat;
interface Shape{
	float pi=3.14F;
	double area();
	double volume();
}
class Cylinder implements Shape{
	private double radius;
	private int height;
	public Cylinder(int r,int h){
	radius=r;
	height=h;
}
	public double area(){
	return pi*radius*radius*2+2*pi*radius*height;
}
	public double volume(){
	return pi*radius*radius*height;
}
}

class MyInterface{
 public static void main(String args[]){
	Cylinder a=new Cylinder(2,3);
	DecimalFormat myFormat=new DecimalFormat("0.00");
	System.out.println("Բ����������"+myFormat.format(a.area()));
	System.out.println("Բ����������"+myFormat.format(a.volume()));
}
}