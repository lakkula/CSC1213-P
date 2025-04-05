class ArrayEX{
	public static void main(String[] args){
		int numbers[] = new int[10];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		numbers[5] = 60;
		numbers[6] = 70;
		numbers[7] = 80;
		numbers[8] = 90;
		numbers[9] = 100;
		for(int i=0; i<numbers.length; i++){
			System.out.println(numbers[i] + "\t");
		}
		System.out.println("##########################################");
		int numbers2[] = {1,2,3,4,5,6,7,8,9,10};
		for(int i=0; i<numbers2.length; i++){
			System.out.println(numbers2[i] + "\t");
		}
		System.out.println("******************************************");
		
		//for each loop
		String days[] = {"Monday","Tuesday","Wednesday","Thurseday",
		"Friday","Saturday","Sunday"};
		for(String weekdays: days){
			System.out.println(weekdays + "\t");
		}
	}
}