class MemberMethodReturn{
	int member1;
	int member2;
	
	public int method1() {
		System.out.println("-------public int method1()-------");
		int result=1+2;
		/*
		 return  <<호출한 클래스(객체)에게 반환할값(변수,리터럴,연산의결과)>>
		  	- 호출한곳으로 실행흐름(쓰레드) 반환
		  	- 호출한곳으로 데이타반환
		  	- 반환할 데이타가없는 경우에는(void) return문 생략가능하다. 
		  	- 반환할 데이타가있는 경우에는 		 return문 반드시기술하여야 한다. 
		 */
		return result;
	}
	public boolean method2() {
		System.out.println("-------public boolean method2()------");
		boolean married = true;
		return married;
	}
	/*
	 * 두개의 정수를 매개변수로받아서 더한후 결과값을 반환
	 */
	public int add(int a,int b) {
		System.out.println("---------public int add(int a,int b)-------");
		int result=a+b;
		return result;
	}
	/*
	 * 객체의멤버변수 2개를 더한결과값을 반환
	 */
	public int addMembers() {
		int result = this.member1+this.member2;
		return result;
	}
	
	
}
public class MemberMethodReturnMain {

	public static void main(String[] args) {
		MemberMethodReturn mmr=new MemberMethodReturn();
		mmr.member1=78;
		mmr.member2=11;
		/*
		 public int method1();
		 */
		int recvData1 = mmr.method1();
		System.out.println("main block --> recvData1:"+recvData1);
		/*
		public boolean method2() 
		 */
		boolean recvData2 = mmr.method2();
		System.out.println("main block --> recvData2:"+recvData2);
		/*
		public int add(int a,int b)
		 */
		int addResult = mmr.add(12,789979);
		System.out.println("main block --> addResult:"+addResult);
		addResult=mmr.add(213123, 212);
		System.out.println("main block --> addResult:"+addResult);
		
		int recvAddMembers = mmr.addMembers();
		System.out.println("main --> recvMembers:"+recvAddMembers);
	}
}