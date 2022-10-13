package lambda_ex.ch02;

/**
 * 
 * @author 김근호
 *  두 수중에 큰 수를 반환 하는 기능을 만들어 주세요 
 *  ( 람다식으로 사용할 예정) 
 */
@FunctionalInterface
public interface IMaxNumber {
	int  getMax(int x, int y); 
}
