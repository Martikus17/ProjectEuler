package problem1_10;

public class Problem_5 {

	public static void main(String[] args) {
		
		int i = 20;
		
		while (true){
			//simplest way
			if (i%20==0 && i%19==0 && i%18==0 && i%17==0 && i%16==0 && i%15==0 && i%14==0 && i%13==0 && i%12==0 && i%11==0){
				System.out.print(i);
				break;
			}
			i++;
		}
	}
}
