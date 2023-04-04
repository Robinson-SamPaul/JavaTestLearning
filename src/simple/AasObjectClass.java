package simple;

public class AasObjectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(1, "Sam");
		System.out.println(s.rollNo + " " + s.name);
		System.out.println(s);
//		System.out.println(s.toString()); // by default it'll call tostring methods
		System.out.println(s.hashCode());
		System.out.println(s.getClass());
		System.out.println(s.getClass().getName());
	}

}

class Student {
	int rollNo;
	String name;
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
}
