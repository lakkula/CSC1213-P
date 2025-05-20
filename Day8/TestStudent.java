class Student{
	int id;
	String name;
	
	public Student(int i, String n){
		this.id = i;
		this.name = n;
	}
}
class TestStudent{
	public static void main(String[] args){
		Student s1 = new Student(101,"Kulani");
		System.out.println(s1.id + " " + s1.name);
	}
}