public class EX05{
	static void greet(String name){
		System.out.println("Hi, " + name + "!");
	}
	
	static void greet(String name, int age){
		System.out.println("Hi, " + name + "! You are " + age + " years old");
	}
	public static void main(String[] args){
		greet("Kulani");
		greet("Kulani",21);
	}
}