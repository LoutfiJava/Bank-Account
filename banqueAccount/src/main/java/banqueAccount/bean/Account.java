package banqueAccount.bean;

import java.util.Set;

import banqueAccount.type.TypeOperation;

/**
 * 
 * @author Loutfi SGHIR
 * 
 * Class Account.
 *
 */
public class Account {

	int idAccount;
	int balance;
	Set<Operation> listOfOperations;

	public Account(int idAccount, int balance) {
		super();
		this.idAccount = idAccount;
		this.balance = balance;
	}
	
	public int getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Set<Operation> getListOfOperations() {
		return listOfOperations;
	}

	public void setListOfOperations(Set<Operation> listOfOperations) {
		this.listOfOperations = listOfOperations;
	}

	public int addOperation(Operation operation) {
		
		switch (operation.getOperationType()) {		
		case Deposit:
			if(operation.getOperationAmmount()<0) {
				System.out.println("the amount or balance is negative");
				return -1;
			}else {
				balance = balance+operation.getOperationAmmount();
				return balance;
			}
		case Withraw:
			if( Math.abs(operation.getOperationAmmount())>balance) {
				System.out.println("the amount or balance is negative");
				return -1;
			}else {
				balance = balance-Math.abs(operation.getOperationAmmount());
				return balance;
			}
		default:
			return 0;
		}
	}
}
