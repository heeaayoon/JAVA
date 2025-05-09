package java_3장_제어문;

public class Test19 {

	public static void main(String[] args) {
		// if문
		int score1 = 90;
		String result1 = "";

		if (score1 >= 60) {
			result1 = "합격";
		}
		System.out.println(result1);

		// if-else문
		int score2 = 90;
		String result2 = "";

		if (score2 >= 60) {
			result2 = "합격";
		} else {
			result2 = "물합격";
		}
		System.out.println(result2);

		// 삼항연산자
		int score3 = 90;
		System.out.println(score3 >= 60 ? "합격" : "불합격");

	}
}
