package bankAccountKata.factory;

import bankAccountKata.bean.Account;

public class AccountFactory {

	private static int idIncrement;
	
	public static Account creatAccount() {
		idIncrement++;
		return new Account(idIncrement, 0);
	}
	
	public static Account creatAccount(int solde) {
		idIncrement++;
		return new Account(idIncrement, solde);
	}
	
	public static void initIdAccount() {
		idIncrement = 0;
	}
}
