package kitchen;

public class SmallCup extends Cup {
	
	//---------CONSTRUCTORS------------//
	public SmallCup() {
		
	}
	
	public SmallCup(String liquidName, Integer liquidVolume){
		super(liquidName, liquidVolume);
	}
	
	//-----------SETTER-----------//
	public void setLiquidVolume(Integer liquidVolume) {
		if(liquidVolume >= 0 && liquidVolume <= 250)
			this.liquidVolume = liquidVolume;
		else
			System.err.println("INCORRECT VOLUME FOR SMALL CUP!");
	}
}
