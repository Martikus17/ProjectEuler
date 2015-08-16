package problem1_9;

public class Problem_1 {
	
	public static void main(String[] args){
		int result = 0;
		int i = 0;
		
		for (i=1; i<1000; i++){
			if (i%3==0 || i%5==0){
				result = result + i;
			}
		}
		
		System.out.print(result);
	}

}
