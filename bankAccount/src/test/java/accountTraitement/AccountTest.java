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
		//initialisation id
		AccountFactory.initIdAccount();
		
		//first Account
		Account account_1 = AccountFactory.creatAccount();
		assertEquals(account_1.getIdAccount(), 1);
		
		//Second Account
		Account account_2 = AccountFactory.creatAccount();
		assertEquals(account_2.getIdAccount(), 2);
	}
	
	/* Create Account with solde */
	@Test
	public void CreateAccountWithSoldeTest() {
		
		//initialisation id
		AccountFactory.initIdAccount();
		
		// first Account
		Account accountSolde_1 = AccountFactory.creatAccount(1200);
		assertEquals(accountSolde_1.getIdAccount(), 1);
		assertEquals(accountSolde_1.getSolde(), 1200);
		
		// Second Account
		Account accountSolde_2 = AccountFactory.creatAccount(5000);
		assertEquals(accountSolde_2.getIdAccount(), 2);
		assertEquals(accountSolde_2.getSolde(), 5000);
	}

}
