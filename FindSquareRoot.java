package javaChallange_01;

public class FindSquareRoot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 89;
		double sqrt = num/2;
		double temp = 0;
		
		while (sqrt !=temp) {
			temp= sqrt;
			sqrt= (num/temp+ temp)/2;
		
		}
		System.out.println("The Square root of "+num +" is "+ (int)sqrt);
	}

}
