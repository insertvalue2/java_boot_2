package wrapper_ex;

public class MainTest8 {
	public static void main(String[] args) {

		// String medal = "GOld";  입력값이 비슷하게 들어 올 수 있지만 오류를 발생시킬 수 있다.
		Medal medal = Medal.BRONZE;
		
		switch (medal) {
		case GOLD:
			System.out.println("금메달입니다.");
			break;
		case SIVEL:
			System.out.println("은메달입니다.");
			break;
		case BRONZE:
			System.out.println("동메달입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
		}
	}
}
