package java_3장_제어문;

public class Test24 {

	public static void main(String[] args) {
		// if-else문과 switch문 비교
		String nation = "KOR";

		switch (nation) {
		case "KOR":
		case "CHN":
		case "JAP":
			System.out.println("아시아");
			break;
		case "GBR":
		case "FRA":
		case "EUA":
			System.out.println("유럽");
			break;
		case "USA":
		case "CAN":
		case "MEX":
			System.out.println("아메리카");
			break;
		}

		if (nation == "KOR" || nation == "CHN" || nation == "JAP") {
			System.out.println("아시아");
		} else if (nation == "GBR" || nation == "FRA" || nation == "EUA") {
			System.out.println("유럽");
		} else if (nation == "USA" || nation == "CAN" || nation == "MEX") {
			System.out.println("아메리카");
		}

	}

}
