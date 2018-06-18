package bankAccountKata.factory;

import bankAccountKata.bean.Account;

public class AccountFactory {

	private static int idIncrement;
	
	public static Account creatAccount() {
		idIncrement++;
		return new Account(idIncrement, 0);
	}
}
