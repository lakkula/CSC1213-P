import java.util.Scanner;
class EX03{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		String fname = sc.nextLine();
		
		System.out.print("Enter your last name: ");
		String lname = sc.next();
		
		System.out.print("Enter your marks: ");
		int marks = sc.nextInt();
		
		System.out.println("Fullname: " + fname + "\n" + "Lastname: " + lname + "\n" + "Marks: " + marks);
	}
}