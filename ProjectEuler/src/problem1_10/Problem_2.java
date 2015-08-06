package problem1_10;

public class Problem_2 {

	public static void main(String[] args) {
		
		int currentFib=2;
		int result = 2;
		int lastOne = 1, lastSecond = 2;
			
		while (currentFib<4000000){
			currentFib = lastOne + lastSecond;
			if (currentFib%2==0){
				result = result + currentFib;
			}
			lastOne = lastSecond;
			lastSecond= currentFib;
		}
		System.out.print(result);
	}
}
