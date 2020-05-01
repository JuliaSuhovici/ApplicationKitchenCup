package kitchen;

public class BigCup extends Cup{
	
	private Integer liquidVolume;
	//---------CONSTRUCTORS------------//
	public BigCup() {
			
	}
		
	public BigCup(String liquidName, Integer liquidVolume){
		super(liquidName, liquidVolume);
	}
	
	//-----------GETTER-----------//
	public Integer getLiquidVolume() {
		return liquidVolume;
	}
	
	//-----------SETTER-----------//
	public void setLiquidVolume(Integer liquidVolume) {
		if(liquidVolume >= 0 && liquidVolume <= 1000)
			this.liquidVolume = liquidVolume;
		else
			System.err.println("INCORRECT VOLUME FOR BIG CUP!");
	}
}
