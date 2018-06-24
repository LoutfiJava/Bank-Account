package banqueAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import banqueAccount.factory.AccountFactory;
import bean.Account;


public class AccountTest {

	//First Test Create firstAccount
	@Test
	public void firstAccountCreateTest() {
				
		//first Account
		Account account_1 = AccountFactory.creatAccount();
		assertEquals(account_1.getIdAccount(), 1);
		
		//Second Account
		Account account_2 = AccountFactory.creatAccount();
		assertEquals(account_2.getIdAccount(), 2);
	}
}
