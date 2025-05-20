import java.util.Scanner;
public class EX04{
	static void factorial(int number){
		int fact = 1;
		for(int i=1; i<=number;i++){
			fact = fact * i;
		}
		System.out.println("Factorial: " + fact);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		factorial(num);
	}
}