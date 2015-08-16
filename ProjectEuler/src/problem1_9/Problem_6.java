package problem1_9;

public class Problem_6 {
	
	public static void main(String[] args){
	
		int sumSquare = 0;
		int squareSum = 0;
	
	
		for (int i=1; i<=100; i++){
			sumSquare = sumSquare + i;
			squareSum = squareSum + getSquare(i);
		}
		sumSquare = getSquare(sumSquare);
		int dif = sumSquare - squareSum;
		
		System.out.print("Differenz = " + dif);
	}
	
		
	public static int getSquare(int x){
		return x*x;
	}

}
