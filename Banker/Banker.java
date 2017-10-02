import java.io.*;

public class Banker {
	private final float MIN_BALANCE = 1000.000f;
	private float amount;

	public Banker(float amount){
		this.amount = amount;
	} 

	public float credit(float amount){
		return this.amount + amount;
	}

	public float debit(float amount) throws NoBalanceException{
		if(MIN_BALANCE > this.amount-amount){
			throw new NoBalanceException("Insuffient balance", null);
		}else {
			return this.amount-amount;
		}
	}
}