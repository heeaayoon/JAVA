package eduTest;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		//아직 안푼거 -- (변겨점 테스트)
		Scanner sc = new Scanner(System.in);
		System.out.print("Number [0입력시 종료] : ");
		int num = sc.nextInt();
		boolean[] isPrime = new boolean[num+1];
		//Arrays.fill(isPrime , true);
		// 0, 1은 소수가 아니므로 false
		isPrime [0] = isPrime [1] = false;
		
		while(true) {
			if(num == 0) {
				break;
			}
		}	
	/*
	//Arrays.fill(isPrime , true);
    
	// 소수는 true
	
	//for(int i=2; i*i<=n; i++){
		// 만약 i가 소수 혹은 아직 지워지지 않았다면
		if(isPrime[i]){
			// i의 배수 j들에 대해 isPrime[j] = false; 로 둔다.
			// i*i미만의 배수는 이미 지워졌으므로 신경쓰지 않는다.
			for(int j=i*i; j<=n; j+=i) {
				isPrime[j] = false;                
			}
		}        
	}    
	// 1 ~ 120 사이의 소수 출력
	for(int i=1; i<=n ;i++){
		if(isPrime[i]) System.out.print(i+" ");        
	}*/		
	}
}
