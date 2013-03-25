package builder.pattern;

public interface HouseBuilder {

	public void buildBasement();

	public void buildStructure();

	public void bulidRoof();

	public void buildInterior();

	public House getHouse();
}
