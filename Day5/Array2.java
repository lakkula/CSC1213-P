import java.util.Scanner;
class Array2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[10];
		
		for(int i=0; i<numbers.length; i++){
			System.out.print("Enter the " + (i+1) + " number: ");
			numbers[i] = sc.nextInt();
		}
		
		for(int i=0; i<numbers.length; i++){
			System.out.println("The " + (i+1) + " number: " + numbers[i]);
		}
		
		String days[] = {"Monday","Tuesday","Wednesday","Thurseday",
		"Friday","Saturday","Sunday"};
		for(String day: days){
			System.out.println(day);
		}
	}
}