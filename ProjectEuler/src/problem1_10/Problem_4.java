package problem1_10;

public class Problem_4 {

	public static void main(String[] args) {
		int leftPointer = 999;
		int rightPointer = 999;
		int result = 0;
		int potentialBiggest = 0;
		
		for (leftPointer=999; leftPointer >=100; leftPointer--){
			if (leftPointer * 999 < result){
				break;
			}
			for (rightPointer=999; rightPointer >=100; rightPointer--){
				potentialBiggest = leftPointer * rightPointer;
				if (isPalindrom(potentialBiggest) && potentialBiggest > result){
					result = potentialBiggest;
				}
			}
		}
		System.out.print(result);
	}

	
	public static Boolean isPalindrom(int palindrom){
		//TODO fancy algorithm
		
		String palinToString = ""+palindrom;
		
		if (palindrom < 1000){
			if (palinToString.charAt(0) == palinToString.charAt(2)){
				return true;
			}
		} else if (palindrom < 10000){
			if (palinToString.charAt(0) == palinToString.charAt(3) && palinToString.charAt(1) == palinToString.charAt(2)){
				return true;
			}
		} else if (palindrom < 100000){
			if (palinToString.charAt(0) == palinToString.charAt(4) && palinToString.charAt(1) == palinToString.charAt(3)){
				return true;
			}
		} else if (palindrom < 1000000){
			if (palinToString.charAt(0) == palinToString.charAt(5) && palinToString.charAt(1) == palinToString.charAt(4) && palinToString.charAt(2) == palinToString.charAt(3)){
				return true;
			}
		}
		return false;
	}
		
}
