package br.com.tiago.c.barbosa.challenges.perfectNumber;

/**
 * 
 * @author tiago.c.barbosa
 *
 */
public class Challenge {

	/**
	 * 
	 * @param number
	 * @return
	 * @throws Exception
	 */
	public static boolean checkPerfect(int number) throws Exception {
		int sum = 0;
		if(number > 0) { // Have to be a positive number
			sum = divisiblesSum(number);
			if(sum == number) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param number
	 * @return
	 * @throws Exception
	 */
	private static int divisiblesSum(int number) throws Exception {
		if(number <= 0) {
			throw new Exception("Cannot be a negative number.");
		} else {
			int sum = 0;
			for (int i = (number - 1); i > 0; i--) {
				if(number % i == 0) {
					sum += i;
				}
			}
			return sum;
		}
	}

}
