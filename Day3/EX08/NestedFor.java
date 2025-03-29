import java.util.Scanner;
class NestedFor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value for counter 1: ");
		int counter1 = sc.nextInt();
		System.out.print("Enter the value for counter 2: ");
		int counter2 = sc.nextInt();
		
		for(int i = 0; i<counter1; i++){
			System.out.println("Value for i: " + i);
			for(int j = 0; j<counter2; j++){
			System.out.println("Value for j: " + j);
			}
			System.out.println();
		}
	}
}