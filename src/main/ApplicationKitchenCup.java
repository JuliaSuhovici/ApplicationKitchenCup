package main;
import kitchen.Cup;

public class ApplicationKitchenCup {
	public static void main(String[] args) {
		Cup cupA = new Cup("Milk", 300);
		Cup cupB = new Cup("Water", 500);
		SmallCup cupC = new SmallCup("Tea", 250);
		BigCup cupD = new BigCup("Water", 200);
		
		cupA.setLiquidVolume(cupA.getLiquidVolume()-50);  //pouring out 50ml of milk
		cupB.setLiquidVolume(cupB.getLiquidVolume()+50);  //adding 50ml of water
		cupD.setLiquidVolume(cupD.getLiquidVolume()+cupB.getLiquidVolume()); //pouring all liquid from cupB to cupD
		cupB.setLiquidVolume(0);	 //now cupB is empty
		
		System.out.println("------Cup A------");
		System.out.println("Liquid Name: " + cupA.getLiquidName());
		System.out.println("Liquid Volume: " + cupA.getLiquidVolume());
		
		System.out.println("------Cup B------");
		System.out.println("Liquid Name: " + cupB.getLiquidName());
		System.out.println("Liquid Volume: " + cupB.getLiquidVolume());
		
		System.out.println("-----Small Cup-----");
		System.out.println("Liquid Name: " + cupC.getLiquidName());
		System.out.println("Liquid Volume: " + cupC.getLiquidVolume());
		
		System.out.println("------Big Cup------");
		System.out.println("Liquid Name: " + cupD.getLiquidName());
		System.out.println("Liquid Volume: " + cupD.getLiquidVolume());
	}
}
