package problem30_39;

public class Problem_31 {

	public static void main(String[] args) {
		
		for (int i =2; i<=200;i++){
			System.out.println("Die Zahl von "+i+" ist " + getNumberOfPermutationes(i));
		}
	}
	
	
	public static int getNumberOfPermutationes(int number){
		
		int stack[]  = new int[1000000];
		int currentStack =0;
		int amountOfStacks = 1;
		stack[0]=number;
		int numberOfPermutations = 1;
		
		
		
		
		//Wenn rechtester Stack = 0 oder =1 ist, wird einen Stack weiter gegangen
		//Wenn rechtester Stack = 2 -> Verringere um 1 -> neuer Stack wird eingefügt
		//Wenn rechtester Stack >2 -> verringere um 1 -> alle anderen Stacks wieder aufaddiert, die darauffolgenden Stacks müssen <= der größe des linkesten Stacks sein
		
		
		while(true){
			
			if (stack[currentStack] == 0 || stack[currentStack] == 1){
				currentStack --;
			} else{
				if (stack[currentStack] == 2){
					stack[currentStack]--;
					stack[amountOfStacks]=1;
					amountOfStacks ++;
					numberOfPermutations++;
				} else{
					if (stack[currentStack] > 2){
						stack[currentStack]--;	
						if (currentStack < amountOfStacks-1){
							int sum = 1;
							for (int i = currentStack+1; i<amountOfStacks; i++){
								sum = sum + stack[i];
								stack[i]=0;
							}
							while(true){
								if (stack[currentStack] >= 1 && stack[currentStack+1] >= 1){
									currentStack++;
								} else{
									if (sum > stack[currentStack]){
										currentStack++;
										stack[currentStack] = stack[currentStack-1];
										sum = sum - stack[currentStack];
										
									} else{
										if (sum>0){
											currentStack++;
											stack[currentStack] = sum;
											
										}
										amountOfStacks = currentStack+1;
										break;
										
									}
								}
							}
						}else{
							stack[amountOfStacks]=1;
							amountOfStacks ++;
							currentStack = amountOfStacks-1;
						}
						numberOfPermutations++;
					}
				}
			}
			if (stack[currentStack] == 1 && currentStack == 0){
				break;
			}
		}
		
		return numberOfPermutations;
	}
}
