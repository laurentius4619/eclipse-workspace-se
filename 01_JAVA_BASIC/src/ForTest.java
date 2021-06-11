
public class ForTest {

	public static void main(String[] args) {
		System.out.println("------while-----");
		int k=0;
		while(k<10) {
			System.out.println("k="+k);
			k++;
		}
		System.out.println("-----for i 증가-----");
		for(int i=0;i<10;i++) {
			System.out.println("i="+1);
		}
		System.out.println("-----for i 감소-----");
		for(int i=10;i>10;i--) {
			System.out.println("i="+i);
		}
		System.out.println(">> 짝수 출력[1~10]"); // 홀수 출력:continue
		for (int i = 1; i < 10; i++) {
			if(i%2==0) {
				//continue; : 현재 실행 블록을 더 이상 실행하지 않고 다음 횟수 블록 실행
				System.out.print(i+",");
			}
		}
		System.out.println();
		System.out.println(">>3,4의 공배수[1~100]");
		for(int i=1;i<100;i++) {
			if(i%3==0 && i%4==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println(">>홀수,짝수합[1~100]");
		int tot=0;
		int oddTot=0;
		int evenTot=0;
		for(int i=1;i<=100;i++) {
			tot+=i;
			if(i%2==0) {
				oddTot+=i;
			}else {
				evenTot+=i;
			}
			
		}
		System.out.println("전제합:"+tot);
		System.out.println("홀수합:"+oddTot);
		System.out.println("짝수합:"+evenTot);
	}

}
