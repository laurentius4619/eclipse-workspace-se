package com.itwill01.method;
/*
 * 성적처리를위해 필요한 학생객체를 만들기위한클래스(틀,타입)
 */
public class Student {
	/*
	 *  << 속성 >> 번호,이름, 국어, 영어, 수학, 총점, 평균, 평점(A,B,C), 석차를 저장할 필드의선언
	 */
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int all;
	double avg;
	char sco;
	int rank;
	/*
	 *   << 기능 >> 기본데이타입력,총점계산,평균계산,평점계산, 출력
	 */
	public void basicData(int no, String name, int kor, int eng, int math, int rank) {
		this.no=no;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.rank=rank;
	}
	public void sum() {
		this.all=this.kor+this.eng+this.math;
	}
	public void avg() {
		this.avg=(double)(this.kor+this.eng+this.math)/3;
	}
	public void sco() {
		if(this.avg >= 90) {             
			this.sco = 'A';
		}else if(this.avg >= 80) {
			this.sco = 'B';
		}else if(this.avg >= 70) {     
			this.sco = 'C';
		}else if(this.avg >= 60) {
			this.sco = 'D';
		}else {
			this.sco = 'F';
		}
	}
	public void print() {
		System.out.printf("%2d %8s %4d %7d %7d %7d %8.1f %5c %7d%n",this.no,this.name,this.kor,this.eng,this.math,this.all,this.avg,this.sco,this.rank);
	}
}
