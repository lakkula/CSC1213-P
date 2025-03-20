class EX02{
	public static void main(String args[]){
		String Name, Address, DOB, Sex;
		int Age;
		Name = args[0];
		Address = args[1];
		DOB = args[2];
		Sex = args[3];
		Age = Integer.parseInt(args[4]);
		
		int a = 10;
		int b = a + Age;
		//int c = a + args[4];
		
		System.out.println("Age is: " + b);
		//System.out.println("Arg[4] is: " + c);
		
		System.out.println("Name: " + Name + "\n" + "Address: " + Address + "\n" + "Date of Birth: " + DOB + "\n" + "Sex: " + Sex + "\n" + "Age: " + Age);
	}
}