public class Myclass{
	int x = 5;
	int y = 6;
	public static void main(String[] args){
		Myclass myObj1 = new Myclass();
		Myclass myObj2 = new Myclass();
		System.out.println(myObj1.x);
		System.out.println(myObj2.y);
		System.out.println(myObj2.y + myObj1.x);
	}
}