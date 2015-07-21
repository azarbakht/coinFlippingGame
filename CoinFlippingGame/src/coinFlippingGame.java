/**
 * @author Emerson Amirhosein Azarbakht
 * azarbaam@eecs.oregonstate.edu
 * Coin Flipping Game, for 8 dollars
 */

public class coinFlippingGame {


	public static void main(String[] args) {

		countValidCoinGame(8, 0);

	}

	public static void countValidCoinGame(int totalNumberOfFlips, int lowerBound){

		int upperBound = (int) Math.pow(2, totalNumberOfFlips);
		int validCaseCount = 0;
		int stopCaseCount = 0;

		System.out.printf("LowerBound: %d \n UpperBound: %d \n", lowerBound, upperBound);

		for(int i= lowerBound; i < upperBound; i++){
			String binaryStringI = Integer.toBinaryString(i);
			System.out.printf("Binary representation of i: *** %20s *** \n", binaryStringI);
			int numberOfHeads =0;
			int numberOfTails = 0;



		} // for 0-256

		System.out.printf("Total Stop Case Count: %d", stopCaseCount);

	} // method countValidCoinGame

	public static int isStopCase(String binaryString) {
		int numberOfHeads = 0;
		int numberOfTails = 0;
		for (int j = 0; j < binaryString.length(); j++){
			String charAtJ = Character.toString(binaryString.charAt(j));
			System.out.println(charAtJ);

			if (charAtJ.equals("1")){
				numberOfHeads ++;
			} else if(charAtJ.equals("0")){
				numberOfTails ++;
			}
		}

		System.out.println(numberOfHeads);
		System.out.println(numberOfTails);

		if (numberOfHeads == numberOfTails){
			System.out.println("STOP CASE HERE $#$#$$#$#$$#$#$##$#$#$#$#$#$#$#$#$#$");
			return 0;
		} else if (numberOfHeads != numberOfTails){
			return 1;
		}
		return 1;
	}

} //class