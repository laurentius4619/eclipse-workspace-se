
public class DuoMemberInfoPrint {

	public static void main(String[] args) {
		/*
		 * 1.클래스이름
		 * 		DuoMemberInfoPrint 
		 * 2.클래스 구성요소
		 * 		메인메쏘드블록1개
		 * 3.실행결과
		 * 회원번호 : 181818
		 * 이    름 : 홍길동
		 * 주민번호 : 201212-3495039
		 * 성    별 : male
		 * 결혼횟수 : 0
		 * 흡연여부 : true
		 */

		int num = 181818;
		String name = "홍길동";
		String num2 = "201212 - 3495039";
		String gender = "male";
		int marry = 0;
		boolean smoke = true;
		
		System.out.println("**************************");
		System.out.println("회원번호 : "+num);
		System.out.println("이   름 : "+name);
		System.out.println("주민번호 : "+num2);
		System.out.println("성   별 : "+gender);
		System.out.println("결혼횟수 : "+marry);
		System.out.println("흡연여부 : "+smoke);
		System.out.println("**************************");
		
	}

}
