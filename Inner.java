class School{
	String name;
public class Student{
	String name;
	int age;
  public Student(String schoolName,String studentName,int newAge){
	School.this.name=schoolName;
	this.name=studentName;
	this.age=newAge;
}
  public void output(){
	System.out.println("ѧУ"+School.this.name);
	System.out.println("������"+this.name);
	System.out.println("���䣺"+this.age);
}
}
 public void output(){
	Student stu=new Student("����ѧԺ","����",24);
	stu.output();
}
}

public class Inner{
 public static void main(String[] args){
	System.out.println("--ͨ���ⲿ���Ա�����ڲ����Ա--");
	School a=new School();
	a.output();
	System.out.println("--ֱ�ӷ����ڲ����Ա--");
	School.Student b=a.new Student("����ѧԺ","����",23);
	b.output();
}
}