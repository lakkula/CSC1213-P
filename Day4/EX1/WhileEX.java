import java.util.Scanner;
class WhileEX{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int sum = 0;
		int num2 = 1;
		while(num2<=num){
			sum = sum + num2;
			num2++;
		}
		System.out.println("Summation of numbers from 0 to " + num + " = " + sum);
	}
}