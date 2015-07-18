/**
 * @author Emerson Amirhosein Azarbakht
 * azarbaam@eecs.oregonstate.edu
 * Coin Flipping Game, for 8 dollars
 */

public class coinFlippingGame {


	public static void main(String[] args) {

		int upperBound = (int) Math.pow(2, 8);
		int count0, count1, validCaseCount =0, totalValid = 0;

		for(int i = 0; i < upperBound; i++){

			count1 = Integer.bitCount(i);
			count0 = 8 - count1;

			if(count1 == count0){
				validCaseCount++;
			}
			System.out.printf("number of valid cases so far: %d \n", validCaseCount);
			totalValid += validCaseCount; 
			validCaseCount = 0;
		}

		System.out.printf("The total number of times the number of heads and tails are equal is: %d", totalValid);

	}

}
