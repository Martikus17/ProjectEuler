package problem_3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;

public class Problem_3 {
	
	public static void main (String[] args){
		
		ArrayList<BigInteger> prime = new ArrayList<BigInteger>();
		BigInteger current = new BigInteger("2");
		prime.add(new BigInteger("2"));
		boolean innocent = true;
		BigInteger goal= new BigInteger("600851475143");
		
		while (true){
			Iterator<BigInteger> it = prime.iterator();
			while (it.hasNext()){
				BigInteger currentPrime = it.next();
				if (current.mod(new BigInteger(""+currentPrime)).equals(BigInteger.ZERO)){
					innocent = false;
					break;
				}
			}
			if (innocent == true && 0!= current.compareTo(new BigInteger(""+prime.get(prime.size()-1)))){
				prime.add(current);
			}
			if (goal.mod(new BigInteger(""+current)).equals(BigInteger.ZERO)){
				goal = goal.divide(new BigInteger(""+current));
			} else{
				current = current.add(BigInteger.ONE);
			}
			if (goal.compareTo(new BigInteger(""+current)) <=0){
				System.out.print("Größter Primfaktor: "+ current);
				break;
			}
		}
	}
}
