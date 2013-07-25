package structural.pattern.facade;

public class AccountNumberCheck {
	private int accountNumber = 12345678;
	
	
	public AccountNumberCheck() {
		
	}
	
	public boolean accountActive(int accountNumCheck)
	{
		if(accountNumCheck == this.getAccountNumber())
		{
			return true;
		}
		
		return false;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

}
