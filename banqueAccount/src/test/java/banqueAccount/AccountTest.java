package banqueAccount;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.Test;

import banqueAccount.bean.Account;
import banqueAccount.bean.Operation;
import banqueAccount.factory.AccountFactory;
import banqueAccount.factory.OperationFactory;
import banqueAccount.type.TypeOperation;


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
	
	/* Create Account with balance */
	@Test
	public void CreateAccountWithSoldeTest() {
		
		//initialisation id
		AccountFactory.initIdAccount();
		
		// first Account
		Account accountSolde_1 = AccountFactory.creatAccount(1200);
		assertEquals(accountSolde_1.getIdAccount(), 1);
		assertEquals(accountSolde_1.getBalance(), 1200);
		
		// Second Account
		Account accountSolde_2 = AccountFactory.creatAccount(5000);
		assertEquals(accountSolde_2.getIdAccount(), 2);
		assertEquals(accountSolde_2.getBalance(), 5000);
	}
	
	/*make a deposit operation*/
	@Test
	public void makeADepositInAccount() {
		//initialisation id
		AccountFactory.initIdAccount();
		OperationFactory.initIdOperation();
		
		//Create an account for deposite operation.
		Account accountOperation = AccountFactory.creatAccount();
		Operation depositOperation = OperationFactory.creatOperation();
		depositOperation.setOperationType(TypeOperation.Deposit);
		depositOperation.setOperationDate(new Date());
		depositOperation.setOperationAmmount(100);
		
		assertEquals(accountOperation.addOperation(depositOperation), 100);
		
	}
	
	
	
}
