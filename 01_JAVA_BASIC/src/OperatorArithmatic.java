
public class OperatorArithmatic {

	public static void main(String[] args) {

		int a=1;
		int b=2;
		int result=0;
		double dresult=0.0;
		
		result = a+b;
		System.out.println("a+b  >" +result);
		result = a-b;
		System.out.println("a-b  >" +result);
		result = a*b;
		System.out.println("a*b  >" +result);
		result = a/b;
		System.out.println("a/b  >" +result);
		dresult = a/b;
		System.out.println("a/b  >" +result);
		/*
		 * % 나머지 연산자
		 */
		
		result = a % b;
		System.out.println("a % b  >"+result);
		
		int year = 2021;
		result = year % 4; //0,1,2,3
		System.out.println("2021 % 4  >"+result);
		result = year % 100; //0~99
		System.out.println("2021 % 100  >"+result);
		result = year % 400; //0~399
		System.out.println("2021 % 400  >"+result);
		
		int no=16;
		result = no % 4;
		System.out.println("result값이 0이면 4의배수:"+result);
		/*
		 * 문자연산
		 */
		
		System.out.println("-----------문자연산-----------");
		char ca='A';
		char cz='Z';
		char c='A';
		System.out.println(c);
		c ='A'+1;
		System.out.println(c);
		c ='A'+2;
		System.out.println(c);
		c = 'A'+3;
		System.out.println(c);
		
		
		
		
		result=ca;
		System.out.println(ca);
		System.out.println("A의 십진수:"+result);
		result =ca+1;
		System.out.println("A+1의 십진수"+result);
		char cresult = (char)result;
		System.out.println("cresult:"+cresult);
		int numOfAlphabet = cz-ca+1;
		System.out.println("numOfAlphabet:"+numOfAlphabet);
		int numOfHangul = '힣'-'가'+1;
		System.out.println("numOfHangul:"+numOfHangul);
		
		/*
		 * 비트연산
		 * <<, >>
		 */
		// int d = 1;
		int d = 0b00000000;
		result = d<<1;
		
	}

}
