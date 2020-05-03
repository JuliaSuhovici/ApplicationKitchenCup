package kitchen;

public class Cup {
	private String liquidName;
    protected Integer liquidVolume;

  //---------CONSTRUCTORS------------//
    public Cup(){

    }
    public Cup( String liquidName, Integer liquidVolume ){
        setLiquidName(liquidName);
    	setLiquidVolume(liquidVolume);
    }
    
    //-----------GETTERS------------//
	public String getLiquidName() {
		return liquidName;
	}
	
	public Integer getLiquidVolume() {
		return liquidVolume;
	}
	
	//-----------SETTERS-----------//
	public void setLiquidName(String liquidName) {
		if(liquidName.equals("Water") || liquidName.equals("Milk") || liquidName.equals("Tea"))
			this.liquidName = liquidName;
		else
			System.err.println("FORBIDDEN LIQUID!");
	}
	
	public void setLiquidVolume(Integer liquidVolume) {
		if(liquidVolume >= 0 && liquidVolume <= 600)
			this.liquidVolume = liquidVolume;
		else
			System.err.println("INCORRECT VOLUME!");
	}    
}
