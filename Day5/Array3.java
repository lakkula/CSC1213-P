import java.util.Scanner;
class Array3{
	public static void main(String[] args){
		int[] number = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<number.length; i++){
			System.out.print("Enter the " + (i+1) + " number: ");
			number[i] = sc.nextInt();
		}
		
		int max = number[0];
		int min = number[0];
		
		for(int i=1; i<number.length; i++){
			if(max<number[i]){
				max = number[i];
			}
			if(min>number[i]){
				min = number[i];
			}
		}
		
		System.out.println("The maximum number: " + max);
		System.out.println("The minimum number: " + min);
	}
}