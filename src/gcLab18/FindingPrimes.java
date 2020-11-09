package gcLab18;

import java.util.Scanner;

public class FindingPrimes {
	
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		do {
			int userInput;
			
			System.out.println("Which prime number are you looking for? ");
			
			
			if(scn.hasNextInt()){
				
				userInput = scn.nextInt();
				
				if (validInt(userInput)) {
					
					//run something return result
					int primeNumber = FindingPrimes.primeNumber(userInput);
					
					System.out.println("The number " + userInput + " prime is " + primeNumber);
					scn.nextLine();
					
					//ask to continue
					System.out.println("Whould you like to play again? (y/n) ");
					
					String yOrN = scn.nextLine();
					
					if (yOrN.equals("y")) {
						
						//if continue, do
					} else {
						
						//if not, break
						System.out.println("Goodbye.");
						break;
					} 
				} else {
					
				}
				
			} else {
				scn.nextLine();
			}
			
		} while(true);
			
		scn.close();
	}
	
	
	public static boolean isPrime(int num) {
		
		if (num > 1) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
	
	public static int primeNumber(int num) {
		
		int primeNum = 1;
		int primeCounter = 0;
		boolean addPrime;
		
		do {
			
			primeNum++;
			addPrime = isPrime(primeNum);
			if(addPrime) {
				primeCounter++;
			}
			
		} while(primeCounter < num);
		
		return primeNum;
		
		
	}
	
	public static boolean validInt(int num) {
		
		if(num < 1) {
			return false;
		} else {
			return true;
		}
		
	}
	
}
