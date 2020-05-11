package world;

public class DangerousLiquid extends Liquid{
	private String toxic;
	
	//--------CONSTRUCTOR---------//
	public DangerousLiquid(String name, Integer volume, Integer temperature,String toxic) {
		super(name,volume,temperature);
		setToxic(toxic);
	}

	//--------GETTER---------//
	public String getToxic() {
		return toxic;
	}

	//--------SETTER---------//
	public void setToxic(String toxic) {
		if(toxic.equals("Dangerous") || toxic.equals("EXTREMELY Dangerous") || toxic.equals("DEATH!!!"))
			this.toxic = toxic;
		else
			System.err.println("THERE IS NO SUCH TOXIC LEVEL OF DANGEROUS LIQUID! What are you drinking?");
	}	
}
