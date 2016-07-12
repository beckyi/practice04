package prob1;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		int sum = 0;
		int i;
		Scanner scanner = new Scanner( System.in );
		System.out.print( "숫자를 입력하세요: " );
		
		int inputNumber = scanner.nextInt();

		/* 여기에 구현 코드를 작성 합니다. */
		if(inputNumber%2==0){
			i=0;
			while(i<inputNumber){
				i+=2;
				sum +=i;
			}
		}else{
			i=1;
			sum=1;
			while(i<inputNumber){
				i +=2;
				sum += i;
			}
		}
		System.out.println("결과 값 : "+sum);
		
		scanner.close();
	}

}
