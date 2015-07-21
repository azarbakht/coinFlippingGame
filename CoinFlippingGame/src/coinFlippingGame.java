/**
 * @author Emerson Amirhosein Azarbakht
 * azarbaam@eecs.oregonstate.edu
 * Coin Flipping Game, for 8 dollars
 */

public class coinFlippingGame {


	public static void main(String[] args) {


		//		int upperBound = (int) Math.pow(2, 8);
		int count0, count1, validCaseCount =0, totalValid = 0;
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

//		stopCasesBefore8th(2, 0);
//		stopCasesBefore8th(4, 2);
//		stopCasesBefore8th(6, 16);
//		stopCasesBefore8th(8, 64);
		stopCasesBefore8th(8, 0);
	}

	public static void stopCasesBefore8th(int totalNumberOfFlips, int lowerBound){

		int upperBound = (int) Math.pow(2, totalNumberOfFlips);
		int validCaseCount = 0;
		int stopCaseCount = 0;

		for(int i= lowerBound; i < upperBound; i++){
			System.out.printf("Binary representation of i: *** %20s *** \n", Integer.toBinaryString(i));

			int numberOfHeads = Integer.bitCount(i);
			int numberOfTails = Integer.toBinaryString(i).length() - numberOfHeads;
			System.out.printf("Number of Heads: %31d \n", numberOfHeads);
			System.out.printf("Length of binary representation: %20d \n", Integer.toBinaryString(i).length());
			System.out.printf("Number of Tails: %31d \n", numberOfTails);
			System.out.println("**************************************************************");


			if (numberOfHeads == numberOfTails){
				System.out.println("STOP CASE HERE $#$#$$#$#$$#$#$##$#$#$#$#$#$#$#$#$#$");
				if (numberOfHeads != 4){
					stopCaseCount++;
				} else if (numberOfHeads == 4){
					validCaseCount++;	
				}

			}

		}
		System.out.printf("number of Valid Cases: %10d \n number of Stop Cases != 4: %10d", validCaseCount, stopCaseCount);

	}

}