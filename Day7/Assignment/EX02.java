import java.util.Scanner;
public class EX02{
	static int cube(int number){
		return number*number*number;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int cubeResult = cube(num);
		System.out.println("Cube: " + cubeResult);
	}
}