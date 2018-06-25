package main;

import java.util.Date;

import banqueAccount.bean.Account;
import banqueAccount.bean.Operation;
import banqueAccount.factory.AccountFactory;
import banqueAccount.factory.OperationFactory;
import banqueAccount.type.TypeOperation;

public class BanqueAccountExecute {

	public static void main(String[] args) {
		
		//Create Account
		Account account = AccountFactory.creatAccount();
 		/*US1
		 * In order to save money
		 * As a bank client
		 * I want to make a deposit in my account
		 * */
		Operation depositOperation = OperationFactory.creatOperation();
		depositOperation.setOperationType(TypeOperation.Deposit);
		depositOperation.setOperationDate(new Date());
		depositOperation.setOperationAmmount(1000);
		account.addOperation(depositOperation);	
	}

}
