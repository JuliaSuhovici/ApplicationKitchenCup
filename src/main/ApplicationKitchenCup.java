package main;
import kitchen.Cup;

public class ApplicationKitchenCup {
	public static void main(String[] args) {
		Cup cupA = new Cup("Milk", 300);
		Cup cupB = new Cup("Water", 500);
		
		cupA.setLiquidVolume(cupA.getLiquidVolume()-50);  //pouring out 50ml of milk
		cupB.setLiquidVolume(cupB.getLiquidVolume()+50);  //adding 50ml of water
		
		System.out.println("------Cup A------");
		System.out.println("Liquid Name: " + cupA.getLiquidName());
		System.out.println("Liquid Volume: " + cupA.getLiquidVolume());
		
		System.out.println("------Cup B------");
		System.out.println("Liquid Name: " + cupB.getLiquidName());
		System.out.println("Liquid Volume: " + cupB.getLiquidVolume());
	}
}
