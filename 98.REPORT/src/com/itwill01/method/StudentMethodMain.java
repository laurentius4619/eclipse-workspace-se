package com.itwill01.method;

public class StudentMethodMain {

	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		Student stu1 =new Student();
		Student stu2 =new Student();
		Student stu3 =new Student();
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		stu1.basicData(1, "김", 70, 80, 90, 1);
		stu2.basicData(2, "이", 80, 60, 80, 2);
		stu3.basicData(3, "박", 60, 70, 80, 3);
		/*
		 학생총점계산 메쏘드 호출(3명)
		 */
		stu1.sum();
		stu2.sum();
		stu3.sum();
		/*
		 학생평균계산 메쏘드 호출(3명)
		*/
		stu1.avg();
		stu2.avg();
		stu3.avg();
		/*
		 학생평점계산 메쏘드 호출(3명)
		 */
		stu1.sco();
		stu2.sco();
		stu3.sco();
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		System.out.println("---------------------------------------------");
		System.out.printf("%s %s %s %s %s %s %s %s %s%n","학번","이름","국어","영어","수학","총점","평균","평점","석차");
		System.out.println("---------------------------------------------");
		stu1.print();
		stu2.print();
		stu3.print();
		System.out.println("---------------------------------------------");
	}

}
