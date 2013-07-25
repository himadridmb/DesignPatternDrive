package structural.pattern.facade;

public class FundsCheck {
	private double cashInAccount = 1000.00;
	public double getCashInAccount()
	{
		return this.cashInAccount;
	}
	
	public void decreaseCashInAccount(double cashwithdraw)
	{
		cashInAccount-= cashwithdraw;
	}
	
	public void increaseCashInAccount(double cashdeposit)
	{
		cashInAccount+= cashdeposit;
	}
	
	public boolean haveEnoughMoeny(double cashToWithdrawal)
	{
		if(cashToWithdrawal > cashInAccount)
		{
			System.out.println("Error, overflow");
			return false;
		}
		
		return true;
	}
	
	public void makeDeposit(double cashtodeposit)
	{
		increaseCashInAccount(cashtodeposit);
		System.out.println("Deposit complete, update balance = "+getCashInAccount());
	}
}
