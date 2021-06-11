
public class StudentPrint {

	public static void main(String[] args) {
		/*
		 * 1.클래스이름
		 * 		StudenPrint
		 * 2.클래스 구성요소
		 * 		메인메쏘드블록1개
		 * 3.실행결과
		 * ---------------학생 성적출력--------------------
		 * 학번  이름  국어 영어 수학 총점   평균  평점 석차
		 * ------------------------------------------------
		 * 1    KIM    34   45   67   200   68.2   C    0
		 * 2    HIM    34   45   67   200   68.2   C    0
		 * 3    FIM    34   45   67   200   68.2   C    0
		 */

		int num1, num2, num3;
		String name1, name2, name3;
		int kor1, kor2, kor3;
		int eng1, eng2, eng3;
		int math1, math2, math3;
		int all1, all2, all3;
		double avg1, avg2, avg3;
		char sco1, sco2, sco3;
		char ran1, ran2, ran3;
		
		num1 = 1;
		num2 = 2;
		num3 = 3;
		kor1 = 34;
		kor2 = 34;
		kor3 = 34;
		eng1 = 45;
		eng2 = 45;
		eng3 = 45;
		math1 = 67;
		math2 = 67;
		math3 = 67;
		all1 = 200;
		all2 = 200;
		all3 = 200;
		avg1 = 68.2;
		avg2 = 68.2;
		avg3 = 68.2;
		sco1 = 'C';
		sco2 = 'C';
		sco3 = 'C';
		ran1 = '0';
		ran2 = '0';
		ran3 = '0';
		name1 = "KIM";
		name2 = "HIM";
		name3 = "FIM";
		
		System.out.println("---------------학생 성적출력--------------------");
		System.out.println("학번  이름  국어 영어 수학 총점   평균  평점 석차");
		System.out.println("------------------------------------------------");
		System.out.println(num1+"  "+name1+"  "+kor1+"  "+eng1+"  "+math1+"  "+all1+"  "+avg1+"  "+sco1+"  "+ran1);
		System.out.println(num2+"  "+name2+"  "+kor2+"  "+eng2+"  "+math2+"  "+all2+"  "+avg2+"  "+sco2+"  "+ran2);
		System.out.println(num3+"  "+name3+"  "+kor3+"  "+eng3+"  "+math3+"  "+all3+"  "+avg3+"  "+sco3+"  "+ran3);
		
		
	}

}
