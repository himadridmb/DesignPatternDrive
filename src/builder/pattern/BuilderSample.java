package builder.pattern;

/*Builder pattern is used to construct a complex object step by step and the final step will return the 
 * object. The process of constructing an object should be generic so that it can be used to create 
 * different representations of the same object.*/

public class BuilderSample {
	public static void main(String[] args) {
		HouseBuilder iglooBuilder = new IglooHouseBuilder();
		CivilEngineer engineer = new CivilEngineer(iglooBuilder);

		engineer.constructHouse();

		House house = engineer.getHouse();

		System.out.println("Builder constructed: " + house);
	}
}

/* Abstract factory may also be used to construct a complex object, then what is the difference with builder 
 * pattern? In builder pattern emphasis is on step by step. Builder pattern will have many number of small 
 * steps. Those every steps will have small units of logic enclosed in it. There will also be a sequence involved. 
 * It will start from step 1 and will go on upto step n and the final step is returning the object. In these steps, 
 * every step will add some value in construction of the object. That is you can imagine that the object grows 
 * stage by stage. Builder will return the object in last step. But in abstract factory how complex the built 
 * object might be, it will not have step by step object construction.
 */