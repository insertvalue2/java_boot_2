package ch17;

public class MainTest1 {

	public static void main(String[] args) {
		
		AirPod airPod1 = new AirPod(); 
		TeddyBear bear1 = new TeddyBear();
		TeddyBear bear2 = new TeddyBear();
		
		Product[] products = new Product[3];
		products[0] = airPod1; 
		products[1] = bear1;
		products[2] = bear2; 
		
		
		ToyMachine machine1 = new ToyMachine();
		machine1.setProducts(products);  // 상품을 밀어 넣다. 
		
		// 실행 랜덤 클래스 스캐너를 이용해서 .... 
		// count = 2 
		Product[] gift =  machine1.getProduct(3);
		for (int i = 0; i < gift.length; i++) {
			gift[i].showInfo();
		}
	}
}
