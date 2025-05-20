import java.util.Scanner;
public class EX03{
	static void checkVotingEligibility(int age){
		if(age>=18){
			System.out.println("Eligible to vote");
		}else{
			System.out.println("Not eligible");
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		checkVotingEligibility(age);
	}
}