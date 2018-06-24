package bean;

/**
 * 
 * @author Loutfi SGHIR
 * 
 * Class Account.
 *
 */
public class Account {

	int idAccount;
	int solde;
	
	
	public Account(int idAccount, int solde) {
		super();
		this.idAccount = idAccount;
		this.solde = solde;
	}
	
	public int getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}
	public int getSolde() {
		return solde;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}	
}
