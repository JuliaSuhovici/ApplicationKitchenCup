package kitchen;
import world.Liquid;

public class Cup{

	private Liquid liquid;
	private final static Integer MAX_VOLUME = 600;
	
	//---------CONSTRUCTORS------------//
   	public Cup(){}
    
   	public Cup(Liquid liquid, Integer maxVolume){
    		setLiquid(liquid, maxVolume);
    	}
    
    	public Cup(Liquid liquid){
    		setLiquid(liquid, MAX_VOLUME);
    	}
    
  	//-----------GETTERS-----------//
	
	public Liquid getLiquid() {
		return liquid;
	}

	//-----------SETTERS-----------//
	public void setLiquid(Integer volume) {
		setLiquid(liquid, volume);
	}
	public void setLiquid(Liquid liquid, Integer maxVolume) {
		if(liquid.getVolume() <= maxVolume)
			this.liquid = liquid;
		else
			System.err.println("WRONG VOLUME!");
	}
	
	
	//-----------METHODS-----------//
	public void print() {
		System.out.println("//-------Info about cup:--------//");
		System.out.println("Liquid: " + liquid.getName());
		System.out.println("Volume: " + liquid.getVolume());
		System.out.println("Temperature: " + liquid.getTemperature());
	}
}
