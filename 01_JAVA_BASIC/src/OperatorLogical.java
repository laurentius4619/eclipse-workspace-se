/*
 * 	논리연산자
 * 		형태: (Logical OR) || , && (Logical AND) (|,&)
 * 		좌우측항이 논리형변수(or리터럴)
 * 		결과도 논리형데이타
 * 		ex> true || false, false && false
 */
public class OperatorLogical {

	public static void main(String[] args) {

		boolean b1,b2,b3,b4;
		b1=true;
		b2=true;
		b3=false;
		b4=false;
		boolean result;
		
		/*
		 * 논리합(Logical or) ||
		 * > false || false인 경우에만 false 반환
		 */
		result = b3||b4;
		System.out.println("false||false  >"+result);
		/*
		 * 논리곱(Logical and) &&
		 * 	>true || true 인 경우에만 true 반환
		 */
		result = b1 && b2;
		System.out.println("true && true  >"+result);
		
		System.out.println("----------------");
		int kor=95;
		int math=23;
		System.out.println("----A대학 국어, 영어중 1과목만 90점 이상 합격----");
		boolean isPass = (kor>=90) || (math>=90);
		System.out.println("A대학 합격여부 :"+isPass);
		boolean isPass2 = (kor>=90) && (math>=90);
		System.out.println("B대학 합격여부 :"+isPass2);
		
		System.out.println("점수의 유효성체크(0~100)");
		int eng = -78;
		boolean isValid = eng>=0 && eng<=100;
		System.out.println("유효한점수여부:"+isValid);
		System.out.println("----------배수판별----------");
		int number=32;
		boolean bb=(number%3==0);
		boolean bb2=(number%4==0);
		boolean bb3= bb && bb2;
		System.out.println("3의배수여부:"+bb);
		System.out.println("4의배수여부:"+bb2);
		System.out.println("3과4의배수여부:"+bb3);
		
		/*
		 * Quiz: 윤년여부판단
		 * - 4의배수(4로 나누어떨어지는수)이면서 100의 배수가 아닌수(100로 나누어 떨어지지 않는수)
		 * - 400의배수 (400로 나누어 떨어지는 수)
		 */
	
		int year = 2021;
		boolean isLeapYear=true;
		
		
		
		
	}

}
