package br.com.tiago.c.barbosa.challenges.perfectNumber;

/**
 * 
 * @author Tiago Barbosa, https://github.com/tiagocbarbosa
 *
 */
public class Challenge {

	/**
	 * Checks if number is a perfect number
	 * @param number
	 * @return
	 * @throws Exception
	 */
	public static boolean checkPerfect(int number) throws Exception {
		int sum = 0;
		if(number > 0) { // Has to be a positive number
			sum = divisiblesSum(number);
			if(sum == number) {
				return true;
			}
		} else {
			throw new Exception("Cannot be a negative number.");
		}
		return false;
	}

	/**
	 * Makes the sum of number factors
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
