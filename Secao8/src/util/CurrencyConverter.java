package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;

	public static double dollarToReal(double dolarPrice, double bought) {
		return bought * dolarPrice * (1.0 + IOF);
	}
}
