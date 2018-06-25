package banqueAccount.bean;

import java.util.Date;

import banqueAccount.type.StatusOperation;
import banqueAccount.type.TypeOperation;
/**
 * class Operation
 * */
public class Operation {
	
	private int idOperation;
	private TypeOperation operationType;
	private Date operationDate;
	private int operationAmmount;
	private StatusOperation operationStatus;
	private int accountBalanceAfteOperation;
	
	/**
	 * @param idOperation
	 */
	public Operation(int idOperation) {
		super();
		this.idOperation = idOperation;
	}
	/**
	 * @param operationType
	 * @param operationDate
	 * @param operationAmmount
	 * @param operationStatus
	 * @param oldBalance
	 * @param newBalance
	 */
	public Operation(int idOperation, TypeOperation operationType, Date operationDate, int operationAmmount,
			StatusOperation operationStatus) {
		this.idOperation=idOperation;
		this.operationType = operationType;
		this.operationDate = operationDate;
		this.operationAmmount = operationAmmount;
		this.operationStatus = operationStatus;
	}
	
	public TypeOperation getOperationType() {
		return operationType;
	}
	public void setOperationType(TypeOperation operationType) {
		this.operationType = operationType;
	}
	public Date getOperationDate() {
		return operationDate;
	}
	public void setOperationDate(Date operationDate) {
		this.operationDate = operationDate;
	}
	public int getOperationAmmount() {
		return operationAmmount;
	}
	public void setOperationAmmount(int operationAmmount) {
		this.operationAmmount = operationAmmount;
	}
	public StatusOperation getOperationStatus() {
		return operationStatus;
	}
	public void setOperationStatus(StatusOperation operationStatus) {
		this.operationStatus = operationStatus;
	}
	public int getIdOperation() {
		return idOperation;
	}
	public void setIdOperation(int idOperation) {
		this.idOperation = idOperation;
	}

	public int getAccountBalanceAfteOperation() {
		return accountBalanceAfteOperation;
	}
	
	public void setAccountBalanceAfteOperation(int accountBalanceAfteOperation) {
		this.accountBalanceAfteOperation = accountBalanceAfteOperation;
	}
}
