public class Car{
	String brand;
	static int year;
	
	static void displayInfo(String b, int y){
		System.out.println("Brand: " + b);
		System.out.println("Year: " + y);
	 }
	 
	 public static void main(String[] args){
		displayInfo("Toyota", 2020);
		
		Car c1 = new Car();
		Car c2 = new Car();
		c1.displayInfo("BMW", 2025);
		c2.displayInfo("Audi", 2024);
	 }
}