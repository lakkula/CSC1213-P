import java.util.Scanner;
class WhileEX3{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			Scanner ob = new Scanner(System.in);
			int num; int sum = 0;
			char opinion;
			int oddcount = 0; int evencount = 0;
			int oddsum = 0; int evensum = 0;
			
			do{
				System.out.println("Enter a number: ");
				num = sc.nextInt();
			
				System.out.println("Do you want to continue(Y/N): ");
				opinion = ob.next().charAt(0);
				
				sum = sum + num;
				
				if(num%2 == 0){
					evencount++;
					evensum = evensum + num;
				}else{
					oddcount++;
					oddsum = oddsum + num;
				}
			}while(opinion =='Y' || opinion == 'y');
			
			System.out.println("Sum of numbers: " + sum);
			System.out.println("Count of the even numbers: " + evencount);
			System.out.println("Sum of the even numbers: " + evensum);
			System.out.println("Count of the odd numbers: " + oddcount);
			System.out.println("Sum of the odd numbers: " + oddsum);
		}
}