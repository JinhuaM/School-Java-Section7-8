/**
�����������һ��ѧ�����࣬������һ���������ԡ�����˽�����ԣ�7�����������Ե���introduce()��������ʾѧ���������������ϵ��
*@author ������ѧ��<br/>
*Date:2018-01-15<br/>
*@version 2.3<br/>
*@since JDK1.7<br/>
*/

public class GdufStudent{
 /**˽������name,�ַ�����
*/
private String name;
/** ˽������age,������
*/
private int age;
/** ��������dept���ַ�����
*/
public String dept;
/** ��������������name����
*/
public void setName(String newName)
{
	name=newName;
}
/**��������������name����
*/
public String getName(){
	return name;
}
/** ��������������age����
*/
public void setAge(int newAge){
	age=newAge;
}
/** ��������������age����
*/
public int getAge(){
	return age;
}
/** ��������������dept����
*/
public void setDept(String newDept){
	dept=newDept;
}
/** ��������������dept����
*/
public String getDept(){
	return dept;
}
/**������������ʾ�������Ե�ֵ
*/
public void introduce(){
	System.out.println("�ҵ�������"+getName());
	System.out.println("�ҵ�������"+getAge());
	System.out.println("�ҵ�ϵ��"+getDept());
}
}