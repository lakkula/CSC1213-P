class EX08{
	public static void main(String[] args){
		int X = 75;
		int Y = 20;
		boolean isTrue = true;
		System.out.println("X: " + X);
		System.out.println("Y: " + Y);
		System.out.println("Bolean Value: " + isTrue);
		//Unary operators
		System.out.println("Unary plus of X: " + (+X));
		System.out.println("Unary minus of X: " + (-X));
		System.out.println("Increment of X: " + (++X));
		System.out.println("Decrement of Y: " + (--Y));
		System.out.println("Logical complement: " + (!isTrue));
		System.out.println("Bitwise complement: " + (~Y));
		//Logical operators
		System.out.println("Logical AND(X<100 && Y>10): " + (X<100 && Y>10));
		System.out.println("Logical OR(X>90 || Y<5): " + (X>90 || Y<5));
		System.out.println("Logical NOT(!(X<100 && Y>10)): " +!(X<100 && Y>10));
		//Relational operators
		System.out.println("X == Y: " + (X == Y));
		System.out.println("X != Y: " + (X != Y));
		System.out.println("X > Y: " + (X > Y));
		System.out.println("X < Y: " + (X < Y));
		System.out.println("X >= Y: " + (X >= Y));
		System.out.println("X <= Y: " + (X <= Y));
		//Assignment operators
		System.out.println("Value of X: " + X);
		System.out.println("X += 5: " + (X += 5));
		System.out.println("X -= 2: " + (X -= 2));
		System.out.println("X *= 5: " + (X *= 5));
		System.out.println("X /= 10: " + (X /= 10));
		System.out.println("X %= 7: " + (X += 7));
		//Ternary operators
		int max = (X>Y) ? X : Y;
		System.out.println("The maximum value: " + max);
	}
}
