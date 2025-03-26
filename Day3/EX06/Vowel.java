import java.util.Scanner;
class Vowel{
	public static void main(String[] args){
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		char letter = ob.next().charAt(0);
		
		switch(letter){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':System.out.println("It is a vowel");
			break;
			default:System.out.println("It is not a vowel");
		}
	}
}