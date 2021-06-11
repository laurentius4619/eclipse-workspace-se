package com.itwill00.variable;

public class StudentPrint {

	public static void main(String[] args) {
		/*
		 * 1.출력할 데이타를 담을 변수선언
		 *  << 학번,이름,국어,영어,수학,총점,평균,평점,석차 >>
		 */
		int num;
		String name;
		int kor;
		int eng;
		int math;
		int all;
		double avg;
		char sco;
		char ran;
		/*
		 * 2.변수에데이타대입
		 *  << 학번,이름,국어,영어,수학>>
		 *  << 총점,평균,평점,석차>> 
		 */
		num=1;
		name="KIM";
		kor=23;
		eng=56;
		math=44;
		all=456;
		avg=23.5;
		sco='A';
		ran='7';
		/*
		 * 3.변수를 출력
		---------------학생 성적출력--------------------
		학번  이름  국어 영어 수학 총점   평균 평점 석차
		------------------------------------------------
		 */
		System.out.println("---------------학생 성적출력-----------------------");
		System.out.println("학번  이름  국어  영어  수학  총점   평균 평점 석차");
		System.out.println("---------------------------------------------------");
		//System.out.println(" 1   KIM    23   56    44    456    23.5  A    7");
		System.out.println(num+"  "+name+"  "+kor+"  "+eng+"  "+math+"  "+all+"  "+avg+"  "+sco+"  "+ran);		
	}

}
