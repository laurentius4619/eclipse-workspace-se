

public class StudentFieldMain {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		Student student2 = new Student();
		
		
		/*
		 * 학생객체에기본데이타(번호,이름,국어,영어,수학)대입(2명)
		 */
		
		student1.num = 1;
		student1.name = "KIM";
		student1.kor = 90;
		student1.eng = 75;
		student1.math = 80;
		
		student2.num = 2;
		student2.name = "PARK";
		student2.kor = 91;
		student2.eng = 90;
		student2.math = 78;
		/*
		 * 학생총점,평균,평점계산후 대입(2명)
		 */
		student1.all = student1.kor+student1.math+student1.eng;
		student2.all = student2.kor+student2.math+student2.eng;
		student1.avg = student1.kor+student1.math+student1.eng/3;
		student2.avg = student2.kor+student2.math+student2.eng/3;
		
		if (student1.avg > 90) {
			student1.sco = 'A';
		} else if (student1.avg > 80) {
			student1.sco = 'B';
		} else if (student1.avg > 70) {
			student1.sco = 'C';
		} else if (student1.avg > 60) {
			student1.sco = 'D';
		} else {
			student1.sco = 'F';
		}
		
		/*
		 * 학생데이타출력2명
		 */
		
		System.out.println("---------------------------------------------------");
		System.out.println(" 학번   이름    국어 영어 수학  총점 평균 평점 석차");
		System.out.println("---------------------------------------------------");
		System.out.printf(" %d  %s    %d   %d   %d   %d  %.1f   %c   %d %n",student1.num,student1.name,student1.kor,student1.eng,student1.math,student1.all,student1.avg,student1.sco,student1.ran);
		System.out.printf(" %d  %s    %d   %d   %d   %d  %.1f   %c   %d",student2.num,student2.name,student2.kor,student2.eng,student2.math,student2.all,student2.avg,student2.sco,student2.ran);
	}

}

	
		

