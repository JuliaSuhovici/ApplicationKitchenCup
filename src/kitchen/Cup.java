package kitchen;
import world.Liquid;

public class Cup{

	private Liquid liquid;
	private final static Integer MAX_VOLUME = 600;
	
	//---------CONSTRUCTORS------------//
	
	public Cup(){}
	
	public Cup(String name, Integer volume, Integer temperature){
		liquid = new Liquid(name, temperature);
		setLiquid(volume);
	 }

	 //-----------GETTERS-----------//
	
	public static Integer getMaxVolume() {
		return MAX_VOLUME;
	}
	
	public Liquid getLiquid() {
		return liquid;
	}

	//-----------SETTERS-----------//
	public void setLiquid(Integer volume) {
		if(volume <= MAX_VOLUME)
			liquid.setVolume(volume);
		else
			System.err.println("WRONG VOLUME!");
	}
	
	//-----------METHODS-----------//
	public Integer getLiquidVolume() {
		return liquid.getVolume();
	}
	
	public void print() {
		System.out.println("//-------Info about cup:--------//");
		System.out.println("Liquid: " + liquid.getName());
		System.out.println("Volume: " + liquid.getVolume());
		System.out.println("Temperature: " + liquid.getTemperature());
	}
}
