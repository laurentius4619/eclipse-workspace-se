
public class ReferenceTypeArrayMain {

	public static void main(String[] args) {
		
		Account acc=new Account(8852,"HONG",56000,0.3);
		int[] ia=new int[5];
		Account[] accArray=new Account[5];
		
		accArray[0] =new Account(1111,"KIM",89000,0.6);
		accArray[0] =new Account(2222,"SIM",59000,0.2);
		accArray[0] =new Account(3333,"PIM",49000,0.6);
		accArray[0] =new Account(4444,"YIM",39000,0.4);
		accArray[0] =new Account(5555,"ZIM",29000,0.8);
		
		Account.headerPrint();
		for(int i=0; i<accArray.length;i++) {
			accArray[i].print();
		}
	}

}
