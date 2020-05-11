package main;
import kitchen.*;
import world.*;

public class ApplicationKitchenCup {
	public static void main(String[] args) {
		
		Liquid water = new Liquid("Water", 100, 18);
		Cup standartCup = new Cup(water);
		standartCup.setLiquid(water.getVolume() + 50);
		
		standartCup.print();
		
		DrinkableLiquid coffee = new DrinkableLiquid("Coffee", 1000, 60, "Hot Drinks");
		BigCup cupA = new BigCup(coffee);
		cupA.print();
		System.out.println(coffee.getCategory());
		
		DangerousLiquid antiseptic = new DangerousLiquid("Antiseptic", 100, 20, "DEATH!!!");
		SmallCup cupB = new SmallCup(antiseptic);
		cupB.print();
		System.out.println(antiseptic.getToxic());
	}
}
