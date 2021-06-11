
public class ConstructorMain {

	public static void main(String[] args) {
		Constructor c1 = new Constructor();
		/*
		 * <new Constructor();>
		 * Constructor 클래스 객체생성
		 * 생성자 호출
		 * 객체의 주소반환
		 */
		System.out.println("c1 객체주소: >"+c1);
		c1.print();
		
		Constructor c2=new Constructor();
		System.out.println("c2객체주소:-->"+c2);
		c2.print();
		
		Constructor c3=new Constructor(800, 900);
		c3.print();
		c3.setConstructorData(888, 999);
		c3.print();
		System.out.println("-------기본생성자---------");
		DefaultConstructor dc=new DefaultConstructor();
		System.out.println(dc);
	}

}
