package banqueAccount;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import banqueAccount.factory.AccountFactory;
import bean.Account;


public class AccountTest {

	//First Test Create firstAccount
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
	
	/*make a deposit operation*/
	@Test
	public void makeADepositInAccount() {
		//initialisation id
		AccountFactory.initIdAccount();
		Account accountOperation = AccountFactory.creatAccount();
		
		Operation depositOperation = OperationFactory.createOperation();
		depositOperation.setOperationType("Deposit");
		depositOperation.setDateOperation(new Date());
		depositOperation.setOperatioAmmount(100);
		
		accountOperation.getOperations().addOperation(depositOperation);
		
		
		
		
		
		
	}
	
	
	
}
