import java.util.Scanner;
class EX04{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		String fname = sc.nextLine();
		
		System.out.print("Enter your last name: ");
		String lname = sc.next();
		
		System.out.print("Enter your Reg no: ");
		String regno = sc.next();
		
		System.out.print("Enter your Age: ");
		int age = sc.nextInt();
		
		System.out.print("Enter your Sex: ");
		char sex = sc.next().charAt(0);
		
		System.out.print("Enter your Mobile number: ");
		long mnumber = sc.nextLong();
		
		System.out.print("Enter your GPA: ");
		double gpa = sc.nextDouble();
		
		System.out.println("Fullname: " + fname + "\n" + "Lastname: " + lname + "\n" + "Reg no: " + regno + "\n" + 
		"Age: " + age + "\n" +  "Sex: " + sex + "\n" +  "Mobile number: " + mnumber + "\n" +  "GPA: " + gpa);
	}
}