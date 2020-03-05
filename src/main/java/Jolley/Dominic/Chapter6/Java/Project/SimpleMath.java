package Jolley.Dominic.Chapter6.Java.Project;

public class SimpleMath {
	public double divide(double Numerator,double Denominator) {
		if(Denominator==0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		double result = Numerator/Denominator;
		return result;
	}
}
