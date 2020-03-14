package Equals;

public class EqualsTest {

	public static void main(String[] args) {
		student s1 = new student(111,"Xiapu No.1 High School");
		student s2 = new student(222,"Xiapu No.1 High School");
		System.out.println(s1.equals(s2));

	}

}

class student{
	int num;
	String school;
	
	//无参函数
	public student() {} 
	
	//有参函数
	public student(int num, String school) { 
		this.num = num;
		this.school = school;
	}
	
	//重写equals方法
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof student)) //后一项可以是：(getClass() != obj.getClass())
			return false;
		if (this == obj)
			return true;

		student s = (student) obj;//向下转型
		if (this.num == s.num && (this.school).equals(s.school)) {
			return true;
		}
		return false;
	}
		
}
