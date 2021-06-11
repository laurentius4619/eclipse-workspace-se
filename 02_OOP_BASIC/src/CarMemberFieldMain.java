
public class CarMemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 1.차량입차 1234번차량 12시
		 */
		
		//차객체데이타를 저장할 변수선언
		Car car;
		//Car 클래스를 사용해서 객체를 생선한 후 Car변수에 대입
		car=new Car();
		
		//차 객체의 no맴버필드
		car.no="1234";
		car.inTime=12;
		
		/*
		 * 2. 16시 car차 출차(1234)
		 */
		
		//차객체의 outTime맴버필드(변수)에 16대입
		car.outTime=16;
		//주차요금계산
		//차객체의 fee맴버필드(변수)에 계산 후 대입
		car.fee = (car.outTime-car.inTime)*1000;
		
		//영수증출력
				System.out.println("-----------------------------------");
				System.out.println("차량번호 입차시간 출차시간 주차요금");
				System.out.println("-----------------------------------");
				System.out.println(car.no+"\t"+car.inTime+"\t"+car.outTime+"\t"+car.fee);
				System.out.printf("%7s %7d %9d %8d%n",car.no,car.inTime,car.outTime,car.fee);
	}

}
