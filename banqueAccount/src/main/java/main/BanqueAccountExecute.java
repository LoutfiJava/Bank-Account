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
		
		/*US2
		 * In order to retrieve some or all of my savings
		 * As a bank client
		 * I want to make a withdrawal from my account
		 * */
		Operation withrawOperation = OperationFactory.creatOperation();
		withrawOperation.setOperationType(TypeOperation.Withraw);
		withrawOperation.setOperationDate(new Date());
		withrawOperation.setOperationAmmount(100);
		account.addOperation(withrawOperation);
		
		/*US3
		 * In order to check my operations
		 * As a bank client
		 * I want to see the history (operation, date, amount, balance) of my operations
		 * */
		for (int i = 0; i < account.getListOfOperations().size(); i++) {
			System.out.println("OperationId : "+account.getListOfOperations().get(i).getIdOperation()+" || "
					+ "Date of Operation : "+account.getListOfOperations().get(i).getOperationDate()+" || "
					+ "Type Operation : "+account.getListOfOperations().get(i).getOperationType()+" || "
					+ "Operation Amount : "+account.getListOfOperations().get(i).getOperationAmmount()+" || "
					+ "Account Balance : "+account.getBalance()+" || ");
			
		}
		
	}

}
