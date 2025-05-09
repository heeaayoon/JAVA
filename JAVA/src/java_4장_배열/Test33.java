package java_4장_배열;

public class Test33 {

	public static void main(String[] args) {
		//객체 배열을 만들고 초기화하기
		int []arr = {10,20,30,40};
		
		/*
		int [] score;
		score = {1,2,3,4,5}; //Array constants can only be used in initializers
							 //배열은 선언과 동시에 초기화시켜야 생성됨
		*/
		
		int [] score;
		score = new int[] {1,2,3,4,5}; //new로 배열을 만들면 이후에 초기화시킬 수 있음
		System.out.println(score.length); //length는 메모리에 배열이 생성될 때마다 자동으로 만들어지는 변수임

	}

}
