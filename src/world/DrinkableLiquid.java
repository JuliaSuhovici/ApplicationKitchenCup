package world;

public class DrinkableLiquid extends Liquid{
	//PROPERTIES
	private String category;
	
	//--------CONSTRUCTOR---------//
	
	public DrinkableLiquid(String name, Integer volume, Integer temperature, String category) {
		super(name,volume,temperature);
		setCategory(category);
	}
	
	//-----------GETTER-----------//
	public String getCategory() {
		return category;
	}

	//-----------SETTER-----------//
	public void setCategory(String category) {
		if(category.equals("Alcoholic") || category.equals("Hot Drinks") || category.equals("Cold Drinks"))
			this.category = category;
		else
			System.err.println("WRONG CATEGORY OF A DRINK!");
	}
}
