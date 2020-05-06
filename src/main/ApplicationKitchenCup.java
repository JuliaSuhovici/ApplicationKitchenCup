package main;
import kitchen.*;
import world.Liquid;

public class ApplicationKitchenCup {
	public static void main(String[] args) {
		
		Cup standartCup = new Cup("Water", 500, 18);
		standartCup.setLiquid(standartCup.getLiquidVolume() + 50);
		
		standartCup.print();
	}
}
