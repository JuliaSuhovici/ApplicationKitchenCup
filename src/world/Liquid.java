package world;

public class Liquid {
	//PROPERTIES
	private String name;
	private Integer volume;
	private Integer temperature;
		
	//-----CONSTRUCTORS-----//
	public Liquid() {}
	
	public Liquid(String name, Integer volume, Integer temperature) {
		setName(name);
		setVolume(volume);
		setTemperature(temperature);
	}

	//-----SETTERS-----//
	public void setName(String name) {
		if(name.trim().length() != 0)
			this.name = name;
		else
			System.err.println("NAME CAN'T BE EMPTY!");
	}
	
	public void setVolume(Integer volume) {
		if(volume > 0)
			this.volume = volume;
		else
			System.err.println("WRONG VOLUME!");
	}
	
	public void setTemperature(Integer temperature) {
		if(temperature >= 0 && temperature <= 100)
			this.temperature = temperature;
		else
			System.err.println("WRONG TEMPERATURE!");
	}
	
	//-----GETTERS-----//
	public String getName() {
		return name;
	}
	
	public Integer getVolume() {
		return volume;
	}
	
	public Integer getTemperature() {
		return temperature;
	}
	
	//-----METHODS-----//
	
	public boolean isCold() {
		if(temperature != null && temperature <= 18) 
			return true;
		else 
			return false;
	}
	
	public boolean isWarm() {
		if(temperature != null && temperature > 18 && temperature <= 36) 
			return true;
		else 
			return false;
	}
	
	public boolean isHot() {
		if(temperature != null && temperature > 36) 
			return true;
		else 
			return false;
	}
}
