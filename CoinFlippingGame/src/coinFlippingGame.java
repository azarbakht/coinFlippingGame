/**
 * @author Emerson Amirhosein Azarbakht
 * azarbaam@eecs.oregonstate.edu
 * Coin Flipping Game, for 8 dollars
 */

public class coinFlippingGame {


	public static void main(String[] args) {

//		int upperBound = (int) Math.pow(2, 8);
//		int count0, count1, validCaseCount =0, totalValid = 0;
//
//		for(int i = 0; i < upperBound; i++){
//
//			System.out.println(i);
//			System.out.printf("Binary representation: %20s \n", Integer.toBinaryString(i));
//			System.out.printf("numberOfHeads = %20d \n" , Integer.bitCount(i));
//			System.out.printf("numberf of coin flips = %12d \n" , Integer.toBinaryString(i).length());
//
//			int numberOfOnesHeads = Integer.bitCount(i);
//			int numberOfCoinFlips = Integer.toBinaryString(i).length();
//			int numberOfZerosTails = numberOfCoinFlips - numberOfOnesHeads;
//
//			if (numberOfOnesHeads == numberOfZerosTails){
//					validCaseCount++;
//			}
//
//			System.out.printf("Number of Valid cases = %13d \n", validCaseCount);
//
//		}

		stopCasesBefore8th(2);
		stopCasesBefore8th(4);
		
	}
	
	public static void stopCasesBefore8th(int numberOfFlips){
		
		int upperBound = (int) Math.pow(2, numberOfFlips);
		int lowerBound = (int) Math.pow(2, numberOfFlips-1);
		System.out.println(lowerBound);
		
		for(int i= lowerBound; i < upperBound; i++){
			System.out.printf("Binary representation of i: %20s \n", Integer.toBinaryString(i));

		}
		
	}
	
}