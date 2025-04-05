import java.util.Scanner;
class WhileEX2{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			Scanner ob = new Scanner(System.in);
			int num;
			char opinion;
			int sum = 0;
			
			do{
				System.out.println("Enter a number: ");
				num = sc.nextInt();
			
				System.out.println("Do you want to continue(Y/N): ");
				opinion = ob.next().charAt(0);
				
				sum = sum + num;
			}while(opinion =='Y' || opinion == 'y');
			
			System.out.println("Sum of numbers: " + sum);
		}
}