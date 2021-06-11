
public class WhileNested {

	public static void main(String[] args) {
		/*
		 * ★★★★★
		 * ★★★★★
		 * ★★★★★
		 * ★★★★★
		 * ★★★★★
		 */
		//int i=0;
			//	while(i<5) {
		int i =0;
		while(i < 5) {
			int j=0;
			System.out.printf("★");
			j++;
		}
		System.out.println();
		i++;			
		
	//System.out.println("2.---------------------------------");
	/*
	 ☆★★★★
	 ★☆★★★
	 ★★☆★★
	 ★★★☆★
	 ★★★★☆
	 */
		i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				if(j == i)
					System.out.printf("☆");
				else
					System.out.printf("★");
				j++;
			}
			System.out.println();
			i++;
		}	//System.out.println("3.---------------------------------");
	/*
	 ☆☆☆☆☆
	 ★☆☆☆☆
	 ★★☆☆☆
	 ★★★☆☆
	 ★★★★☆
	 */
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				if(j < i)
					System.out.printf("★");
				else
					System.out.printf("☆");
				j++;
			}
			System.out.println();
			i++;
		}	//System.out.println("4.---------------------------------");
	/*
	 ★
	 ★★
	 ★★★
	 ★★★★
	 ★★★★★
	 */
		i = 0;
		while (i < 5) {
			int j = 0;
			while (j <= i) {
				System.out.printf("★");
				j++;
			}
			System.out.println();
			i++;
		}
		/*
		 ★
		 ★★
		 ★★★
		 ★★★★
		 ★★★★★
		 */

	}

}
