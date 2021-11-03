package velo.ladealpha.fields.math;

public class CombinationFormula {
	public static double ncr(double n, double r) {
		return LMath.factorial(n) / (LMath.factorial(r) * LMath.factorial(n - r));
	}
}
