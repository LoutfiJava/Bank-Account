package accountTraitement;

import static org.junit.Assert.*;

import org.junit.Test;

import bankAccountKata.bean.Account;
import bankAccountKata.factory.AccountFactory;

public class AccountTest {

	/*
	 * Mon premier test à pour objectif de créer un nouveau Account et vérifier si le id 
	 * s'incrémente sans problème.
	 * */
	@Test
	public void firstAccountCreateTest() {
		//first Account
		Account account_1 = new AccountFactory().creatAccount();
		assertEquals(account_1.getIdAccount(), 1);
		
		//Second Account
		Account account_2 = new AccountFactory().creatAccount();
		assertEquals(account_2.getIdAccount(), 2);
	}

}
