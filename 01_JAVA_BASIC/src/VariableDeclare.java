
public class VariableDeclare {

	public static void main(String[] args) {
		int score1;//변수의 선언
		score1 = 78;//변수에 값 대입
		System.out.println(score1);//변수의 값 출력
		score1 = 99;//변수의 값 대입 
		System.out.println(score1);//변수의 값 출력
		
		int score2 = 5657;
		System.out.println(score2);
		
		int _number=333;
		int $number=444;
		int 번호=555;
		System.out.println(_number);
		System.out.println($number);
		System.out.println(번호);
		/*
		 * int 7number;
		 * int my score;
		 * int my-score;
		 */
		int kor,eng,math;
		kor=89;
		eng=90;
		math=93;
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		/*
		 * <<Duplicate local variable kor>>
		 * int kor;
		 */
		/*
		 * <<history cannot be resolved to a variable>>
		 * history=88;
		 */
		
		/*
		 * 변수선언
		 * 데이터타입 이름(식별자);
		 */
		String name;
		name= "김경호";
		System.out.println("name");
		
	}

}
