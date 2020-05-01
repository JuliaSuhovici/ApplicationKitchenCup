package kitchen;

public class Cup {
	private String liquidName;
    private Integer liquidVolume;

  //---------CONSTRUCTORS------------//
    public Cup(){

    }
    public Cup( String liquidName, Integer liquidVolume ){
        this.liquidName = liquidName;
        this.liquidVolume = liquidVolume;
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
		if(liquidName == "Water" || liquidName == "Milk" || liquidName == "Tea")
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
