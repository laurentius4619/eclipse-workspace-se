package com.itwill00.variable;

public class DuoMemberInfoPrint {

	public static void main(String[] args) {
		/*
		 * 1.출력할 데이타를 담을 변수선언
		 */
		int no = 181818;
		String name = "홍길동";
		String num = "201212 - 3495039";
		String gender = "male";
		boolean smoke = true;
		int marry = 0;
		/*
		 * 2.변수에데이타대입
		 */
		no=181818;
		name="홍길동";
		num="201212 - 3495039";
		gender = "male";
		marry=0;
		
		/*
		 * 3.변수를 출력
		 */
		System.out.println("*************************");
		System.out.println("회원번호 : "+no);
		System.out.println("이   름 : "+name);
		System.out.println("주민번호 : "+num);
		System.out.println("성   별 : "+gender);
		System.out.println("결혼여부 : : "+marry);
		System.out.println("흡연여부 : "+smoke);
		System.out.println("*************************");
		
		
		/*
		*************************
		회원번호 : 181818
		이    름 : 홍길동
		주민번호 : 201212-3495039
		성    별 : male
		결혼횟수 : 0
		흡연여부 : true	
		**************************
		 */
	}

}
