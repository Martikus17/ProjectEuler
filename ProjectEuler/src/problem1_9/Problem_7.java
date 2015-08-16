package problem1_9;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;

public class Problem_7 {

	public static void main(String[] args) {
		
		ArrayList<BigInteger> prime = new ArrayList<BigInteger>();
		BigInteger current = new BigInteger("2");
		prime.add(new BigInteger("2"));
		boolean innocent = true;
		
		while (true){
			Iterator<BigInteger> it = prime.iterator();
			while (it.hasNext()){
				BigInteger currentPrime = it.next();
				if (current.mod(new BigInteger(""+currentPrime)).equals(BigInteger.ZERO)){
					innocent = false;
					break;
				}
			}
			if (innocent == true){
				prime.add(current);
			}
			if (prime.size() == 10001){
				System.out.print(prime.get(10000));
				break;
			}
			innocent = true;
			current = current.add(BigInteger.ONE);
		}
	}

}
