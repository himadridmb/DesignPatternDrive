package creational.builder.pattern.wiki;

/** A customer ordering a pizza. */
class BuilderExample {
   public static void main(String[] args) {
       Waiter waiter = new Waiter();
       PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
       PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

       waiter.setPizzaBuilder( hawaiianPizzaBuilder );
       waiter.constructPizza();

       Pizza pizza = waiter.getPizza();

       	System.out.println(pizza);
       waiter.setPizzaBuilder( spicyPizzaBuilder );
       waiter.constructPizza();

       Pizza anotherPizza = waiter.getPizza();
       
       System.out.println(anotherPizza);
   }
}

/*The builder pattern is an object creation software design pattern. The intention is to 
 * abstract steps of construction of objects so that different implementations of these steps 
 * can construct different representations of objects. Often, the builder pattern is used to build products in accordance with the composite pattern.
 * 
 * The intent of the Builder design pattern is to separate the construction of a complex object 
 * from its representation. By doing so, the same construction process can create different representations.
 * */
