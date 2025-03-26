import java.util.Scanner;
class EX03{
	public static void main(String[] args){
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = ob.nextInt();
		
		if(num>0){
			System.out.println("The number is possitive");
		}else if(num<0){
			System.out.println("The number is negative");
		}else{
			System.out.println("The number is zero");
		};
	}
}