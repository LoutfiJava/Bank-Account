package banqueAccount.factory;

import banqueAccount.bean.Operation;

/**
 * 
 * 
 * @author Loutfi SGHIR
 * 
 * Factory of Operation.
 *
 */
public class OperationFactory {

private static int idIncrement;
	
	public static Operation creatOperation() {
		idIncrement++;
		return new Operation(idIncrement);
	}
	
	public static void initIdOperation() {
		idIncrement = 0;
	}
}
