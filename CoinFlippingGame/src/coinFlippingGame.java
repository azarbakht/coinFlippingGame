/**
 * @author Emerson Amirhosein Azarbakht
 * azarbaam@eecs.oregonstate.edu
 * Coin Flipping Game, for 8 dollars
 */

public class coinFlippingGame {


	private static final boolean TRUE = true;
	private static final boolean FALSE = false;


	public static void main(String[] args) {

		coinFlipValidCaseCounter(8);

	}

	public static void coinFlipValidCaseCounter(int totalNumberOfFlips){

		int upperBound = (int) Math.pow(2, totalNumberOfFlips);
		int lowerBound = (int) Math.pow(2, totalNumberOfFlips-1);
		int validCaseCount = 0;

		System.out.printf("LowerBound: %d \n UpperBound: %d \n", lowerBound, upperBound);

		for(int i= lowerBound; i < upperBound; i++){
			String binaryStringI = Integer.toBinaryString(i);
			System.out.printf("Binary representation of i: *** %20s *** \n", binaryStringI);

			if (Integer.bitCount(i)==4){
				if (wouldStopEarlier(binaryStringI) == FALSE){
					validCaseCount++;
				}
			}
		}
		System.out.printf("Total Valid Case Count: %d \n", validCaseCount);
	}


	public static boolean wouldStopEarlier(String binaryString) {
		int numberOfHeads = 0;
		int numberOfTails = 0;
		for (int j = 0; j < binaryString.length()-1; j++){
			String charAtJ = Character.toString(binaryString.charAt(j));
			//			System.out.println(charAtJ);

			if (charAtJ.equals("1")){
				numberOfHeads ++;
			} else if(charAtJ.equals("0")){
				numberOfTails ++;
			}

			if (numberOfHeads == numberOfTails){
				System.out.printf("This would stop earlier %40s \n", binaryString);
				return TRUE;
			}
		} 
		
		return FALSE;
	}

} //class