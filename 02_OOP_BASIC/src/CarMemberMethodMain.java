
public class CarMemberMethodMain {

	public static void main(String[] args) {
		Car car1=new Car();
		/*
		car1.no="7788";
		car1.inTime=5;
		*/
		car1.setIpChaData("7788",5);
		
		Car car2=new Car();
		car2.no="4885";
		car2.inTime=6;
		
		//4시간 후 
		//6시간 후 
		car1.outTime=10;
		car2.outTime=10;
		car1.fee=(car1.outTime-car1.inTime)*1000;
		car2.fee=(car2.outTime-car2.inTime)*1000;
		
		//영수증 출력
		car1.print();
		car2.print();
		
		//요금 계산
		car1.calculateFee();
		car2.calculateFee();
		
	}

}
