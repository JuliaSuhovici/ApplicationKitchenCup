package main;
import kitchen.*;
import world.Liquid;

public class ApplicationKitchenCup {
	public static void main(String[] args) {
		//-------CUP------//
		Cup cupA = new Cup("Milk", 300);
		Cup cupB = new Cup("Water", 500);
		SmallCup cupC = new SmallCup("Tea", 250);
		BigCup cupD = new BigCup("Water", 200);
		
		cupA.setLiquidVolume(cupA.getLiquidVolume()-50);  //pouring out 50ml of milk
		cupB.setLiquidVolume(cupB.getLiquidVolume()+50);  //adding 50ml of water
		cupD.setLiquidVolume(cupD.getLiquidVolume()+cupB.getLiquidVolume()); //pouring all liquid from cupB to cupD
		cupB.setLiquidVolume(0);	 //now cupB is empty
		
		System.out.println("//Info about cups://");
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
		
		//-------LIQUID------//
		Liquid firstLiquid = new Liquid("Water", 250, 40);
		Liquid secondLiquid = new Liquid("Milk", -90, 12); //ERROR: WRONG VOLUME
		Liquid thirdLiquid = new Liquid("Coffee", 150, -2);//ERROR: WRONG TEMPERATURE
		
		System.out.println("//Info about liquids://");
		
		System.out.println("------First Liquid------");
		System.out.println("Name: " + firstLiquid.getName());
		System.out.println("Volume: " + firstLiquid.getVolume());
		System.out.println("Temperature: " + firstLiquid.getTemperature());
		
		System.out.println("------Second Liquid------");
		System.out.println("Name: " + secondLiquid.getName());
		System.out.println("Volume: " + secondLiquid.getVolume());
		System.out.println("Temperature: " + secondLiquid.getTemperature());
		
		System.out.println("------Third Liquid------");
		System.out.println("Name: " + thirdLiquid.getName());
		System.out.println("Volume: " + thirdLiquid.getVolume());
		System.out.println("Temperature: " + thirdLiquid.getTemperature());
		
		System.out.println();
		if(firstLiquid.isHot()) System.out.println(firstLiquid.getName() + " is HOT! The temperature is " + firstLiquid.getTemperature()); //true
		System.out.println(secondLiquid.isCold()); //true
		System.out.println(thirdLiquid.isCold());  //false
	}
}
