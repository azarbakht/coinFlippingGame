/**
 * @author Emerson Amirhosein Azarbakht
 * azarbaam@eecs.oregonstate.edu
 * 
 * Coin Flipping Game, for 8 dollars
 * Your friend has a coin and asks you if you want to play a game. 
 * "I will flip this coin until the number of heads flipped is equal to the number of tails flipped. 
 * Then I will give you a dollar for each time I flipped the coin." 
 * What are the chances that you play this game with your friend once and he pays you exactly eight dollars?
 */

public class coinFlippingGame {


	private static final boolean TRUE = true;
	private static final boolean FALSE = false;

	public static void main(String[] args) {

		float rewardProbability = 0;
		rewardProbability = coinFlipValidCaseCounter(8);
	}

	public static float coinFlipValidCaseCounter(int totalNumberOfFlips){

		int upperBound = (int) Math.pow(2, totalNumberOfFlips);
		int lowerBound = 0;
		int validCaseCount = 0;
		float probability = 0;

		System.out.printf("LowerBound: %d \n UpperBound: %d \n", lowerBound, upperBound);

		for(int i= lowerBound; i < upperBound; i++){
			
			String binaryStringI = String.format("%8s", Integer.toBinaryString(i)).replace(' ', '0');
			System.out.printf("Binary representation of i: *** %8s *** \n", binaryStringI);

			if (Integer.bitCount(i)== (totalNumberOfFlips/2)){
				if (wouldStopEarlier(binaryStringI) == FALSE){
					validCaseCount++;
				}
			}
		}
		System.out.printf("Total Valid Case Count: %d \n", validCaseCount);
		probability = (float) validCaseCount * 100 / (float) upperBound;
		System.out.printf("Probability of making %d dollars in this game is: %2.2f percent \n", totalNumberOfFlips, probability);
		return probability;
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
				System.out.printf("========== This would stop earlier %20s ================== \n", binaryString);
				return TRUE;
			} 
			
		} 
		System.out.printf("@@@@@@@@@@@@@@@@@@@@@@@   VALID CASE: %15s    @@@@@@@@@@@@@@@@@@@@@@ \n", binaryString);		
		return FALSE;
	}

} //class