package com.itwill00.variable;

public class StudentScorePrint {

	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 	- 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A,B,C), 석차
		 */
		int num1,num2;
		String name1,name2;
		int kor1,kor2;
		int eng1,eng2;
		int math1,math2;
		int all1,all2;
		double avg1,avg2;
		char sco1,sco2;
		char ran1,ran2;
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */
		num1=1; num2=2;
		name1="김경호"; name2="김경수";
		kor1=42; kor2=45;
		eng1=56; eng2=53;
		math1=78; math2=76;
		all1=334; all2=334;
		avg1=34.8; avg2=34.8;
		sco1='A'; sco2='A';
		ran1='3'; ran2='2';
		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 *   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
		if(kor1 < 0 || kor1 > 100 || eng1 < 0 || eng1 > 100 || math1 < 0 || math1 > 100) {
			System.out.println(name1+"학생 알 맞은 값을 입력하세요:1~100");
			return;
		}
		if(kor2 < 0 || kor2 > 100 || eng2 < 0 || eng2 > 100 || math2 < 0 || math2 > 100) {
			System.out.println(name2+"학생 알 맞은 값을 입력하세요:1~100");
			return;
		}
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
		all1=kor1+eng1+math1;
		all2=kor2+eng2+math2;
		avg1 = ((int) (all1 / 3.0 * 100) + 5) / 100.0;
		avg2 = ((int) (all2 / 3.0 * 100) + 5) / 100.0;
		
		sco1 = ' '; 
		if(avg1>=90) {
			sco1 = 'A';
		}else if(avg1>=80) {
			sco1 = 'B';
		}else if(avg1>=70) {
			sco1 = 'C';
		}else if(avg1>=60) {
			sco1 = 'D';
		}else {
			sco1 = 'F';
		}
		
		sco2 = ' ';
		if(avg2>=90) {
			sco2 = 'A';
		}else if(avg2>=80) {
			sco2 = 'B';
		}else if(avg2>=70) {
			sco2 = 'C';
		}else if(avg2>=60) {
			sco2 = 'D';
		}else {
			sco2 = 'F';
		}
		/*
		- 출력포맷
 		- 평균은 소수점이하 2째자리수에서 반올림하세요(%f)
 		- 석차는 구하지마세요
		--------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   42   56   78   334  34.8  A   3  
		 2   김경수   45   53   76   334  34.8  A   2  
		-----------------------------------------------
		*/
		System.out.println("-----------학생 성적출력-------------");	
		System.out.println("학번 이름 국어 영어 수학 총점 평균  평점 석차");	
		System.out.println("---------------------------------");
		System.out.println(num1+"  "+name1+"  "+kor1+"  "+eng1+"  "+math1+"  "+all1+"  "+avg1+"  "+sco1+"  "+ran1);
		System.out.println(num2+"  "+name2+"  "+kor2+"  "+eng2+"  "+math2+"  "+all2+"  "+avg2+"  "+sco2+"  "+ran2);
	}

}
