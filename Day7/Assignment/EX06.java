import java.util.Scanner;
public class EX06{
	static double average(int a, int b, int c){
		return (a + b + c) / 3.0;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		System.out.print("Enter the third number: ");
		int num3 = sc.nextInt();
		double aveResult = average(num1,num2,num3);
		System.out.println("Average: " + aveResult);
	}
}