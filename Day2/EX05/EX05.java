import java.util.Scanner;
class EX05{
	public static void main(String[] args){
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = ob.nextInt();
		
		if(num%2 == 0){
			System.out.println(num + " is an Even number");
		}else{
			System.out.println(num + " is an odd number");
		}
	}
}