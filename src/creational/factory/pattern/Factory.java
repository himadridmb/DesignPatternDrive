package creational.factory.pattern;
/* Factory design pattern in Java one of the core design pattern. Factory Design pattern is based on 
 * Encapsulation object oriented concept. Factory method is used to create different object from factory 
 * often refereed as Item and it encapsulate the creation code. So instead of having object creation code 
 * on client side we encapsulate inside Factory method in Java.
 * 
 * it provides loose coupling and high cohesion. Factory pattern encapsulate object creation logic which makes it 
 * easy to change it later when you change how object gets created or you can even introduce new object with just change in one class

 * */

public class Factory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String country = "Bangladesh";
		Currency currency = CurrencyFactory.getCurrency(country);
		System.out.println(currency.getSymbol());
	}

}


/* When to use Factory design pattern in Java

 - Static Factory methods are common in frameworks where library code needs to create objects of types which may be sub classed by applications using the framework.        
 - Some or all concrete products can be created in multiple ways, or we want to leave open the option that in the future there may be new ways to create the concrete product.
 - Factory method is used when Products don't need to know how they are created.
 - We  can use factory pattern where we have to create an object of any one of sub-classes depending on the data provided

*/