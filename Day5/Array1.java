import java.util.Scanner;
class Array1{
	public static void main(String[] args){
		int sum = 0;
		int[] number = new int[5];
		Scanner sc = new Scanner(System.in);
		/*System.out.print("Enter the 1st number: ");
		number[0] = sc.nextInt();
		System.out.print("Enter the 2nd number: ");
		number[1] = sc.nextInt();
		System.out.print("Enter the 3rd number: ");
		number[2] = sc.nextInt();
		System.out.print("Enter the 4th number: ");
		number[3] = sc.nextInt();
		System.out.print("Enter the 5th number: ");
		number[4] = sc.nextInt();*/
		
		for(int i =0; i<number.length; i++){
			System.out.print("Enter the " + (i+1) + " number: ");
			number[i] = sc.nextInt();
			sum = sum + number[i];
		}
		
		System.out.println("Sum of the numbers: " + sum);
	}
}