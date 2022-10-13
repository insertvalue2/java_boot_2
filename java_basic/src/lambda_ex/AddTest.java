package lambda_ex;

public class AddTest {
	public static void main(String[] args) {
	 	 IAdd iAdd =  (int x, int y) -> {return x + y;};
	 	 System.out.println(iAdd.add(10, 1));
	 	 System.out.println(iAdd.add(100, 500));
	 	 System.out.println(iAdd.add(2, 5));
	 	 
	 	IAdd iAdd2 = new IAdd() {
			@Override
			public int add(int x, int y) {
				// TODO Auto-generated method stub
				return x + y;
			}
		};
	}
}

// 람다식 사용하기 위해서는 미리 정의 되어 있어야 한다. --> 인터페이스가 !! (단 추상메서드는 반드기 한개이여야 한다) 

interface IAdd {
	public int add(int x, int y); 
	//public int minus(); 
}