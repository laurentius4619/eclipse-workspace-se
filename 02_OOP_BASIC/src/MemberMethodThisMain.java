class MemberMethodThis{
	int memberField1;
	char memberField2;
	double memberField3;
	
	public void setData(int memberField1,char memberField2,double memberField3) {
		this.memberField1=memberField1;
	}
	
	public void print() {
		System.out.println();
		System.out.println(this.memberField1+"\t"+this.memberField2+"\t"+this.memberField3);
		/*
		 * this : 
		 * self 참조변수
		 * print 메소드를 가지고 있는 객체의 주소값
		 */
	}
}




public class MemberMethodThisMain {

	public static void main(String[] args) {
		MemberMethodThis mmt1=new MemberMethodThis();
		/*
		mmt1.memberField1=1;
		mmt1.memberField2='A';
		mmt1.memberField3=0.1;
		*/
		mmt1.setData(1,  'A', 0.1);
		/*
		System.out.println(mmt1.memberField1);
		System.out.println(mmt1.memberField2);
		System.out.println(mmt1.memberField3);
		*/
		System.out.println("main >"+mmt1);
		
		MemberMethodThis mmt2=new MemberMethodThis();
		/*
		mmt2.memberField1=2;
		mmt2.memberField2='B';
		mmt2.memberField3=0.2;
		*/
		mmt2.setData(2,'B',0.2);
		/*
		System.out.println(mmt2.memberField1);
		System.out.println(mmt2.memberField1);
		System.out.println(mmt2.memberField1);
		System.out.println("main >"+mmt2);
		*/
		
		MemberMethodThis mmt3=new MemberMethodThis();
		mmt3.memberField1=3;
		mmt3.memberField2='C';
		mmt3.memberField3=0.3;
		/*
		System.out.println(mmt3.memberField1);
		System.out.println(mmt3.memberField1);
		System.out.println(mmt3.memberField1);
		*/
		System.out.println();
		
	}

}
