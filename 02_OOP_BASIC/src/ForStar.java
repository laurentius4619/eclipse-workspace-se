public class ForStar {

	public static void main(String[] args) {
		
		System.out.println("1.------------------------");
		/*
		 * ★★★★★ 
		 * ★★★★★ 
		 * ★★★★★ 
		 * ★★★★★ 
		 * ★★★★★
		 */
		for (int i = 0; i < 5; i++) {   // 세로줄 식
			for (int j = 0; j < 5; j++) {  //  가로줄 식
				System.out.printf("%s","★");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------------");
		/*
		☆★★★★
		★☆★★★
		★★☆★★
		★★★☆★
		★★★★☆
		*/
		for (int i =0; i<5; i++) {
			for (int j = 0; j < 5; j++) {
				if(j==i) {
					System.out.print("☆");
				}else {
					System.out.print("★");
					}
				}
			System.out.println();
			}
		System.out.println("-------------------------------------------------------");
		/*
		 ☆☆☆☆☆
		 ★☆☆☆☆
		 ★★☆☆☆
		 ★★★☆☆
		 ★★★★☆
		 */
		for (int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				if(j<i) {
					System.out.print("★");
				}else {
					System.out.print("☆");
					}
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------------");
		
		/*
		★
		★★
		★★★
		★★★★
		★★★★★
		*/
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(j<=i) {
					System.out.printf("%s","★");
				}
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------------");
		/*
		★★★★★
		★★★★
		★★★
		★★
		★
		*/
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(j>=i) {
					System.out.printf("%s","★");
				}
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------------");
		/*
		★★★★★
		 ★★★★
		  ★★★
		   ★★
	        ★
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(j>=i) {
					System.out.printf("%s","★");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	
		

	}

}