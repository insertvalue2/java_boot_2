package generic_ex.ch02;

import java.util.ArrayList;

import generic_ex.ch01.Plastic;
import generic_ex.ch01.Powder;

public class MainTest {
	public static void main(String[] args) {
		
		// 재료 
		Powder  powder = new Powder();
		Plastic plastic = new Plastic(); 
		
		// 사용방법 
		GenericPrinter<Powder> genericPrinter = new GenericPrinter<>();
		//ArrayList<Integer> a = new ArrayList<>();
		
		// 재료 셋팅 
		genericPrinter.setMaterial(powder);
		Powder usePowder = genericPrinter.getMaterial(); 
		System.out.println(usePowder);
		
		
		// 플라스 사용하는 
		
		
		
		
	}
}
