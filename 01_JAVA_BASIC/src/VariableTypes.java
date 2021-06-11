
public class VariableTypes {

	public static void main(String[] args) {
		/*
		 * 논리형(1byte)
		 * - 논리형 변수
		 * - 논리형리터럴(값,데이터) : true,false
		 */
		boolean bool1;
		boolean bool2;
		boolean bool3;
		bool1= true;
		bool2= false;
		bool3= true;
		/* 한줄복사
		 *  ctrl + alt + down arrow
		 */
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println(bool3);
		
		/*
		 * 문자한개형(2byte)
		 * 문자형 리터럴(데이터,값):'A','힣','C','1'
		 * 문자형변수
		 */
		char munja1,munja2,munja3,munja4,munja5;
		munja1='A';
		munja2='힣';
		munja3='C';
		munja4='1';
		munja5='*';
		System.out.println(munja1);
		System.out.println(munja2);
		System.out.println(munja3);
		System.out.println(munja4);
		System.out.println(munja5);
		
		/*
		 * 숫자형
		 * 1.정수형(byte,short,int,long)
		 * 		-정수형리터럴 : 1,2,56,880,-90
		 * 2.실수형(float,double)
		 * 		-실수형리터럴 : 0.1 , .1, 3.14159, 10000.0
		 */
		byte b1 =3;
		byte b2 = -128;
		byte b3 = 127;
		byte b4 = 0b0111111;
		System.out.println(b3);
		System.out.println(b4);
		
		
		short s1 = 766;
		short s2 = -32768;
		short s3 = 32767;
		short s4 = 0b0111111111111111;
		System.out.println(s3);
		System.out.println(s4);
	
		
		long l1=232;
		long l2=-9890;
		long l3=-2147483648;
		long l4=2147483647;
		
		
		float f1,f2,f3;
		f1 = 0.1f;
		f2 = 3.14f;
		f3 = 1000.f;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
		
		
		int i1,i2,i3,i4;
		i1=90;
		i2=98;
		i3=-88;
		i4=2147483647;
		double d1,d2,d3;
		d1=3.141592;
		d2=123456789123456789.0;
		d3=0.123456789123456789;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		String str1="오늘은";
		String str2="금요일";
		String str3="변수를 공부합니다";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str1+" "+str2+" "+str3);
		System.out.println(str1+"월요일 연사자를 공부합니다");
		
		String name="최민규";
		int age=30;
		String address="서울시민";
		char gender='M';
		
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("주소:"+address);
		System.out.println("성별:"+gender);
		
	}

}
