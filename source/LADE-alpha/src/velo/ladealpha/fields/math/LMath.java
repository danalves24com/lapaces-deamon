package velo.ladealpha.fields.math;

// TODO: Auto-generated Javadoc
/**
 * The Class LMath.
 */
public class LMath {
	
	/**
	 * Round.
	 *
	 * @param x the x
	 * @param p the p
	 * @return the double
	 */
	public static double round(double x, double p) {
		int m = (int) Math.pow(10, p);
		return ((double)(int)(x*m))/m;
	}
}
