package tools;
import kitchen.*;
import world.*;

public class LiquidTester{
	public static boolean isDrinkable( Cup cup ){
		if(cup.getLiquid() instanceof DrinkableLiquid )
			return true;
		else
			return false;
	}
}
