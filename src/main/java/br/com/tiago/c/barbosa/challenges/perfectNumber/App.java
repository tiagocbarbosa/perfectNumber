package br.com.tiago.c.barbosa.challenges.perfectNumber;

/**
 * 
 * @author Tiago Barbosa, https://github.com/tiagocbarbosa
 * 
 * Challenge link: https://edabit.com/challenge/vXYP24qRoQQijc834
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		try {
			// Perfect Numbers
			System.out.println(Challenge.checkPerfect(6));
			System.out.println(Challenge.checkPerfect(28));
			System.out.println(Challenge.checkPerfect(496));
			System.out.println(Challenge.checkPerfect(8128));
			// Not perfect numbers
			System.out.println(Challenge.checkPerfect(1));
			System.out.println(Challenge.checkPerfect(12));
			System.out.println(Challenge.checkPerfect(97));
			System.out.println(Challenge.checkPerfect(213));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
