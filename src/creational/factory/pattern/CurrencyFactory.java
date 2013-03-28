package creational.factory.pattern;

public class CurrencyFactory {
	public static Currency getCurrency(String country) {
		if (country.equalsIgnoreCase("Bangladesh")) {
			return new Taka();
		} else if (country.equalsIgnoreCase("Canada")) {
			return new CanadaDollar();
		} else if (country.equalsIgnoreCase("US")) {
			return new USDollar();
		}
		throw new IllegalArgumentException("No such currency");
	}
}
