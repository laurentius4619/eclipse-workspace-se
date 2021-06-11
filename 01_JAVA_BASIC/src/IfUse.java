
public class IfUse {

	public static void main(String[] args) {
		/*
		 * 짝수홀수판별후출력
		 */
		int no1=56;
		if(no1%2==0) {
			//System.out.println(no1+"는 짝수입니다.");
			System.out.printf("%d는 %s입니다.%n",no1,"짝수");
		}else {
			//System.out.println(no1+"는 홀수입니다");
			System.out.printf("%d는 %s 입니다.%n",no1,"홀수");
		}
		/*
		 * 4의 배수 판별 후 출력
		 */
		int no2=5684;
		if(no2%4==0) {
			System.out.printf("%d는 4의배수 %n",no2);
		}else {
			System.out.printf("%d는 4의배수 아님%n",no2);
		}
		/*
		 * 점수의 유효성 체크
		 */
		int kor=-90;
		if(kor>=0 && kor<=100) {
			System.out.printf(" %d은 유효한점수입니다.%n",kor);
		}else {
			System.out.printf("%d 은 유효한점수 아닙니다.%n",kor);
		}
		/*
		 * 윤년여부체크
		 */
		int year=2021;
		if((year%4==0 && year%100!=0)|| year%400==0) {
			System.out.printf("%d는 윤년입니다.%n",year);
		}else {
			System.out.printf("d는 평년입니다.%n",year);
		}
		
	
	}

}
